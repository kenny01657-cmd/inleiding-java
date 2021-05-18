package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Drie_NederlandseVlag extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        // Nederlandse vlag
        g.drawRect(50,50,150,90);
        g.setColor(Color.blue);
        g.fillRect(50,50,150,30);
        g.setColor(Color.red);
        g.fillRect(50,110,150,30);
        // vlaggenstok
        g.setColor(Color.black);
        g.fillRect(50,50,3,250);
    }
}
