import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver extends WorldGrid3{
    public static void main(String[]args) throws FileNotFoundException{
	Driver C = new Driver();
    }

    public Driver() throws FileNotFoundException{
	Room A = new Room(0, getNameOfRoom(0), getDesOfRoom(0));
	//sets up the first room you'll be in 
	//sets up the explorer, you
	you.setLocation(0);
	goForward();
	goBackward();
	goForward();
	//Distinguishes which map you are in
    }

    Explorer you = new Explorer();

    //go forward command
    public boolean goForward(){
	//if adding one to location is still within the grid then do it
	if((you.getLocation() + 1) >= getSize()-1){
	    System.out.println("There's nothing beyond this point. You should go back.");
	    return false;
	}
	else{
	    you.setLocation(you.getLocation() + 1);
	    System.out.println(getWhereIAm(you.getLocation()));
	    return true;
	}
    }
	//else return false and maybe something like "There's nothing beyond this point. You should go back."


    public boolean goBackward(){
	if((you.getLocation() - 1) < 0){
	    System.out.println("There's nothing beyond this point. Why are you still at the starting point anyways? You should move forward.");
	    return false;
	}
	else{
	    you.setLocation(you.getLocation() - 1);
	    System.out.println(getWhereIAm(you.getLocation()));
	    return true;
	}
    }

	//if substracting one to location is still within the grid then do it
	//else return false and maybe something like "There's nothing beyond this point. You should go back."

}