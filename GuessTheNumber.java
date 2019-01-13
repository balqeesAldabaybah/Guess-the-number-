/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;
import  java.util.Scanner;

/**
 *
 * @author Balqees
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    
    static int get_random(){
        return (int) (Math.random());
    }
    
    static boolean compare(int user, int comp){
        if(user!=comp){
            return false;
        }
        else
        {
            return true;
        }
    }
    static void hint(int user, int comp){
        if(user-comp > 0 && user>comp*2){
            System.out.println("The number you guessed is too high");
        }
        if(user-comp<0 && user<comp*2){
            System.out.println("The number you guessed is too low");
        }
        if(user-comp == 0)
        {
            System.out.println("Flip the sign");
        }
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // TODO code application logic here
        int play=1;
        int user;
        int comp;
        int tryAgain = 1 ;
        while(play ==1){
            comp= get_random();
            System.out.println("guess the number : ");
            user = reader.nextInt();
            boolean guess = compare(user, comp);
            if(guess){
                System.out.println("You guess the number, it was :"+comp);
            }else{
                do{
                    hint(user,comp);
                    System.out.println(" wanna guess again? enter 1 for yes, 0 for no");
                    tryAgain = reader.nextInt();
                    if(tryAgain==0) break;
                     
                   
                    System.out.println("guess the number again : ");
                    user = reader.nextInt();
                    
                    guess = compare(user, comp);
                    if(guess){
                        System.out.println("You guess the number, it was :"+comp);
                        break;
                    }else
                    {
                         System.out.println("wrong guess");
                    }
                }while(tryAgain == 1);     
                
            }
            System.out.println("wanna play again ? 1 for yes, 0 for no ");
            play = reader.nextInt();
            
        }
        System.out.println("program end");
    }
    
}
