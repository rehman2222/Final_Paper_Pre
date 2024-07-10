 class Movie {
    private String title;
    private String studio;
    private String rating;

    // Constructor with all parameters
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    // Constructor with default rating
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for studio
    public String getStudio() {
        return studio;
    }

    // Getter for rating
    public String getRating() {
        return rating;
    }

    // Method to get an array of PG-rated movies
    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                pgMovies[index++] = movie;
            }
        }

        return pgMovies;
    }
}




public class Movies {
    public static void main(String[] args) {
        // Create movie instances
        Movie movie1 = new Movie("The Lion King", "Disney", "G");
        Movie movie2 = new Movie("Avatar", "20th Century Fox", "PG-13");
        Movie movie3 = new Movie("Toy Story", "Pixar", "PG");
        Movie movie4 = new Movie("Finding Nemo", "Pixar", "PG");
        Movie movie5 = new Movie("Inception", "Warner Bros", "PG-13");
        Movie movie6 = new Movie("The Incredibles", "Pixar","PG-13");

        // Create an array of movies
        Movie[] movies = {movie1, movie2, movie3, movie4, movie5, movie6};

        // Get PG-rated movies
        Movie[] pgMovies = Movie.getPG(movies);

        // Print PG-rated movies
        System.out.println("PG-rated movies:");
        for (Movie movie : pgMovies) {
            System.out.println(movie.getTitle());
        }
    }
}
