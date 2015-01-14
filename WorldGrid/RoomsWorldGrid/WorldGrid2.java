import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid2{
    public static void main(String[]args) throws FileNotFoundException{
	WorldGrid2 A = new WorldGrid2();
	System.out.println(A.getRoom(0));
	
	
    }

    Random rand = new Random();
    private String[] allRooms; //contains all rooms
    private Object [] rooms; //size of worldgrid
    int size;

    //constructors store descriptions
    public WorldGrid2()throws FileNotFoundException{
	setSize(25);
	rooms = new Object [25]; 
	importRoomsFromFile("RoomDescriptions.txt");
    }

    public WorldGrid2(int size)throws FileNotFoundException{
	setSize(size);
	rooms = new Object [size];
	importRoomsFromFile("RoomDescriptions.txt");
    }

    //so size is malleable
    public void setSize(int size){
	this.size = size;
    }

    public int getSize(){
	return size;
    }

    //input room descriptions to file
    public void importRoomsFromFile(String fileName) throws FileNotFoundException{
	File text = new File(fileName);
	Scanner sc = new Scanner(text);
	String allDescriptions = "";
	while(sc.hasNext()){
	    allDescriptions += sc.next() + " ";
	}

	allRooms = allDescriptions.split("]]"); // store all to allRooms
	
    }

    //get specific room at x index
    public String getRoom(int ID){
	return allRooms[ID];
    }




}