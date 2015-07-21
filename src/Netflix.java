public class Netflix {
	public static void main(String[] args) {

		// 7. Use your NetflixQueue to finish the sentence
		// "the second best movie is...."
		NetflixQ netflix1 = new NetflixQ();
		Movie movie1 = new Movie("big hero 6", 5);
		Movie movie2 = new Movie("frozen", 1);
		Movie movie3 = new Movie("Minions2", 3);
		Movie movie4 = new Movie("home ", 2);
		Movie movie5 = new Movie("ted", 4);

		movie1.getTicketPrice();
		movie2.getTicketPrice();
		movie3.getTicketPrice();
		movie4.getTicketPrice();
		movie5.getTicketPrice();

		netflix1.addMovie(movie1);
		netflix1.addMovie(movie2);
		netflix1.addMovie(movie3);
		netflix1.addMovie(movie4);
		netflix1.addMovie(movie5);

		netflix1.printMovies();
		netflix1.getBestMovie();
		System.out.println("the best movie is" + netflix1.getBestMovie());
		netflix1.sortMoviesByRating();
		
		System.out.println("the  2nd best movie is" + netflix1.getMovie(1));
	}
}
