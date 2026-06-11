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
        return genre;
    }
    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public Duration getDuration(){
        return duration;
    }
    public void setDuration(Duration duration){
        this.duration = duration;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return getTitle() + 
                ", Genere: " + getGenre() + 
                ", Durata: " + getDuration().toMinutes() + " minuti.";
    }
}