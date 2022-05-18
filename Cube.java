//5.  Write a program to calculate cube of a number



import java.util.Scanner;

public class Cube {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number= ");
		int num = sc.nextInt();
		int cube=0;
		
		cube = num * num * num;
		
		System.out.println("Show cube of A Number" +cube);

	}

}
