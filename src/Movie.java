public class Movie {
     private int movieID;
     private String name;
     private String genre;
    private String[] showtime;
    private Cinema cinema;
    public Movie (int movieID, String name, String genre, String[] showtime, Cinema cinema){
        this.movieID = movieID;
        this.name = name;
        this.genre = genre;
        this.showtime = showtime;
        this.cinema = cinema;
    };

    public int getID(){
        return movieID;
    };
    public String getName(){
        return name;
    };
    public String getGenre(){
        return genre;
    };
    public String[] getShowtime(){
        return showtime;
    };
    public Cinema getCinema(){
        return cinema;
    }
    @Override
    public String toString() {
        return name + " (" + genre + ") - " + "8:00 AM - 4:00 PM" + " @ " + cinema.getHallName();
    }
}
