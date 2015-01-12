import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid{
    public static void main(String[]args)throws FileNotFoundException{
	WorldGrid A = new WorldGrid();
	System.out.println(A.toString());
	A.importRoomsFromFile("Rooms.txt");
	System.out.println(A.toString());
	WorldGrid B = new WorldGrid(121);
	System.out.println(B.toString());
	B.importRoomsFromFile("Rooms.txt");
	System.out.println(B.toString());
	System.out.println(A.size());
    }


    Random rand = new Random();
    private Object [] rooms;
    int size;
    

    public WorldGrid(){
	//standard dungeon has 25 rooms
	rooms = new Object[25];
	clear();
	size = 25;
    }

    public WorldGrid(int size){
	//user input size of dungeons
	rooms =  new Object[size];
	clear();
	this.size = size;
    }

    public int size(){
	return size;
    }

    private void clear(){
	for(int i = 0 ; i < rooms.length;i++){
	    rooms[i] = "";
	}
    }
    


    public String toString(){
	String answer = "";
	for(int i = 0; i < rooms.length; i++){
	    answer += (String)(rooms[i]) + "BEEP";
	}
	return answer;
    }

    //following code imports information from Rooms.txt
    //Rooms.txt contains descriptions of all rooms 
    public void importRoomsFromFile(String fileName) throws FileNotFoundException{
	clear();
	File text = new File(fileName);
	Scanner sc = new Scanner(text);
	String allPhrases = "";
	while(sc.hasNext()){
	    allPhrases += sc.next() + " ";
	}
	String[] allRooms = allPhrases.split("]]");
    
	int where = 0;
	for(int i = 0; i < rooms.length; i++){
	    if(where < allRooms.length){
		rooms[i] = allRooms[where];
		where ++;
	    }
	}
    }
}



