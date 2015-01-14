import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid2{
    public static void main(String[]args) throws FileNotFoundException{
	WorldGrid2 A = new WorldGrid2();
	A.importRoomsFromFile("RoomDescriptions.txt");
	System.out.println(A.getRoom(0));
	
	
    }

    Random rand = new Random();
    private String[] allRooms; //contains all rooms
    private Room [] rooms; //size of worldgrid
    int size;

    //constructors store descriptions
    public WorldGrid2()throws FileNotFoundException{
	setSize(25);
	rooms = new Object [25]; 
	//make rooms based on text file
	//initialize each room based on text file 
    }

    public WorldGrid2(int size)throws FileNotFoundException{
	setSize(size);
	rooms = new Object [size];
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
	System.out.println("yes");
	
    }


    //Object [] rooms will be an array consisting of rooms
    //[room1, room2, room3, room4, room5]
    //calling on room1 will bring up room 1's description and stuff 


    //get specific room at x index
    public String getRoom(int ID){
	return allRooms[ID];
    }




}