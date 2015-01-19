import java.util.*;

public class Explorer{
    private String name;
    private int HP, STR, INT, DEX;
    private String [] inventory = new String[10];
    Random rand = new Random();

    public void setName(String name){
	this.name = name;
    }

    public void setHP(int HP){
	this.HP = HP; 
    }

    public void setSTR(int STR){
	this.STR = STR;
    }

    public void setINT(int INT){
	this.INT = INT;
    }

    public void setDEX(int DEX){
	this.DEX = DEX;
    }

    public String getName(){
	return name;
    }

    public int getHP(){
	return HP;
    }

    public int getSTR(){
	return STR;
    }

    public int getINT(){
	return INT;
    }

    public int getDEX(){
	return DEX;
    }

    public Explorer(){
	setName("William");
	setHP(30);
	setSTR(1);
	setINT(1);
	setDEX(1);
    }

    public Explorer(String name){
	setName(name);
	setHP(30);
	setSTR(1);
	setINT(1);
	setDEX(1);
    }

    public static void main(String[]args){
	Explorer A = new Explorer();
	System.out.println(A.getName());
	Explorer B = new Explorer("Hello");
	System.out.println(B.getName());
    }
}