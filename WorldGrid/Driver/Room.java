import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Room {
    private int ID;
    private String description;
    private String title;
    private String items;

    public Room(int ID, String title, String description, String list){
	setID(ID);
	setDes(description);
	setTitle(title);
	setItems(list);
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

    public String getDes(){
	return description;
    }

    public void setItems(String list){
	items = list;
    }

    public String getItems(){
	return items;
    }

    // public static void main(String[]args)throws FileNotFoundException{
    // 	Room a = new Room(0, "hello", "what");
    // 	Room b = new Room(1, "what","wat");
    // 	System.out.println(a.getDes());
    // 	System.out.println(b.getDes());
    // }
}
