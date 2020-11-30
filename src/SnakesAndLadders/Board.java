package SnakesAndLadders;

import javax.swing.*;

public class Board extends JFrame {


    public Board() {
        Dice dice = new Dice();
        boolean gameOver = false;
        int count = 0;

        int p1x = 0, p1y = 450, p2x = 0, p2y = 450;
        int diceRoll, turn = 0;

        int boardWidth = 600, boardHeight = 500, tileSize = 100;

        boolean isRight = true;


        while (gameOver == false) {

            MYCanvas m = new MYCanvas(p1x, p1y, p2x, p2y);
            boolean player1Turn = true;
            JFrame f = new JFrame();
            f.add(m);
            f.setSize(800, 600);
            f.setVisible(true);


            int roll = (int) Math.round( (Math.random() * 4 + 1));
            //int roll = 3;
            //count++;

            if (p1y <= 0) {
                gameOver = true;
            }
            diceRoll = roll * tileSize;

            if (isRight) {

                for (int i = 0; i < roll; i++) {
                    if (isRight) {
                        p1x += 100;
                        if (p1x == 600) {

                            isRight = false;
                            p1y -= tileSize;
                        }
                    }
                    if (!isRight) {
                        p1x -= 100;
                    }


                }

            } else {
                for (int i = 0; i < roll; i++) {
                    if (!isRight) {
                        p1x -= 100;
                        if (p1x == -100) {

                            isRight = true;
                            p1y -= tileSize;
                        }
                    }
                    if (isRight) {
                        p1x += 100;
                    }


                }
            }

                m.setP1x(p1x);
                m.setP1y(p1y);
                player1Turn = false;
                System.out.println("x" + diceRoll);
                roll = (int) Math.round((Math.random() * 4 + 1));
                diceRoll = roll * 100;
                p2x += diceRoll;
                m.setP2x(p2x);

                System.out.println("y" + diceRoll);


                String pause = JOptionPane.showInputDialog("test");
                f.setVisible(false);
                //f.repaint();
            }


        }


    }

 

