import javax.swing.*;
import java.awt.*;



import java.util.Arrays;

public class testSandL {

    public static void main(String[] args) {

        int width=4, height=4, x=0, y=-1, thisDiceRoll=0;
        boolean gameOver=false;
        int turn =0;
        int[] player1={0,0}, player2={0,0};


        //ImageIcon backgroundBoard=new ImageIcon("C:\\Users\\User\\Desktop\\Snakes and ladders.png");


        //player position
        int[] playerPos = {x, y};

        String[][] bored = new String [width][height];

        //player movement
        if (player1[0]<5&&player1[1]<5)
        {
            while (!gameOver) {
                if (turn == 0)
                {

                    thisDiceRoll=diceRoll();
                    System.out.println(thisDiceRoll);


                    for (int j = 0; j < thisDiceRoll; j++)
                    {

                        if (y <= width) {
                            player1[1]++;
                        } else {
                            player1[0]++;
                            player1[1] = 0;
                        }
                    }
                    if (player1[0] > 4 || (player1[1] > 4 && player1[0] == 4)) {
                        gameOver = true;
                        System.out.println("Winner Winner Chicken dinner");
                        break;
                    }

                    turn++;
                    System.out.println(x + ":" + y);
                }
                else
                    {
                        thisDiceRoll=diceRoll();
                        System.out.println(thisDiceRoll);

                        for (int k = 0; k < thisDiceRoll; k++)
                        {

                            if (y <= width) {
                                player2[1]++;
                            } else {
                                player2[0]++;
                                player2[1] = 0;
                            }
                        }
                        if (player2[0] > 4 || (player2[1] > 4 && player2[0] == 4)) {
                            gameOver = true;
                            System.out.println("Winner Winner Chicken dinner");
                            break;
                        }
                        turn=0;
                    }
            }
        }
        else{
            System.out.println("out of bounds");
        }
        //System.out.println(playerPos[0] +  playerPos[1]);






       // bored[0][0]="gg";

        //System.out.println((bored[0][0]));
    }

    public static int diceRoll()
    {
        int diceRoll = (int) (Math.random() * 4 + 1);


        return diceRoll;
    }

}
