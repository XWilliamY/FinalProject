import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Room {
    private int ID;
    private String description;
    private String title;

    public Room(int ID, String title, String description){
	setID(ID);
	setDes(description);
	setTitle(title);
    }
    public void setTitle(String title){
	this.title = title;
    }

    public String getTitle(){
	return title;
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

    public  String getDes(){
	return description;
    }

    public static void main(String[]args)throws FileNotFoundException{
    	Room a = new Room(0, "hello", "what");
	Room b = new Room(1, "what","wat");
	System.out.println(a.getDes());
    	System.out.println(b.getDes());
    }
}