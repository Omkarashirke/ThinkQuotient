//3.  Write a program to calculate area of circle



import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args)
	{
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter radius of circle=");
  		int rad;
  		double pie = 3.14, area;
  		
  		rad = Sc.nextInt();
  		
  		area = pie * rad * rad;
  		System.out.println("Area of circle:" + area);	

	}

}
