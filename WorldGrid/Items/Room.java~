import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Room{
    private int ID;
    private String description;

    public Room(){
    }

    public void setID(int x){
	ID = x;
    }

    public int getID(){
	return ID;
    }

    public void setDes()throws FileNotFoundException{
	File text = new File("RoomDescriptions.txt");
	Scanner sc = new Scanner(text);
	String all = "";
	while (sc.hasNext()){
	    all += sc.next() + " ";
	}
	String[] allDes = all.split("]]");
	description = allDes[ID];
    }

    public String getDes(){
	return description;
    }

    public static void main(String[]args)throws FileNotFoundException{
	Room a = new Room();
	a.setID(1);
	a.setDes();
	System.out.println(a.getDes());
	Room b = new Room();
	b.setID(0);
	b.setDes();
	System.out.println(b.getDes());
    }
}