package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Vijf_VierKanten extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        // Declareren en Initaliseren
        int X = 20;
        int Y = 20;
        int width = 20;
        int height = 20;

        // Vijf vierkanten
        for(int teller = 0; teller < 5; teller++){
            X += 20;
            Y += 20;
            g.drawRect(X,Y,width,height);
        }
    }

}
