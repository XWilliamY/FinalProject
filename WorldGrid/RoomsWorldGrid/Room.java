import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Room extends WorldGrid2 {
    private int ID;
    private String description;

    public Room(int ID, String description)throws FileNotFoundException{
	setID(ID);
	setDes(description);
    }

    public void setID(int x){
	ID = x;
    }

    public int getID(){
	return ID;
    }

    public void setDes(String description){
	this.description = description; 
    }

    public String getDes(){
	return description;
    }

    public static void main(String[]args)throws FileNotFoundException{
    	Room a = new Room(0, "hello");
	Room b = new Room(1, "what");
	System.out.println(a.getDes());
    	System.out.println(b.getDes());
    }
}