package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijk_Opdr_Een_Boom extends Applet {
    Color brown;

    public void init() {
        setSize(400,400);
        brown = new Color(135, 62, 0);
    }

    public void paint(Graphics g) {
        tekenBoom(g, 50,200,170,180);
    }

    void tekenBoom(Graphics g, int width, int height, int X, int Y){
        g.setColor(brown);
        g.fillRect(X,Y,width,height);
        g.setColor(Color.green);
        g.fillOval(X-28,Y-110,width*2,height/2);
        g.fillOval(X+18,Y-50,width*2,height/2);
        g.fillOval(X-68,Y-50,width*2,height/2);
    }

}
