package SnakesAndLadders;

import javax.swing.*;

/**
 *this is a instatiable class that Moves the character around the board
 */

public class Board extends JFrame{



    public int player1wins=0,player2wins=0;

    /**
     * This Method moves the players around the jframe and detects if they land on a snake or ladder.
     */

    public  Board()
    {

        boolean gameOver = false;

        int p1x = 0, p1y = 450, p2x = 0, p2y = 450;
        int turn = 0;
        int playerTurn=1;
        boolean player1turn=true;


        boolean player1Turn = true;

        MYCanvas myCanvas = new MYCanvas(p1x, p1y, p2x, p2y);
        JFrame f2 = new JFrame();
        f2.add(myCanvas);
        f2.setSize(800, 570);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);

        while(gameOver==false) {

            turn++;


            Dice d6 = new Dice();
            int roll = d6.getDiceRoll();

            turn++;
            if (turn>1){
                if(playerTurn==1)
                    playerTurn=2;
                else
                    playerTurn=1;
            }



            f2.remove(myCanvas);

            MovePlayer movePlayer = new MovePlayer(roll, p1x, p1y);
            myCanvas.setP1x(p1x);
            myCanvas.setP1y(p1y);
            MovePlayer movePlayer2 = new MovePlayer(roll, p2x, p2y);
            myCanvas.setP2x(p2x);
            myCanvas.setP2y(p2y);
            f2.add(myCanvas);
            JOptionPane.showMessageDialog(null, "player "+ playerTurn + " turn");
            JOptionPane.showMessageDialog(null, "player " + playerTurn + " rolled a " + roll );

            if (player1turn) {
                p1x = movePlayer.getPlayerX();
                p1y = movePlayer.getPlayerY();
                player1turn = false;
            } else {
                p2x = movePlayer2.getPlayerX();
                p2y = movePlayer2.getPlayerY();
                player1turn = true;
            }
            //f2.repaint();
            //snakes
            if (p1x == 200 && p1y == 50) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a snake");
                p1x=0;
                p1y=450;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }
            if (p1x == 500 && p1y == 150) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a snake");
                p1x=500;
                p1y=450;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }
            if (p1x == 300 && p1y == 150) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a snake");
                p1x=300;
                p1y=350;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }
            if (p1x == 400 && p1y == 150) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a snake");
                p1x=300;
                p1y=450;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);


            }

            if (p2x == 200 && p2y == 50) {
                JOptionPane.showMessageDialog(null, "Player 2 you landed on a snake");
                p2x=0;
                p2y=450;
                movePlayer.setPlayerX(p2x);
                movePlayer.setPlayerY(p2y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }
            if (p2x == 500 && p2y == 150) {
                JOptionPane.showMessageDialog(null, "Player 2 you landed on a snake");
                p2x=500;
                p2y=450;
                movePlayer.setPlayerX(p2x);
                movePlayer.setPlayerY(p2y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }
            if (p2x == 300 && p2y == 150) {
                JOptionPane.showMessageDialog(null, "Player 2 you landed on a snake");
                p2x=300;
                p2y=350;
                movePlayer.setPlayerX(p2x);
                movePlayer.setPlayerY(p2y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }
            if (p2x == 400 && p2y == 150) {
                JOptionPane.showMessageDialog(null, "Player 2 you landed on a snake");
                p2x=300;
                p2y=450;
                movePlayer.setPlayerX(p2x);
                movePlayer.setPlayerY(p2y);
                f2.remove(myCanvas);
                f2.add(myCanvas);

            }

            //ladders
            if (p1x == 100 && p1y == 350) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a ladder");
                p1x=100;
                p1y=50;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);
            }
            if (p1x == 400 && p1y == 150) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a ladder");
                p1x=400;
                p1y=50;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);
            }
            if (p1x == 200 && p1y == 450) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a ladder");
                p1x=200;
                p1y=150;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);
            }
            if (p1x == 400 && p1y == 450) {
                JOptionPane.showMessageDialog(null, "Player 1 you landed on a ladder");
                p1x=400;
                p1y=350;
                movePlayer.setPlayerX(p1x);
                movePlayer.setPlayerY(p1y);
                f2.remove(myCanvas);
                f2.add(myCanvas);
            }



            System.out.println("x" + p1x + " y" + p1y);

            if (p1y <= 0||(p1x==400&&p1y==50)) {
                gameOver = true;
                JOptionPane.showMessageDialog(null, "player1 wins");
                player1wins++;
                break;
            }

            if (p2y <= 0||(p2x==400&&p2y==50)) {
                gameOver = true;
                JOptionPane.showMessageDialog(null, "player2 wins");
                player2wins++;
                break;
            }


        }
    }




    public int getPlayer1wins() {return player1wins;}

    public void setPlayer1wins(int player1wins) {this.player1wins = player1wins;}

    public int getPlayer2wins() {return player2wins;}

    public void setPlayer2wins(int player2wins) {this.player2wins = player2wins;}
}

 

