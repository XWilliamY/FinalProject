import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Room{
    private int ID;
    private String description;
    private String [] RoomDescriptions;

    public Room(int ID){
	setID(ID);
	setDes(ID);
    }

    public void setID(int x){
	ID = x;
    }

    public int getID(){
	return ID;
    }

    public void importFromFile()throws FileNotFoundException{
	File text = new File("RoomDescriptions.txt");
	Scanner sc = new Scanner(text);
	String all = "";
	while (sc.hasNext()){
	    all += sc.next() + " ";
	}
	RoomDescriptions = all.split("]]");
    }

    public void setDes(int ID){
	description = RoomDescriptions[ID];
    }

    public String getDes(){
	return description;
    }

    public static void main(String[]args)throws FileNotFoundException{
	Room a = new Room(0);
	System.out.println(a.getDes());
	Room b = new Room(1);
	System.out.println(b.getDes());
    }
}