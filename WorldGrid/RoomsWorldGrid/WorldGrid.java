import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid extends Room{
    public static void main(String[]args)throws FileNotFoundException{
	WorldGrid A = new WorldGrid();
	System.out.println(A.toString());
    }


    Random rand = new Random();
    private Object[] allRooms; //contains all rooms
    private Object [] rooms; //size of worldgrid
    int size;
    

    public WorldGrid(){
	//standard dungeon has 25 rooms
	rooms = new Room[25];
	clear();
	size = 25;
    }

    public WorldGrid(int size){
	//user input size of dungeons
	rooms =  new Room[size];
	clear();
	this.size = size;
    }

    private void clear(){
	for(int i = 0 ; i < rooms.length;i++){
	    rooms[i] = "";
	}
    }
    


    public String toString(){
	String answer = "";
	for(int i = 0; i < rooms.length; i++){
	    answer = rooms[i] + " BEEP ";
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
	String[] temp = allPhrases.split("]]");
	
	int where = 0;
	for(int i = 0; i < temp.length; i++){
	    if(where < allRooms.length){
		allRooms[i] = temp[where];
		where ++;
	    }
	}
    }
}



