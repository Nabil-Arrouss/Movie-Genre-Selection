public class NextMain {
    public static void main(String[] args) {
	// Create a specific Adventure movie instance
        Movie movie = Movie.getMovie("A", "Jaws");

        movie.watchMovie();

	// Create a generic movie instance and check if it is a Comedy
        Object unknownObject = Movie.getMovie("C","Airplane");
	
	// Check the type of the movie and watch if it's a Comedy
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        }
    }
}
