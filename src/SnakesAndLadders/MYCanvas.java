package SnakesAndLadders;
import java.awt.*;
import javax.swing.JFrame;

//https://www.javatpoint.com/Displaying-image-in-swing
public class MYCanvas extends Canvas {

    public void paint(Graphics g)
    {
            Toolkit t=Toolkit.getDefaultToolkit();
            Image i=t.getImage("snakes and ladders bord.png");
            g.drawImage(i, 0,0,650, 650,this);
    }


    }

