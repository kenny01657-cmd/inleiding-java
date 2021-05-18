package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdr_Vijf_Ellipse extends Applet {


    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(90, 90, 200, 100, 0, 360);
    }

}
