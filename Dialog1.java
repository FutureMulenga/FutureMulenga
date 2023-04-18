import javax.swing.JOptionPane;
public class Dialog1 {

        
        public static void main(String[] args)
        {
           // JOptionPane.showMessageDialog(null,"welcome to java");
            String name =JOptionPane.showInputDialog("Enter your name: ");
            
            String message = String.format("welcome %S to java programing ",name);
            JOptionPane.showMessageDialog(null, message);
        
        }

    



    
}
 