import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid{
    public static void main(String[]args)throws FileNotFoundException{
	WorldGrid A = new WorldGrid();
	System.out.println(A.toString());
	A.importRoomsFromFile("Rooms.txt");
	System.out.println(A.toString());
	WorldGrid B = new WorldGrid(11, 11);
	System.out.println(B.toString());
	B.importRoomsFromFile("Rooms.txt");
	System.out.println(B.toString());
    }


    Random rand = new Random();
    private Object[][] rooms;
    

    public WorldGrid(){
	//standard dungeon has 25 rooms
	rooms = new Object[5][5];
	clear();
    }

    public WorldGrid(int rows, int cols){
	//user input size of dungeons
	rooms =  new Object[rows][cols];
	clear();
    }

    private void clear(){
	for(int i = 0 ; i < rooms.length;i++){
	    for(int a = 0; a < rooms[i].length;a++){
		rooms[i][a] = "";
	    }
	}
    }


    public String toString(){
	String answer = "";
	for(int i = 0; i < rooms.length; i++){
	    for(int a = 0; a < rooms[i].length;a++){
		answer += (String)(rooms[i][a]) + "BEEP";
	    }
	    answer += ":";
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
	    for(int a = 0; a < rooms[i].length;a++){
		if(where < allRooms.length){
		rooms[i][a] = allRooms[where];
		where ++;
		}
	    }
	}
    }
    


}