package SnakesAndLadders;
import java.awt.*;
import javax.swing.*;

//https://www.javatpoint.com/Displaying-image-in-swing
public class MYCanvas extends Canvas {

    public int p1x=5, p1y=0;
    public int p2x=0, p2y=0;

   //public MYCanvas(){ this(400, 0, 0,0);}

    public MYCanvas(int p1x, int p1y, int p2x, int p2y)
    {
        setP1x(p1x);
        setP1y(p1y);
        setP2x(p2x);
        setP2y(p2y);
    }



    public void setP1x(int p1x) {this.p1x = p1x;}

    public void setP1y(int p1y) {this.p1y = p1y;}

    public void setP2x(int p2x) {this.p2x = p2x;}

    public void setP2y(int p2y) {this.p2y = p2y;}

    public int getP1x() {return p1x;}

    public int getP1y() {return p1y;}

    public int getP2x() {return p2x;}

    public int getP2y() {return p2y;}

    public void paint(Graphics g)
        {
                Toolkit t=Toolkit.getDefaultToolkit();
                Image i=t.getImage("src\\SnakesAndLadders\\snakes and ladders bord.png");
                g.drawImage(i, 0,0,600, 500,this);


                Toolkit t1=Toolkit.getDefaultToolkit();
                Image i1=t1.getImage("src/SnakesAndLadders/hiclipart.com.png");
                g.drawImage(i1, p1x,p1y,50, 50,this);

                Toolkit t2=Toolkit.getDefaultToolkit();
                Image i2=t2.getImage("src/SnakesAndLadders/hiclipartIron.com.png");
                g.drawImage(i2, p2x,p2y,50, 50,this);



           // f.setLayout(null);

        }




    }

