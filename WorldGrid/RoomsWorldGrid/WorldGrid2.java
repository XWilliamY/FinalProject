import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid2{
    public static void main(String[]args) throws FileNotFoundException{
	WorldGrid2 A = new WorldGrid2();
	A.importRoomsFromFile("RoomDescriptions.txt");
	System.out.println(A.toString());
    }

    Random rand = new Random();
    private String[] allRooms; //contains all rooms
    private Object [] rooms; //size of worldgrid

    //input room descriptions to file
    public void importRoomsFromFile(String fileName) throws FileNotFoundException{
	file text = new File(fileName);
	Scanner sc = new Scanner(text);
	String allDescriptions = "";
	while(sc.hasNext()){
	    allDescriptions += sc.next() + " ";
	}

	allRooms = allDescriptions.split("]]"); // store all to allRooms
    }

    public String getRoom(int ID){
	return allRooms[ID];
    }

}