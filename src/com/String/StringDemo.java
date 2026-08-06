package com.String;

public class StringDemo {
	public static void main(String[] args) {

		String s1 = "Java"; //String Pool
		String s2 = new String("Java"); // Heap Memory
		System.out.println("s1 == s2 : " + (s1 == s2)); // == compares address
		System.out.println("s1.equals(s2): " + s1.equals(s2)); //equals() -> compares contents
		
		System.out.println("Str lenght: "+s1.length());
		
		System.out.println("\nChar at: "+ s1.charAt(0));
		
		System.out.println("\nString Lower: "+s1.toLowerCase());
		System.out.println("String Upper: "+s1.toUpperCase());
		
		System.out.println("\nContains: "+s1.contains("av"));
		
		System.out.println("\nStarts with: "+s1.startsWith("Ja"));
		System.out.println("Ends With: "+s1.endsWith("av"));
		
		String text = "Java Programmijng";
		System.out.println("\nindexOf: "+text.indexOf('a'));
		System.out.println("lastIndexOf: "+text.lastIndexOf('a'));
		
		System.out.println("Substring: "+text.substring(5));
		System.out.println("Substring: "+text.substring(0,4));
		
		System.out.println(text.replace("Java", "Python"));
		
		String name ="   Madhu  ";
		System.out.println("Trim: "+name.trim());
		
		System.out.println("equalsIgnoreCase: "+ "Abc".equalsIgnoreCase("abc"));
		
		System.out.println("comparesTo: "+"Apple".compareTo("Banana"));
//		Negative → first smaller
//		Positive → first greater
//		Zero → equal
		
//		Java Immutable:
		String s = "Java";
		s.concat("Programming");
		System.out.println(s);
		s = s.concat(" Programming");
		System.out.println(s);
		
//		String Buffer.
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		
//		Class	Thread Safe	FasterString
//		Builder     	 No	           Yes
//		StringBuffer	 Yes           No
		
		//
		// Reverse
		System.out.print("Reverse A string: ");
		for (int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		//split:
		String skills = "Java,Sring,Hibernate";
		String str[] = skills.split(",");
		
		for(String temp: str) {
			System.out.print(temp +" ");
		}
		
		//StringBuilder
		StringBuilder sbuilder = new StringBuilder("Java");
		sbuilder.append(" Spring");
		sbuilder.insert(4, " Core");
		
		System.out.println("\nStringBuilder: "+sbuilder);
		
		
		
	}

}
