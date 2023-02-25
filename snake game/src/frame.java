import javax.swing.*;

public class frame extends JFrame {
    frame() {
        // adding the panel component in the frame
        this.add(new panel());

        // setting the tittle in the window
        this.setTitle("snake game");

        // ensuring the uniform experience by fixing the bounds of window
        this.setResizable(false);

        // layout manager to resize the window according to the display
        this.pack();

        this.setVisible(true);
    }
}
