public class Netflix1 {
private static Object movies;
private static Object movie;
public static void main(String[] args) {
	//1. Create some Movie objects (at least 5).
	Movie movie1 = new Movie("Monsters University", 10);
	Movie movie2 = new Movie("frozen", 9);
	Movie movie3 = new Movie("free birds", 7);
    Movie movie4 = new Movie("Hobbit",6);
	Movie movie5 = new Movie("Hotel Transilvania",8);
	//2. Use the methods in the Movie object to print the name and title of your favorite.
	System.out.println("My favorite Movie is "+ movie1.getTitle());
	//3. Create a NetflixQueue.
	NetflixQueue netflix = new NetflixQueue();
	//4. Add your movies to the Netflix queue.
	netflix.addMovie(movie1);
	netflix.addMovie(movie2);
	netflix.addMovie(movie3);
	netflix.addMovie(movie4);
	netflix.addMovie(movie5);
	//5. Print all the movies in your queue.
	netflix.printMovies(); 
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		netflix.getBestMovie();
		netflix.sortMoviesByRating();
		System.out.println("the best movie is " + netflix.getBestMovie());
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
		netflix.getMovie(2);
		System.out.println("the second best movie is " + netflix.getMovie(1));
		
		
	


	
}
}

