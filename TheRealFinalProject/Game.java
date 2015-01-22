import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Game{
    public static void main(String[]args)throws FileNotFoundException{
	System.out.println("Welcome to the game, Escape the House!\nYour goal is to obviously escape the house using objects that you pick up. You can go from room to room inputing commands such as 'go right' or 'go left'. You can closely look at stuff with the 'look at' command. You can pick up stuff and and them to your inventory with the 'pick up' command. Key objects will be capitalized.\n");

	WorldGrid3 a = new WorldGrid3();
	Explorer you = new Explorer();
	System.out.println(you.getWhereIAm(a.rooms));
	Scanner command = new Scanner(System.in);
	boolean keepgoing = true;
	while (keepgoing){ 
	    String com = command.nextLine();
	    Scanner scan = new Scanner(com);
	    String firstword = scan.next();
	    if (firstword.equals("go")){
		String where = scan.next();
		if (where.equals("right")){
		    if (you.has(1) && you.getLocation()==4){
			a.rooms[5].setDes("Woah! The amulet caused a secret door to open to your right. There's a flight of stairs that lead up.");
		    }
		    you.goRight(a.rooms);
		} else if (where.equals("left")){
			you.goLeft(a.rooms);
		} else {
		    System.out.println("Whoops, can't go there.");
		}
	    } else if (firstword.equals("pick") && scan.next().equals("up")){
		String what = scan.next();
		if (what.equals("key")){
		    System.out.println("What type of key?");
		}
		else {
		    you.add(what);
		}
	    } else if (firstword.equals("look") && scan.next().equals("at")){
		String thing = scan.next();
		if (thing.equals("door")){
		    System.out.println("It's just door that you really want to get through.");
		} else if (thing.equals("chest")){
		    if (you.has(4)){
			System.out.println("Enter the passcode");
			if (command.nextLine().equals("9177479205")){
			    System.out.println("The chest opens and there's only an AMULET inside.");
			} else {
			    System.out.println("Wrong passcode");
			}
		    } else {
			System.out.println("You don't have key that would open this chest.");
		    }
		} else if (thing.equals("refrigerator")){
		    System.out.println("There's a SMALL KEY on top but it's too high up to get.");
		} else if (thing.equals("cabinets")){
		    System.out.println("There are many plates stacked up but one PLATE stands out.");
		} else if (thing.equals("drawers")){
		    System.out.println("There are many utensils but one SPOON stands out.");
		} else if (thing.equals("closet")){
		    System.out.println("Eh. There's just clothes in the closet.");
		} else if (thing.equals("bed")){
		    System.out.println("You look under the blankets and find a KNIFE!");
		} else if (thing.equals("computer")){
		    System.out.println("There's a number sequence on the screen. 9177479205.");
		} else if (thing.equals("stool")){
		    System.out.println("It's just like any other stool.");
		} else if (thing.equals("cabinet")){
		    System.out.println("You look inside and find DRUGS!");
		} else {
		    System.out.println("Can't look at that");
		}
	    } else if (firstword.equals("open") && scan.next().equals("door")){
		if (you.has(8)){
		    keepgoing = false;
		} else {
		    System.out.println("You don't have the key!");
		}
	    } else if (firstword.equals("check") && scan.next().equals("inventory")){
		System.out.println(you.checkInventory());
	    }
	}
	
	System.out.println("Yay! You escaped! Congratulations!");
	     
	
    }
}
