package SnakesAndLadders;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Board extends JFrame {

    //private JLabel jb[];
    public Board() {
        /*

       BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);

        String regions[] = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
                BorderLayout.WEST, BorderLayout.CENTER};

        jb = new JLabel[9];

        for (int i = 0; i < jb.length; i++) {
            jb[i] = new JLabel(""+(i+1),SwingConstants.CENTER);
            jb[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            add(jb[i]);

        }



        setSize(400, 300);

        setVisible(true);
    }


    private ImageIcon backgroundBoard=new ImageIcon("C:\\Users\\User\\Desktop\\Snakes and ladders.png");
    public void settingBackground()
    {
        GridLayout layout = new GridLayout(5, 6, 0,0);
        setLayout(layout);

        setLocation(300,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setBackgroundBoard(ImageIcon backgroundBoard) {
        this.backgroundBoard = backgroundBoard;
    }

    public ImageIcon getBackgroundBoard() {
        return backgroundBoard;
    }
    */

        MYCanvas m=new MYCanvas();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(690, 700);
        f.setVisible(true);
        JLabel backgroundImage = new JLabel(new ImageIcon(getClass().getResource("C:\\Users\\User\\IdeaProjects\\Snakes_And_Ladders\\src\\SnakesAndLadders.")));
        backgroundImage.setBounds(0, 0, f.getWidth(), f.getHeight());
        f.add(backgroundImage);


    }
}
