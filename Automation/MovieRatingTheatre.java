

import java.util.Scanner;

class Movie
{
	int movieId;
	String movieName;
	int rating;
	Movie(int movieId, String movieName, int rating)
	{
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	public String toString()
	{
		return " " +movieId+ "   " +movieName+ "   " +rating;
	}
}

public class MovieRatingTheatre 
{
	int theatreId;
	String theatreName;
	String location;
	Movie movieInfo;
	MovieRatingTheatre(int theatreId, String theatreName, String location, Movie movieInfo)
	{
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.location = location;
		this.movieInfo = movieInfo;
	}
	public String toString()
	{
		return " " +theatreId+ "   " +theatreName+ "   " +location+ "   "+movieInfo;
	}

	public static void main(String[] args)
	{
		
		MovieRatingTheatre m[] = new MovieRatingTheatre[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<m.length; i++)
		{
			System.out.println("Enter the theatreId:");
			int theatreId = sc.nextInt();
			System.out.println("Enter the theatreName:");
			String theatreName = sc.next();
			System.out.println("Enter the location:");
			String location = sc.next();
			System.out.println("Enter the movieId:");
			int movieId = sc.nextInt();
			System.out.println("Enter the movieName:");
			String movieName = sc.next();
			System.out.println("Enter the rating:");
			int rating = sc.nextInt();
			
			m[i] = new MovieRatingTheatre(theatreId, theatreName, location, new Movie(movieId, movieName, rating));
		}
		for(MovieRatingTheatre i:m)
		{
			System.out.println("   "+i);
		}

	}

}
