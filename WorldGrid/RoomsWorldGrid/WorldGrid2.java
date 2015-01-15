import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid2{
    public static void main(String[]args) throws FileNotFoundException{
	WorldGrid2 A = new WorldGrid2();
	System.out.println(A.getRoom(0));
	System.out.println(A.getSize());
	//System.out.println(A.getRoom(0));
	
    }

    Random rand = new Random();
    private String[] allRooms; //contains all rooms
    private Room [] rooms; //size of worldgrid
    int size;

    //constructors store descriptions
    public WorldGrid2()throws FileNotFoundException{
	importRoomsFromFile("RoomDescriptions.txt");
	rooms = new Room [size]; 
	//make rooms based on text file
	//initialize each room based on text file 
    }

    //the user shouldn't be able to manipulate the size of the array
    //this is for the program to adapt based on how many rooms are available
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
	int howMany = 0;
	while(sc.hasNext()){
	    allDescriptions += sc.next() + " ";
	}

	allRooms = allDescriptions.split("]]"); // store all to allRooms
	//previous line of code also conveniently "clears" allRooms
	size = allRooms.length;
	//new size of MAP should reflect new size of allRooms
	//or parseint first line
    }

    //Object [] rooms will be an array consisting of rooms
    //[room1, room2, room3, room4, room5]
    //calling on room1 will bring up room 1's description and stuff 

    //Room[i] = new Room(id and description)
    public void setUpRooms()throws FileNotFoundException{
	for(int i =0; i < getSize(); i++){
	    rooms[i] = new Room(i, getDescription(i));
	    //rooms = [contains a room with ID 0, desc at 0], [contains a room with ID 1, desc at 1]...
	}
    }
    
    public String getRoomDes(int ID){
	rooms[ID].getDes();
    }


}