import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Game{
    public static void main(String[]args)throws FileNotFoundException{
	System.out.println("Welcome to the game, Escape the House!\nYour goal is to obviously escape the house using objects that you pick up. You can go from room to room inputing commands such as 'go right' or 'go left'. You can closely look at stuff with the 'look at' command. You can pick up stuff and and them to your inventory with the 'pick up' command. The game will let you know if you can't pick up something.\n");

	WorldGrid3 a = new WorldGrid3();
	Explorer you = new Explorer();
	System.out.println(you.getWhereIAm(a.rooms));
	Scanner command = new Scanner(System.in);
	boolean keepgoing = true;
	while (keepgoing){
	    if (command.next().equals("go")){
		String where = command.next();
		if (where.equals("right")){
		    you.goRight(a.rooms);
		} else if (where.equals("left")){
			you.goLeft(a.rooms);
		} else {
		    System.out.println("Whoops, can't go there.");
		}
	    } else if (command.next().equals("pick up")){
		String what = command.next();
		if (what.equals("key")){
		    System.out.println("What type of key?");
		}
		you.add(what);
	    }
	    //finish up the game
	    //by accounting for other types of commands
	}
	     
	
    }
}
