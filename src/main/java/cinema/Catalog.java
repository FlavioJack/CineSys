package cinema;
import java.util.ArrayList;

public class Catalog{
    ArrayList<Movie> movies;
    public Catalog(){
        this.movies = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }

    public String toString(){
        if(movies.size()==0)
            return "Il catalogo è vuoto";  
        else{
            int index=0;
            StringBuilder str = new StringBuilder("\n--- CATALOGO FILM ---\n");
            for(Movie m: movies){
                index++;
                str.append(index).append(". ").append(m.toString()).append("\n");
            }
            return str.toString();
        }
    }
}