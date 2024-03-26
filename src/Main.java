import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	// Create a scanner object to read user input
        Scanner s = new Scanner(System.in);

	// Continuously prompt the user to enter movie type and title
        while (true){
            System.out.println("Enter movie type (A for Adventure," +
                    " C for Comedy, S for Science Fiction and H for Horror" +
                    "Press Q to quit):");
            String type = s.nextLine();

	    // Check if the user wants to quit
            if ("Qq".contains(type)){
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Enter movie title");
            String title = s.nextLine();

	    // Create a movie instance based on user input and watch it
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}