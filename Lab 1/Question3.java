
/*Author:: Future Mulenga
  Purpose:: This program is used to determine the word which is longest than other given words */


  import java.util.*; //importing scan libary

public class Question3{

    public static void main(String[] args){
         
        Scanner sc= new Scanner(System.in);
        
        //menu for dictionaries
        System.out.print("1. Dictionary_one "+"\n" + "2. Dictionary_two\n\n");

        System.out.print("Select dictionary: ");
        int number = sc.nextInt();

        if(number==1)
            dictionary1();
        
        else if(number==2)
           dictionary2();

        else{
            System.out.print("invalid option");
            
        }
    }

     
//this method determines the longest word in the first dictionary
    public static void dictionary1(){
           
        String words[] = {"coutry", "green", "w3resource"};
        String longWord = words[0];
        int next_char =0;
        int SingleChar;

        for(int j=0; j<longWord.length(); j++)
        { 
            SingleChar = longWord.charAt(j);
            if((SingleChar >=97 && SingleChar <=122) || (SingleChar >=65 && SingleChar <=90)) 
            {
                next_char++;  
            }
        }

// iterate through the loop to check the longest word in the array or dictionary 
        for(int i=0; i<words.length; i++)
        {
            if(  words[i].length() > next_char)
                {
                    longWord = words[i];
                }
        }
        System.out.print("The longest word is " + longWord);

     }

        
    
    //Determine the longest word in the second dictionary 
    public static void dictionary2(){
                     
             String words[]={"cat","dog","is", "red", "a0./m"};
             String longWord =  words[0];
             
             int next_char =0;
             int SingleChar;


             for(int j=0; j<longWord.length(); j++)
        { 
            SingleChar = longWord.charAt(j);
            if((SingleChar >=97 && SingleChar <=122) || (SingleChar >=65 && SingleChar <=90)) 
            {
                ++next_char;  
            }
        }

             for (int i=0; i<words.length; i++) 
             {
                    if(next_char == words[i].length())
                    {
                        System.out.print(words[i] + "\n");
                    } 

             }
         
    }
}
     
    

