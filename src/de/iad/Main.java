package de.iad;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private Integer x= 35, y=35;
    public Main(){
        super("Kreis zeichnen und füllen");
        setPreferredSize(new Dimension(400,300));

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((d.width -getSize().width)/2, (d.height - getSize().height)/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
	Main app= new Main();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }
}
