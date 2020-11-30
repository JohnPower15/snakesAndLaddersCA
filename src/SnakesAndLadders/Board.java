package SnakesAndLadders;

import javax.swing.*;

public class Board extends JFrame {


    public Board() {
        Dice dice = new Dice();
        boolean gameOver=false;
        int count=0;

        int p1x=0,p1y=450,p2x=0,p2y=450;
        int diceRoll, turn=0;

        int boardWidth=600, boardHeight=500, tileSize=100;



        while (gameOver==false){

            MYCanvas m = new MYCanvas(p1x,p1y,p2x,p2y);
            boolean player1Turn = true;
            JFrame f = new JFrame();
            f.add(m);
            f.setSize(800, 600);
            f.setVisible(true);


            //int roll = (int) Math.round( (Math.random() * 4 + 1));
            int roll = 1;
            //count++;

            if (p1y<=0) {
                gameOver=true;
            }
            diceRoll = roll * tileSize;
            p1x+=diceRoll;
            if (p1x==boardWidth){
                p1y-=tileSize;

                p1x=(boardWidth%diceRoll);
            }


            m.setP1x(p1x);
            player1Turn = false;
            System.out.println(diceRoll);
            roll = (int) Math.round( (Math.random() * 4 + 1));
            diceRoll = roll * 100;
            p2x+=diceRoll;
            m.setP2x(p2x);
            System.out.println(diceRoll);


            String pause = JOptionPane.showInputDialog("test");
            f.setVisible(false);
            //f.repaint();
        }





    }



    }

 

