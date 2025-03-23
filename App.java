
import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 555;

        JFrame frame = new JFrame("Fly Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flybird flybird = new Flybird();
        frame.add(flybird);
        frame.pack();
        flybird.requestFocus();
        frame.setVisible(true);
    }
}
