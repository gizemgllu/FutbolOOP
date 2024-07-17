package SoccerPlayerHierarchy;

/*
* Author: Ilker Korkmaz
*/

public class Striker extends SoccerPlayer {
    private int numberOfGoals;
    private int numberOfAssists;

    public void setGoals(int goalNumber){
        if (goalNumber<0) {
            System.out.println("Invalid argument value!");
            goalNumber=0;
        }
        numberOfGoals=goalNumber;
    }
    public int getGoals() {
        return numberOfGoals;
    }
    public void setAssists(int assistNumber){
        if (assistNumber<0) {
            System.out.println("Invalid argument value!");
            assistNumber=0;
        }
        numberOfAssists=assistNumber;
    }
    public int getAssists() {
        return numberOfAssists;
    }
    public void makeAScore() {
        System.out.println(getName() + " made a fantastic shot.");
        numberOfGoals++;
    }
    public void makeAnAssist() {
        System.out.println(getName() + " made a fantastic assist.");
        numberOfAssists++;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Number of Goals   : " + numberOfGoals);
        System.out.println("Number of Assists : " + numberOfAssists);
    }
    public Striker() { // constructor with no parameters
        super();
        setGoals(0);
        setAssists(0);
    }
    public Striker(String myName, int myNo, int goalNum, int assistNum) { // constructor with 4 parameters
        super(myName, myNo);
        setGoals(goalNum);
        setAssists(assistNum);
    }
    public Striker(Striker sToCopy) { // copy constructor
        super(sToCopy);
        setGoals(sToCopy.getGoals());
        setAssists(sToCopy.getAssists());
    }
} // end of class Striker