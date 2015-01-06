import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid{
    public static void main(String[]args){
	WorldGrid A = new WorldGrid();
	System.out.println(A.toString());
    }


    Random rand = new Random();
    private Object[][] rooms;

    public WorldGrid(){
	//standard dungeon has 25 rooms
	rooms = new Object[5][5];
	clear();
    }

    public WorldGrid(int rows, int cols){
	//user input
	rooms =  new Object[rows][cols];
	clear();
    }

    public WorldGrid( boolean randomize, int minSize, int maxSize){
	//randomize, given minimum and maximum size 
	int y = rand.nextInt(maxSize - minSize) + minSize;
	int x = rand.nextInt(maxSize - minSize) + minSize;
	rooms = new Object[y][x];
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
	    answer += ":";
	    for(int a = 0; a < rooms[i].length;a++){
		answer += (String)(rooms[i][a]) + " ";
	    }
	    answer += ":";
	}
	return answer;
    }

    public void fill(){
    }

}