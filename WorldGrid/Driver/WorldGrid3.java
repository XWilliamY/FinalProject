import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid3{

    public static void main(String[]args)throws FileNotFoundException{
	WorldGrid3 A = new WorldGrid3 ();
	//System.out.println(A.toString());
	int a = 3;
	System.out.println(A.getNameOfRoom(a));
	System.out.println(A.getDesOfRoom(a));
	a --;
	System.out.println(A.getNameOfRoom(a));
	System.out.println(A.getDesOfRoom(a));
	System.out.println(A.getWhereIAm(a));
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

    public void setUpRooms(Room [] array) throws FileNotFoundException{
	for(int i = 0; i < allRooms.length - 1; i++){
	    String [] pieces = allRooms[i].split(":");
	    array[i] = new Room(i, pieces[0], pieces[1]);
	}
    }

    public WorldGrid3()throws FileNotFoundException{
	importRoomsFromFile("RoomDescriptions.txt");
	rooms = new Room [size];
	setUpRooms(rooms);
    }

    public String toString(){
	String finalString = "";
	for (int i = 0; i < rooms.length; i++){
	    finalString += "[ ID: " + rooms[i].getID() + " Room: " + rooms[i].getTitle() + " Description: " + rooms[i].getDes() + " ]";
	}
	return finalString;
    }

    public String getNameOfRoom(int index){
	return rooms[index].getTitle();
    }

    public String getDesOfRoom(int index){
	return rooms[index].getDes();
    }

    public String getWhereIAm(int index){
	if(index < getSize()){
	    String here = "";
	    here += "Location: " + rooms[index].getTitle() + "\nDescription: " + rooms[index].getDes();
	    return here;
	}
	else{
	    return "You seem to be out of range. That's strange.";
	}
    }

}