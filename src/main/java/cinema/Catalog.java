package cinema;
import java.util.ArrayList;

public class Catalog{
    ArrayList<Movie> movies;
    public Catalog(){
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public void removeMovie(Movie movie){
        movies.remove(movie);
    }

    public ArrayList<Movie> filterByTitle(String movieName){
        ArrayList<Movie> filteredMovies = new ArrayList<>();
        for(Movie m: movies){
            if(m.getTitle().toLowerCase().contains(movieName.toLowerCase()))
                filteredMovies.add(m);
        }
        return filteredMovies;
    }

    public Movie getMovieByIndex(int index){
        return movies.get(index-1);
    }

    @Override
    public String toString(){
        if(movies.isEmpty())
            return "Il catalogo è vuoto";  
        else{
            int index=0;
            StringBuilder str = new StringBuilder("\n--- CATALOGO FILM ---\n");
            for(Movie m: movies){
                str.append("- ").append(m.toString()).append("\n");
            }
            return str.toString();
        }
    }
}