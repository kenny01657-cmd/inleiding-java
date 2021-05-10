package h03;

import java.applet.Applet;
import java.awt.*;

public class House extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        // house
        g.drawLine(100,120,250,120);
        g.drawLine(100,120,175,20);
        g.drawLine(250,120,175,20);
        g.drawRect(100,120,150,150);
        // window
        g.drawRect(110,150,40,40);
        g.drawLine(110,170,150,170);
        g.drawLine(130,190,130,150);
        // door
        g.drawRect(160,220,30,50);
        g.drawRect(165,245,2,2);
    }
}
