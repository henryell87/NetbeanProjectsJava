/*
 * Copyright 2016 henryellbytes
 */
package hangmanapplication;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HENRYELL
 */
public class HangmanApplication {

    /**...........
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will piCk a word and you will try to guess it character"
                + " by character."
                +" If you guess wrong 6 times, then I win. \n If you guess it before then, you win."
                +"Are you redy? I hope so because I am");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below "
                  +"that is your current guess, whichh starts off as nothing.\n Every time you "
                  +"guess incorrectly. I add a body part to the picture. When there is a full"
                  +" person, you lose"); 
        // Allows for multiple games
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay){
             // Setting up the game
            System.out.println();
            System.out.println("Alright! Let's play!");
            
            Hangman game = new Hangman();
         
            do{
                // Draw the things...
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();
                
                // Get the guess
                System.out.println("Enter a character that you think is in the word");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();
                
                //Check if the character is guessed already
                while(game.isGuessedAlready(guess)){
                    System.out.println("Try agian! You've already guessed that character.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }
                // Play the guess
                if(game.playGuess(guess)){
                    System.out.println("Great guess! That character is in the word!");  
                }else{
                    System.out.println("Unfortunantely the character isn't in the word");
                }
            }
            
            
        while(!game.gameOver());
            // Playing the game
            
       
        System.out.println();
        System.out.println("Do you want to play another game? Enter Y if you do.");
        Character response = (sc.next().toUpperCase()).charAt(0);
        doYouWantToPlay = (response == 'Y');
    }
    }
    
}
