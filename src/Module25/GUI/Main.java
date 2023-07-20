package Module25.GUI;
/*
Creating a simple GUI window with the swing - a standard Java-library.
 */

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // creating a window
        JFrame jf = new JFrame();
        // set the window's sizes
        jf.setSize(400, 300);
        //add the mouseClicked() method
        jf.addMouseListener(new SimpleClickListener());
        // and show it
        jf.setVisible(true);
    }
}
