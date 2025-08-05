package stringprograms;

public class bulidinmethods {

	public static void main(String[] args) {
	String str = "SachinRameshTendulkar";
	// 1.length()
	int len = str.length();
	
	//2.charAt()
	System.out.println("The length of the string is= "+len);
	char c = str.charAt(0);
	System.out.println("The character at 0th position = "+c);
	
	// c= str.charAt(100);//it leads to indexOutOfBounds exception as we have only 21 position
	//	System.out.println("The character at 0th position = "+c);
	
	//3.concat()
	String str1= str.concat("is the best batsmen in the world");
	System.out.println(str1);
	
	//4.contains()
	boolean res1 = str.contains("Ramesh");
	System.out.println(res1);
	res1 = str.contains("umesh");
	System.out.println(res1);
	
	//5.endswith()
	boolean res2 = str.endsWith("Tendulkar");
	System.out.println(res2);
	res2 = str.contains("Pendulkar");
	System.out.println(res2);
	
	//6.startsWith()
	boolean res3 = str.startsWith("Sachin");
	System.out.println(res3);
	res3 = str.contains("Pachin");
	System.out.println(res3);
	
	//7.getClass()
	Class class1 = str.getClass();
	System.out.println(class1);
	
	//8.hashcode()
	int hashCode = str.hashCode();
	System.out.println(hashCode);
	
	// 9. indexof()
	int index1 = str.indexOf('S');
	System.out.println(index1);
	index1 = str.indexOf('Z');
	System.out.println(index1);
	
	// 10. isBlank()
	boolean res4 = str.isBlank();
	System.out.println(res4);
	String str2 = "     ";
	res4 = str2.isBlank();
	System.out.println(res4);
	String str3 = "";
	res4 = str.isBlank();
	System.out.println(res4);
	
	//11.isEmpty
	boolean res5 = str.isEmpty();
	System.out.println(res5);
	res5 = str2.isEmpty();
	System.out.println(res5);
	res5 = str3.isEmpty();
	System.out.println(res5);
	
	//12. lastIndexOf()
	int lastindex = str.lastIndexOf('e');//it will provide the last occurrence position of the specified character
	System.out.println(lastindex);
	lastindex = str.lastIndexOf('z');//it will provide the last occurrence position of the specified character
	System.out.println(lastindex);
			
	//13. replace()
	String replace = str.replace('S', '$');//It will replace the old character with new character
	System.out.println(replace);
			
	//14. substring(int start)
	String substring = str.substring(6);//provide the substring  from the specified position
	System.out.println(substring);
			
	//15. substring(int start,int end)
	substring = str.substring(6,12);//provide the substring from the specified position to the specified position
	System.out.println(substring);
			
	//16. toUpperCase()
	String upperCase = str.toUpperCase();//it convert string to upper case
	System.out.println(upperCase);
			
	//17. toLowerCase()
	String lowerCase = str.toLowerCase();//it convert string to upper case
	System.out.println(lowerCase);
	

	}

}
