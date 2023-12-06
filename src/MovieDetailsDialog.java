import javax.swing.*;
import java.awt.*;

public class MovieDetailsDialog extends JDialog {

    private Movie movie;

    public MovieDetailsDialog(Movie movie) {
        this.movie = movie;

        setTitle(movie.getName());
        setLayout(new BorderLayout());

        // Create a panel for displaying movie details
        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new GridLayout(3, 2));
        detailsPanel.add(new JLabel("Title:"));
        detailsPanel.add(new JLabel(movie.getName()));
        detailsPanel.add(new JLabel("Genre:"));
        detailsPanel.add(new JLabel(movie.getGenre()));
        detailsPanel.add(new JLabel("Showtime:"));
        detailsPanel.add(new JLabel(movie.getShowtime()));

        // Create a panel for ticket booking
        JPanel bookingPanel = new JPanel();
        bookingPanel.setLayout(new FlowLayout());
        JLabel bookingLabel = new JLabel("Select seats and book tickets:");
        bookingPanel.add(bookingLabel);

        // Add the details and booking panels to the dialog
        add(detailsPanel, BorderLayout.NORTH);
        add(bookingPanel, BorderLayout.CENTER);

        // Set the dialog size and pack the components
        setSize(400, 200);
        pack();
    }
}