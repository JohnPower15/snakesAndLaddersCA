package SnakesAndLadders;

import java.awt.*;

//https://www.javatpoint.com/Displaying-image-in-swing

/**
 * An instantiable class that creates the images used(background, player1,player2.
 */
public class MYCanvas extends Canvas {

    public int p1x=5, p1y=0;
    public int p2x=0, p2y=0;

    /**
     * calls the mutators to instaniate the position of players on MyCanvas
     * @param p1x player 1 x position
     * @param p1y player 1 y position
     * @param p2x player 2 x position
     * @param p2y player 2 y position
     */

    public MYCanvas(int p1x, int p1y, int p2x, int p2y)
    {
        setP1x(p1x);
        setP1y(p1y);
        setP2x(p2x);
        setP2y(p2y);
    }


    /**
     * Method to set the x position of player 1
     * @param p1x
     */

    public void setP1x(int p1x) {this.p1x = p1x;}

    /**
     * Method to set the y position of player 1
     * @param p1y
     */
    public void setP1y(int p1y) {this.p1y = p1y;}

    /**
     * Method to set the x position of player 2
     * @param p2x
     */
    public void setP2x(int p2x) {this.p2x = p2x;}

    /**
     * Method to set the y position of player 2
     * @param p2y
     */
    public void setP2y(int p2y) {this.p2y = p2y;}

    /**
     * Method to get the x position of player 1
     * @return
     */
    public int getP1x() {return p1x;}

    /**
     * Method to get the y position of player 1
     * @return
     */
    public int getP1y() {return p1y;}

    /**
     * Method to get the x position of player 2
     * @return
     */
    public int getP2x() {return p2x;}

    /**
     * Method to get the y position of player 2
     * @return
     */
    public int getP2y() {return p2y;}

    /**
     * method to draw the images. This also sets there sizes and position
     * @param g
     */


    public void paint(Graphics g)
        {
            //background
                Toolkit t=Toolkit.getDefaultToolkit();
                Image i=t.getImage("src/SnakesAndLadders/salBackground.png");
                g.drawImage(i, 0,0,600, 500,this);

            //player1
                Toolkit t1=Toolkit.getDefaultToolkit();
                Image i1=t1.getImage("src/SnakesAndLadders/hiclipart.com.png");
                g.drawImage(i1, p1x,p1y,50, 50,this);

            //player 2
                Toolkit t2=Toolkit.getDefaultToolkit();
                Image i2=t2.getImage("src/SnakesAndLadders/hiclipartIron.com.png");
                g.drawImage(i2, p2x,p2y,50, 50,this);

        }

    }

