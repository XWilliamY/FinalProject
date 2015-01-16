import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid3{

    public static void main(String[]args)throws FileNotFoundException{
	WorldGrid3 A = new WorldGrid3 ();
	//System.out.println(A.toString());
	System.out.println(A.getNameOfRoom(0));
    }


    Random rand = new Random();
    private Room [] rooms;
    private String[] allRooms;
    private int size;

    public void setSize(int size){
	this.size = size;
    }

    public int getSize(){
	return size;
    }

    public void importRoomsFromFile(String fileName) throws FileNotFoundException{

	File text = new File(fileName);
	Scanner sc = new Scanner(text);
	String allDescriptions = "";
	while(sc.hasNext()){
	    allDescriptions += sc.next() + " ";
	}

	allRooms = allDescriptions.split("]]");
	setSize(allRooms.length);
    }

    public void setUpRooms() throws FileNotFoundException{
	for(int i = 0; i < allRooms.length; i++){
	    String [] pieces = allRooms[i].split(":");
	    rooms[i] = new Room((Integer.parseInt(pieces[0])), pieces[1], pieces[2]);
	}
    }

    public WorldGrid3()throws FileNotFoundException{
	importRoomsFromFile("RoomDescriptions.txt");
	rooms = new Room [size];
    }

    public String toString(){
	String finalString = "";
	for (int i = 0; i < rooms.length; i++){
	    finalString += "[ ID: " + rooms[i].getID() + " Room: " + rooms[i].getTitle() + " Description: " + rooms[i].getDes() + " ]";
	}
	return finalString;
    }

    public String getNameOfRoom(int index){
	return rooms[index].getDes();
    }

    //toString() -> [1, "Bedroom, Description"], [2, "House", whatever]

}