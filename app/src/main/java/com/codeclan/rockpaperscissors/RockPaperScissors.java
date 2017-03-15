package com.codeclan.rockpaperscissors;


import android.util.Log;

import java.util.Random;

/**
 * Created by user on 15/03/2017.
 */

public class RockPaperScissors {

    int computerWins;
    int playerWins;

    public RockPaperScissors(){
        this.computerWins = 0;
        this.playerWins = 0;
    }

   public String computerChoice(){
       String[] choices = new String[3];
       choices[0] = "rock";
       choices[1] = "paper";
       choices[2] = "scissors";

       int randomIndex = new Random().nextInt(choices.length);
       String computerChoice = choices[randomIndex];

       return computerChoice;

   }

   public String compareHands(String playerChoice) {

       String computer = computerChoice();
       String result = "";

//       best practice to use .equals rather than == as this may not always work. So, if playerChoice.equals("rock") && computer.equals("rock") || return "it's a draw"

       switch (playerChoice) {
           case "rock":
               if (computer == "scissors") {
                   result = "Player wins!";
                   playerWins++;
               } else {
                   result = "Computer wins =(";
                   computerWins++;
               } break;
//
           case "scissors":
               if (computer == "paper") {
                   result = "Player wins!";
                   playerWins++;
               } else {
                   result = "Computer wins =( ";
                   computerWins++;
               } break;
//
           case "paper":
               if (computer == "rock") {
                   result = "Player wins!";
                   playerWins++;
               } else {
                   result = "Computer wins =(";
                   computerWins++;
               } break;
//
       }
       if (computer == playerChoice) {
           result = "It's a draw!!";
       }
       return result + "\nComputer chose: " + computer + "\nYou chose: " + playerChoice;
   }

   public String runningTotal(){
       return "You: " + playerWins + "\nComputer: " + computerWins;

   }

}
