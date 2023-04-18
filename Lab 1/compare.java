
/*author: Future mulenga
purpose: Finds the longest string */


import java.util.*; // importing the scann libray 

public class Compare{
                   
                         
                   public static void main(String[] args){
                                           
                                      
                                           String word1 = "green";
                                           String word2= "country";
                                           String word3= "w3resource";

                                           //find the length of the words  
                                           int value1 = word1.length();
                                           int value2 = word2.length();
                                           int value3 = word3.length();

                                          
                                           //checks if the first word is the longest
                                            if(value2 > value1 && value2 > value3)
                                                  System.out.print(word1 + " " + "is the longest"); 


                                             //checks if the second word is the longest 
                                             if(value2 > value1 && value2 > value3){
                                                 
                                                     System.out.print(word2 + " " +"is the longest");

                                                   }
                                        

                                             //checks if the third word is the longest
                                             if(value3 > value1 && value3 > value2){
                                                 
                                                     System.out.print(word3 + " "+"is the longest");

                                                   }
                                            
                                          
                                          }
                                                        
                    
                   


                        }
 