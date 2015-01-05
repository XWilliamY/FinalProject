import java.util.*;

public class WorldGrid{
    public static void main(String[]args){
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
}