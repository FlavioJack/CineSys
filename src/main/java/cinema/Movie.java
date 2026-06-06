package cinema;
import java.time.Duration;

public class Movie{
    String title;
    Duration duration;  
    Genre genre;

    public Movie(String title, Duration duration, Genre genre){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public Genre getGenre(){
        return this.genre;
    }
    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public Duration getDuration(){
        return this.duration;
    }
    public void setDuration(Duration duration){
        this.duration = duration;
    }
    
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "Film: " + getTitle() + 
                ", Genere: " + getGenre() + 
                ", Durata: " + getDuration().toMinutes() + " minuti.";
    }
}