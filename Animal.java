import java.util.*;
class Animal{
	String name;
	int legs;
	
	Animal(String n, int l){
		name = n;
		legs =l;
	}
	
	public int getLegs(){
		return legs;
	}
	
	public String toString(){
		return "Name: "+name + ", Legs: "+Integer.toString(legs);
	}

}