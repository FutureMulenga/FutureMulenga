public class studentpoll {



    public static void main (String[] Args)
    {
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];//array of frequency counters
        
        for(int answer = 0; answer < responses.length; answer++)
        {
            try{
                ++frequency[responses[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                char[] e;
                System.out.println(e);
                System.outprintf(" responses[%d] = %d%n%n", answer, responses[[answer]]);
            }
        }
        System.out.printf("%6d%10d%n",rating, frequency);
    }
    
}
