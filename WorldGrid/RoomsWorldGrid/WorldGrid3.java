import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WorldGrid3{







    Random rand = new Random();
    private Room [] rooms;


    public void importRoomsFromFile(String fileName) throws FileNotFoundException{

	File text = new File(fileName);
	Scanner sc = new Scanner(text);
