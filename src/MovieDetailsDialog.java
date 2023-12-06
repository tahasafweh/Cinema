import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public

class MovieDetailsDialog extends JDialog {

    private Movie movie;
    private ButtonGroup showtimeButtonGroup;
    private JPanel showtimePanel;

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
        detailsPanel.add(new JLabel("Cinema:"));
        detailsPanel.add(new JLabel(movie.getCinema().getHallName()));

        // Create a panel for selecting showtime
        showtimePanel = new JPanel();
        showtimeButtonGroup = new ButtonGroup();
        String showtime = null;

        for (int i = 0; i < 4; i++) {
            String currentShowtime = movie.getShowtime(); // Assign the current element to 'currentShowtime'
            JRadioButton showtimeRadioButton = new JRadioButton(currentShowtime); // Use 'currentShowtime' to create the radio button
            showtimeButtonGroup.add(showtimeRadioButton);
            showtimePanel.add(showtimeRadioButton);
        }

        // Select the default showtime
        ((JRadioButton) showtimeButtonGroup.getElements().nextElement()).setSelected(true);

        // Add the details and showtime panels to the dialog
        add(detailsPanel, BorderLayout.NORTH);
        add(showtimePanel, BorderLayout.CENTER);

        // Set the dialog size and pack the components
        setSize(400, 250);
        pack();
    }
}