public class Movie implements Comparable<Movie> {

    String movieTitle;
    String country;
    String director;
    String titleYear;

    public Movie(String movieTitle, String country, String director, String titleYear) {
        this.movieTitle = movieTitle;
        this.country = country;
        this.director = director;
        this.titleYear = titleYear;
    }

    void printMovie(){
        System.out.println("Title:" + movieTitle + "Country:" + country + " Director:" + director + " Year:" + titleYear);
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitleYear() {
        return titleYear;
    }

    public void setTitleYear(String titleYear) {
        this.titleYear = titleYear;
    }


    @Override
    public int compareTo(Movie movieCom) {
        if(movieCom.getTitleYear().isEmpty())  {
            movieCom.setTitleYear("0");
        }
        int i = Integer.parseInt(movieCom.titleYear);
        int ii = Integer.parseInt(this.getTitleYear());
        return(ii < i ? -1:
                (ii == i ? 0 : 1));

    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", country='" + country + '\'' +
                ", director='" + director + '\'' +
                ", titleYear='" + titleYear + '\'' +
                '}';
    }
}