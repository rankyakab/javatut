package ranky;
import java.util.Scanner;
import java.util.Random; //for random number
import java.util.EnumSet;
class Apples {
	 
	public static void main (String args[]) {
		 for(tunum people : tunum.values()) {
			 System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
			 
		 }
		 System.out.println("\n and now for the ranges of something\n");
		 for(tunum people : EnumSet.range(tunum.jeniffer, tunum.favour)) {
			 System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		 }
		 
		//getting input
			//Scanner rank = new Scanner(System.in);
			//System.out.println(rank.nextLine());
		/*canner  ranky = new Scanner(System.in);
			double fnum, snum, answer;
			System.out.println("enter first number");
			fnum = ranky.nextDouble();
			System.out.println("enter second number");
			snum = ranky.nextDouble();
			answer = snum + fnum;
			System.out.println(answer);
			*/
		
		/*int girls, boys, people;
		girls = 11;
		boys =3;
		people = girls / boys;
		System.out.println(people);*/
		/*
		 tuna tunaObject = new tuna();
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter your name :");
		 String name = input.nextLine();
		 tunaObject.simpleMessage(name); */
		/*tuna tunaObject = new tuna();
		Scanner input =  new Scanner(System.in);
		System.out.println("input name of your first girlfriend below: ");
		String tempName = input.nextLine();
		tunaObject.setName(tempName);
		tunaObject.saying();*/
		
	/*	Scanner writer = new Scanner(System.in);
		int total=0;
		int average,grade;
		int counter=0;
		while(counter<10) {
			grade=writer.nextInt();
			total+=grade;
			counter++;
		}
		average = total/10;
		System.out.println("The average is 10 numbers is "+ average);*/
		//mathclass
		/*System.out.println(Math.abs(-64));
		System.out.println(Math.ceil(7.2));
		System.out.println(Math.floor(7.2));
		System.out.println(Math.max(7.2,6));
		System.out.println(Math.min(7.2,6));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(9));*/
		/*Random dice = new Random();
		int number;
		for(int counter=1; counter<=10; counter++) {
			number =  1+dice.nextInt(6);
		    System.out.println(number);
		}*/
	//arrays
		//int ranky[] = new int[10];
		//ranky[1]=84;
		//System.out.println(ranky[1]);
		// A short cut to array
		//int ranky[]= {4,6,7,78,3,6,8,88};
		//System.out.println(ranky[5]);
		 //creating an array table
		//System.out.println("Index\tValue");
		//int ranky[]= {34,45,75,778,34,67};
		//for(int counter=0; counter<ranky.length; counter++) {
		//	System.out.println(counter +"\t"+ranky[counter]);
		//}
	//summing all the elements in an array
		//int ranky[]= {4,6,8,9,00,8,6,5};
		/*int sum=0;
		for(int counter=0; counter<ranky.length; counter++) {
			sum+=ranky[counter];
		}
		System.out.println("The sum of this number is "+sum);*/
	//array element as counters
		/*Random rand = new Random();
		int freq[]= new int[7];
		for(int roll=1; roll<1000; roll++) {
			++freq[1+rand.nextInt(6)];
		}
		System.out.println("face\tfrequency");
		for(int face=1; face<freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
		}*/
		
	//enhance for loop of array
		/*int ranky[]= {4,7,89,76,6,5,5,68,8};
		int total=0;
		for(int x:ranky) {
			total+=x;
		
		}
			
		System.out.println(total);*/
	//how to pass a method of an array
		//int ranky[]= {35,676,5,43,654};
		
		///change(ranky);
		//for(int x : ranky) {
		//	System.out.println(x);
		//}
	//multi dimentional arrays
	/*	int ranky[][] = {{4,4444,54,444},{344,55,33,33}};
		int akab[][] = {{4,54,444},{344,55,33,33} ,{444}};
		System.out.println("this is the first array");
		display(ranky);
		System.out.println("this is the second array");
		display(akab);
	   System.out.println(average(344,55,33,33));*/
	// time class
		 /*tuna tunaObject = new tuna(6);
		 System.out.println(tunaObject.toMillitary());
		 //tunaObject.setTime(23, 43, 48);
		 System.out.println(tunaObject.toMillitary());
		 System.out.println(tunaObject.toring()); */
		
	/* tuna tunaObject =  new tuna();
	 tuna tunaObject1 =  new tuna(5);
	 tuna tunaObject2=  new tuna(5,13);
	 tuna tunaObject3 =  new tuna(5,13,43);
	 System.out.printf("%s\n", tunaObject.toMillitary());
	 System.out.printf("%s\n", tunaObject1.toMillitary());
	 System.out.printf("%s\n", tunaObject2.toMillitary());
	 System.out.printf("%s\n", tunaObject3.toMillitary()); */
	 
	 Potpie pot = new Potpie(2,5,6);
	 tuna tunaObj = new tuna("ranky", pot);
	 System.out.println(tunaObj);
		
}
	public static void change(int x[]) {
		for(int counter=0; counter<x.length; counter++) {
			x[counter]+=5;
		}
		
	}
 public static void display(int x[][]) {
	 for(int row=0; row<x.length; row++) {
		 for(int colomn=0; colomn<x[row].length; colomn++) {
			 System.out.print(x[row][colomn]+"\t");
		 }
		 System.out.println();
			 
	 }
 }
 //method with varied argument
/* public static int average(int...ave) {
	 int total = 0;
	 for(int x: ave) {
		 total+=x;
	 }
	 return total/ave.length;
 }*/

}
 

