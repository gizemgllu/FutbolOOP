package SoccerPlayerHierarchy;

/*
* Author: Ilker Korkmaz
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Here are some tests...");
        System.out.println();

        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        SoccerPlayer spReference = new SoccerPlayer("Lionel Messi", 10);
        spReference.print();

        System.out.println();
        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        GoalKeeper gkReference = new GoalKeeper("Manuel Neuer", 1, 21);
        gkReference.print();

        System.out.println();
        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        GoalKeeper gkSecondReference = new GoalKeeper(gkReference);
        gkSecondReference.print();

        System.out.println();
        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        Striker strReference = new Striker("Cristiano Ronaldo", 7, 25, 11);
        strReference.print();

        System.out.println();
        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        Striker strSecondReference = new Striker(strReference);
        strSecondReference.print();

        System.out.println();
        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        gkReference.keepTheShot();
        gkReference.keepTheShot();
        gkReference.print();
        System.out.println();
        strReference.makeAnAssist();
        strReference.makeAScore();
        strReference.makeAnAssist();
        strReference.makeAScore();
        strReference.makeAScore();
        strReference.makeAScore();
        strReference.print();
        System.out.println();

        System.out.println("Let's use menu to create new player...");
        Scanner scan = new Scanner(System.in);
        String tempName;
        int tempShirtNumber;
        SoccerPlayer playerReference;
        boolean checkPoint = true;
        while(checkPoint) {
            menu();
            int choice;
            choice = scan.nextInt();
            scan.nextLine(); // to flush the pipe (to clean '\n')
            switch (choice) {
                case 1:
                    System.out.print("Enter the player's name: ");
                    tempName = scan.nextLine();
                    System.out.print("Enter the player's shirt number to wear: ");
                    tempShirtNumber = scan.nextInt();
                    scan.nextLine(); // to flush the pipe (to clean '\n')
                    playerReference = new SoccerPlayer(tempName, tempShirtNumber);
                    playerReference.print();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter the player's name: ");
                    tempName = scan.nextLine();
                    System.out.print("Enter the player's shirt number to wear: ");
                    tempShirtNumber = scan.nextInt();
                    scan.nextLine(); // to flush the pipe (to clean '\n')
                    playerReference = new GoalKeeper(tempName, tempShirtNumber, 0);
                    playerReference.print();
                    System.out.println();
                    // playerReference.keepTheShot();  // ERROR !
                    // How can we call a "derived class method" using a "base class reference" ?
                    break;
                case 3:
                    System.out.print("Enter the player's name: ");
                    tempName = scan.nextLine();
                    System.out.print("Enter the player's shirt number to wear: ");
                    tempShirtNumber = scan.nextInt();
                    scan.nextLine(); // to flush the pipe (to clean '\n')
                    playerReference = new Striker(tempName, tempShirtNumber, 0, 0);
                    playerReference.print();
                    System.out.println();
                    // playerReference.makeAScore()    // ERROR !
                    // How can we call a "derived class method" using a "base class reference" ?
                    break;
                default:
                    System.out.println("The program quits within a second!");
                    checkPoint = false;
            }
        }
    } // end of main

    public static void menu() {
        System.out.println("Enter 1 to create a SoccerPlayer");
        System.out.println("Enter 2 to create a GoalKeeper");
        System.out.println("Enter 3 to create a Striker");
        System.out.println("Enter any other key to terminate the program");
    } // end of menu
} // end of class Test