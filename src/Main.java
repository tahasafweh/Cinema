import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Movie> movies = new LinkedList<>();
        Cinema hall1 = new Cinema(1, "Hall 1");
        Cinema hall2 = new Cinema(2, "Hall 2");
        Movie movie1 = new Movie(1, "The Lord of The Rings", "Adventure", "8:00 PM", hall1);
        Movie movie2 = new Movie(2, "The Godfather", "Drama", "4:00 PM", hall2);
        Movie movie3 = new Movie(3, "The Avengers", "Action", "10:00 AM", hall2);
        Movie movie4 = new Movie(4, "Leon the Professional", "Action", "3:00 PM", hall1);
        Movie movie5 = new Movie(5, "Dunkirk", "War", "2:00 PM", hall1);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        // Convert the LinkedList to an array
        Movie[] items = movies.toArray(new Movie[0]);

        JList<Movie> list = new JList<>(items);

        // Create a scroll pane and add the list to it
        JScrollPane scrollPane = new JScrollPane(list);

        // Create a JFrame to hold the scroll pane
        JFrame frame = new JFrame("Movies available");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Create a popup menu for selecting movie details and booking tickets
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem viewDetailsMenuItem = new JMenuItem("View Details");
        popupMenu.add(viewDetailsMenuItem);

        // Add a mouse listener to the JList to display the popup menu on click
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    // Get the selected movie
                    Movie selectedMovie = list.getSelectedValue();

                    // Display a dialog for viewing movie details and booking tickets
                    MovieDetailsDialog dialog = new MovieDetailsDialog(selectedMovie);
                    dialog.setModal(true);
                    dialog.setVisible(true);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}