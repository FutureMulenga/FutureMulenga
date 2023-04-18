import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirlineReservationSystemTest {

    private InputStream stdin;
    
    @Before
    public void setUp() {
        // Save the standard input stream
        stdin = System.in;
    }
    
    @After
    public void tearDown() {
        // Restore the standard input stream
        System.setIn(stdin);
    }
    
    @Test
    public void testAssignFirstClassSeat() {
        AirlineReservationSystem.seats = new boolean[]{false, false, false, false, false, true, true, true, true, true};
        int seatNumber = AirlineReservationSystem.assignFirstClassSeat();
        assertEquals(-1, seatNumber);
        
        AirlineReservationSystem.seats = new boolean[]{false, true, true, false, false, true, true, true, true, true};
        seatNumber = AirlineReservationSystem.assignFirstClassSeat();
        assertEquals(0, seatNumber);
    }
    
    @Test
    public void testAssignEconomySeat() {
        AirlineReservationSystem.seats = new boolean[]{true, true, true, true, true, false, false, false, false, false};
        int seatNumber = AirlineReservationSystem.assignEconomySeat();
        assertEquals(-1, seatNumber);
        
        AirlineReservationSystem.seats = new boolean[]{true, true, true, true, true, false, false, false, true, false};
        seatNumber = AirlineReservationSystem.assignEconomySeat();
        assertEquals(6, seatNumber);
    }
    
    @Test
    public void testGetSeatType() {
        // Simulate user input
        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        int seatType = AirlineReservationSystem.getSeatType();
        assertEquals(1, seatType);
        
        System.setIn(new ByteArrayInputStream("2\n".getBytes()));
        seatType = AirlineReservationSystem.getSeatType();
        assertEquals(2, seatType);
    }
    

    @Test
    public void testAssignSeat() {
        AirlineReservationSystem.seats = new boolean[]{false, false, false, false, false, false, false, false, false, false};
        
        // Test assigning a first class seat when first class is available
        int seatNumber = AirlineReservationSystem.assignSeat(1);
        assertEquals(0, seatNumber);
        
        // Test assigning an economy seat when economy is available
        seatNumber = AirlineReservationSystem.assignSeat(2);
        assertEquals(5, seatNumber);
        
        // Test assigning a first class seat when first class is full, but economy is available
        AirlineReservationSystem.seats = new boolean[]{true, true, true, true, true, false, false, false, false, false};
        seatNumber = AirlineReservationSystem.assignSeat(1);
        assertEquals(-1, seatNumber);
        assertEquals(true, AirlineReservationSystem.seats[5]);
        
        // Test assigning an economy seat when economy is full, but first class is available
        AirlineReservationSystem.seats = new boolean[]{true, true, true, true, true, false, false, false, false, false};
        seatNumber = AirlineReservationSystem.assignSeat(2);
        assertEquals(0, seatNumber);
        assertEquals(true, AirlineReservationSystem.seats[0]);
    }
}
