import java.util.ArrayList;
import java.util.Collections;

public class SortMovie {

    ArrayList<Movie> movie  = new ArrayList<>();

    public SortMovie(ArrayList<Movie> movie){
        this.movie = movie;
    }

    public static ArrayList<Movie> sortMovieByYear(){
        Collections.sort(movie);
        return movie;
    }
}
