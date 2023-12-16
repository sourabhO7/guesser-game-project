package guesserGame;

import java.util.Scanner;

class Guesser{
    int guesserNum;

    public int guessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guesser number :: ");
        guesserNum = sc.nextInt();
        return guesserNum;
    }
}

class Player{
    int guessPlayerNum;

    public int guessNum(){
        Scanner sc = new Scanner(System.in);
        guessPlayerNum = sc.nextInt();
        return guessPlayerNum;
    }
}

class Umpire{
    int guesserNum;
    int guessPlayerNum1;
    int guessPlayerNum2;
    int guessPlayerNum3;

    public void getGuesserNum(){
        Guesser guesser = new Guesser();
        guesserNum = guesser.guessNum();
    }

    public void getPlayerNum(){
        Player player1 = new Player();
        System.out.println("Enter the player1 number :: ");
        guessPlayerNum1 = player1.guessNum();
        Player player2 = new Player();
        System.out.println("Enter the player2 number :: ");
        guessPlayerNum2 = player2.guessNum();
        Player player3 = new Player();
        System.out.println("Enter the player3 number :: ");
        guessPlayerNum3 = player3.guessNum();
    }

    public void compareNum(){
        if(guesserNum == guessPlayerNum1){
            if(guesserNum == guessPlayerNum2 && guesserNum == guessPlayerNum3){
                System.out.println("All player has guessed the right number");
            }else if(guesserNum == guessPlayerNum2){
                System.out.println("Player 1 and 2 has guessed the right number");
            }else if(guesserNum == guessPlayerNum3){
                System.out.println("Player 1 and 3 has guessed the right number");
            }else{
                System.out.println("Player 1 has guessed the right number");
            }
        }else if (guesserNum == guessPlayerNum2){
            if(guesserNum == guessPlayerNum3){
                System.out.println("Player 2 and 3 has guessed the right number");
            }else{
                System.out.println("Player 2 has guessed the right number");
            }
        }else if(guesserNum == guessPlayerNum3){
            System.out.println("Player 3 has guessed the right number");
        }else{
            System.out.println("All player has lost the game");
        }
    }
}

public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("+++++++++++LET'S GAME BEGIN+++++++++++");
        Umpire umpire = new Umpire();
        umpire.getGuesserNum();
        umpire.getPlayerNum();
        umpire.compareNum();
        System.out.println("+++++++++++GAME OVER+++++++++++");
    }
}
