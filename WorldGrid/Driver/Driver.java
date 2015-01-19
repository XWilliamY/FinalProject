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
	Explorer you = new Explorer();
	//sets up the explorer, you
	you.setLocation(0);
	System.out.println(getWhereIAm(you.getLocation()));
	//Distinguishes which map you are in
    }


    public boolean goWhere(String direction){
	direction.toLowerCase();
	if(direction.equals("north") || direction.equals("west") || direction.equals("go up")){
	    if((getLocation + 1) >= getSize()){
		System.out.println("How did you fall off the grid? I don't think there's anything beyond this room. Go back.");
		return false;
	    }
	    else{
		you.setLocation(you.getLocation() + 1);
		return true;
	    }
	}
	else if(direction.equals("south") || direction.equals("east") || direction.equals("go down")){
	    if((getLocation - 1) <= getSize()){
		System.out.println("How did you break the game? I don't think there's anything beyond the first point. Go back.");
		return false;
	    }
	    else{
		you.setLocation(you.getLocation() - 1);
		return true;
	    }
	}
	else{
	    System.out.println("Please enter north/west/go up to advance, south/east/go down to go back.");
	}
    }

    //goForward();
    //you advance one room

    //goBack();
    //you go back one room

    //the following code will be for modules and stuff 

}