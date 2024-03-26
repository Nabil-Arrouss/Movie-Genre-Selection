public class Movie {
    private String title;

    // Constructor to initialize the movie title
    public Movie(String title) {
        this.title = title;
    }

	
    // Method to watch the movie
    public void watchMovie () {
                            // getClass().getSimpleName() return the class name
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    // Factory method to create different movie instances based on type and title
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            case 'H' -> new Horror(title);
            default -> new Movie(title);
        };
    }
}

// Subclass representing Adventure genre
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something bad happened");
    }
}

// Subclass representing Comedy genre
class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "How Funny",
                "Joyful Music",
                "HAHAHAHA!");
    }
}

// Subclass representing Science Fiction genre
class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Aliens !",
                "NASA Music And Space ",
                "Planet Blows Up");
    }
}

// Subclass representing Horror genre
class Horror extends Movie {

    public Horror(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Uuuhhhh!",
                "Killing and Blood",
                "Spooky yayayay");
    }
}