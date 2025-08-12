package Encapsulation;

class Lion{
	private String name;
	private String color;
	private String country;
	int age;
	
	void setData1() {
		name = "Nagu";
		color = "white";
		country = "Africa";
		age = 20;
	
	}
	void setData2(String a, String b ,String c, int d) {
		name = a;
		color = b;
		country = c;
		age = d;
	}
	void getData() {
		System.out.println("Name ="+name);
		System.out.println("Color ="+color);
		System.out.println("Country ="+country);
		System.out.println("Age ="+age);
	    }
}
public class Example{
public static void main(String[]args) {
	Lion l = new Lion();
//  l.name = "ramu"; //private members cannot be accessed outside the class
//  l.color = "yellow"; //private members cannot be accessed outside the class
//  l.country = "india"; //private members cannot be accessed outside the class
//  l.age = 18; //private members cannot be accessed outside the class
	l.setData1();
	l.getData();
	System.out.println("------------------");
	l.setData2("Ramu", "yellow", "India" , 14);
	l.getData();
   }
	
}
 
