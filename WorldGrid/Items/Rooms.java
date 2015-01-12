import java.io.File;
import java.io.FileNotFoundException;

public class Rooms{
    private int ID;
    private String description;

    public Rooms(int ID){
	setID(ID);
    }

    public void setID(int x){
	ID = x;
    }

    public int getID(){
	return ID;
    }
    
    public void setDes(String fileName)throws FileNotFoundException{
	File text = new File(filename);
	Scanner sc = new Scanner(text);
	
	}


    public static void main(String[]args){
	Rooms A = new Rooms(10);
	System.out.println(A.getID());
    }
}