import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMovie {
    public static void main(String[] args) throws IOException {

        FileImport mfile = new FileImport();
        Scanner input = mfile.importFile("C:\\Users\\Adil\\Desktop\\movie_metadata_500.csv");
        ArrayList<Movie> movieList = new ArrayList<>();
        input.nextLine();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] col = line.split(",");
            for (int i = 0; i < col.length; i++) {
                if (col[i].isEmpty()) {
                    col[i] = "0";
                }
            }
            Movie movie = new Movie(col[11], col[20], col[1], col[23]);
            movieList.add(movie);

        }


        SortMovie sortMovie = new SortMovie(movieList);
        ArrayList<Movie> MovieSortedByYear = SortMovie.sortMovieByYear();

        for (Movie movie : MovieSortedByYear) {
            System.out.println(movie);
        }
    }
}
