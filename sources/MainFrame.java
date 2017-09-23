/**
 * Created by EE on 23.09.2017.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    public JPanel panel = null;

    public MainFrame(String title, int width, int heigth) {
        super(title);
        this.setBounds(100, 150, width, heigth);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        this.add(panel);
    }

    public void addComponent(Component component) {
        panel.add(component);
    }
}
