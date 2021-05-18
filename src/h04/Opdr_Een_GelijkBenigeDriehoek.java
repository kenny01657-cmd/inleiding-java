package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Een_GelijkBenigeDriehoek extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        // Driehoek
        g.drawLine(100,120,250,120);
        g.drawLine(100,120,175,20);
        g.drawLine(250,120,175,20);

    }
}
