import java.util.*;

public class Explorer{
    private String name;
    private int location;
    private int [] inventory = new int[10];
    Random rand = new Random();

    public void setLocation(int index){
	location = index;
    }

    public int getLocation(){
	return location;
    }

    public void setName(String name){
	this.name = name;
    }

    public void goRight(Room[] map){
	if (location == map.length-1){
	    System.out.println("There's nothing beyond this point. You should go back.");
	} else {
	    setLocation(location+1);
	    System.out.println(getWhereIAm(map));
	}
    }

    public void goLeft(Room[] map){
	if (location == 0){
	    System.out.println("There's nothing beyond this point. You should go back.");
	} else {
	    setLocation(location-1);
	    System.out.println(getWhereIAm(map));
	}
    }

    public String getWhereIAm(Room[] map){
	String here = "";
	here += "Location: "+map[location].getTitle()+"\nDescription: "+map[location].getDes();
	return here;
    }
    
    public void add(String thing){
	if (thing.equals("amulet")){
	    inventory[1] = 1;
	    System.out.println("You picked up an amulet");
	} else if (thing.equals("plate")){
	    inventory[2] = 2;
	    System.out.println("You picked up a plate");
	} else if (thing.equals("spoon")){
	    inventory[3] = 3;
	    System.out.println("You picked up a spoon");
	} else if (thing.equals("small")){
	    inventory[4] = 4;
	    System.out.println("You picked up a small key");
	} else if (thing.equals("knife")){
	    inventory[5] = 5;
	    System.out.println("You picked up a knife");
	} else if (thing.equals("stool")){
	    inventory[6] = 6;
	    System.out.println("You picked up a stool");
	} else if (thing.equals("drugs")){
	    inventory[7] = 7;
	    System.out.println("You picked up some drugs");
	} else if (thing.equals("big")){
	    inventory[8] = 8;
	    System.out.println("You picked up a big key");
	}
    }

    public boolean has(int x){
	return (inventory[x]==x);
    }

    public Explorer(){
	setLocation(0);
    }

}
