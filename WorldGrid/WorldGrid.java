import java.util.*;

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
    }

    public WorldGrid(int x, int y){
	//user input
	rooms =  new Object[y][x];
    }

    public WorldGrid( boolean randomize, int minSize, int maxSize){
	//randomize, given minimum and maximum size 
	int y = rand.nextInt(maxSize - minSize) + minSize;
	int x = rand.nextInt(maxSize - minSize) + minSize;
	rooms = new Object[y][x];
    }

    public String toString(){
	String answer = "";
	for(int i = 0; i < rooms.length; i++){
	    answer += rooms[i] + ":";
	    for(int a = 0; a < rooms[i].length;a++){
		answer += (String)(rooms[i][a]) + " ";
	    }
	}
	return answer;
    }
}