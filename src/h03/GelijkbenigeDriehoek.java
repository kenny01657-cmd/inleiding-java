package h03;

import java.applet.Applet;
import java.awt.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        // gelijkbenige driehoek
        g.drawLine(150,120,190,120);
        g.drawLine(150,120,170,85);
        g.drawLine(190,120,170,85);
    }
}
