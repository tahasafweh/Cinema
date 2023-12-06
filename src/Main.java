import javax.swing.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Movie> movies = new LinkedList<>();
        Cinema hall1 = new Cinema(1, "Hall 1");
        Cinema hall2 = new Cinema(2, "Hall 2");
        Movie movie1 = new Movie(1, "The Lord of The Rings","Adventure", "8:00 PM",hall1);
        Movie movie2 = new Movie(2, "The Godfather","Drama","4:00 PM",hall2);
        Movie movie3 = new Movie(3, "The Avengers","Action","10:00 AM",hall2);
        Movie movie4 = new Movie(4, "Leon the Professional","Action","3:00 PM",hall1);
        Movie movie5 = new Movie(5, "Dunkirk","War","2:00 PM",hall1);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        Movie[] items = movies.toArray(new Movie[0]);

        JList<Movie> list = new JList<>(items);

        JScrollPane scrollPane = new JScrollPane(list);

        JFrame frame = new JFrame("Movies available");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}