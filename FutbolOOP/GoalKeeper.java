package SoccerPlayerHierarchy;

/*
* Author: Ilker Korkmaz
*/

public class GoalKeeper extends SoccerPlayer {
    private int numberOfInterceptedShotsAtGoal; // extra non-static data member

    public void setInterceptedShots(int numberOfInterceptions){
        if (numberOfInterceptions<0) {
            System.out.println("Invalid argument value!");
            numberOfInterceptions=0;
        }
        numberOfInterceptedShotsAtGoal=numberOfInterceptions;
    }
    public int getInterceptedShots() {
        return numberOfInterceptedShotsAtGoal;
    }
    public void keepTheShot() {
        System.out.println(getName() + " kept the shot and prevented the opposing team from scoring.");
        numberOfInterceptedShotsAtGoal++;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Number of Intercepted Shots at Goal: " + numberOfInterceptedShotsAtGoal);
    }
    public GoalKeeper() { // constructor with no parameters
        super(); // not necessary to write explicitly; it could be called implicitly
        setInterceptedShots(0);
    }
    public GoalKeeper(String myName, int myNo, int myNumberOfInterceptions) { // constructor with 3 parameters
        super(myName, myNo);
        setInterceptedShots(myNumberOfInterceptions);
    }
    public GoalKeeper(GoalKeeper gkToCopy) { // copy constructor
        super(gkToCopy);
        setInterceptedShots(gkToCopy.getInterceptedShots());
    }
} // end of class GoalKeeper