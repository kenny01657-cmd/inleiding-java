package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Zeven_VijftigConcentrischeCirkels extends Applet {

    public void init() {
        setSize(600,600);
    }

    public void paint(Graphics g){
        // Declareren en Initialiseren
        int teller;
        int X = 300;
        int Y = 300;
        int width = 5;
        int height = 5;

        // Vijftig cirkels
        for(teller = 0; teller < 50; teller++){
            width += 10;
            height += 10;
            X -= 5;
            Y -= 5;
            g.drawOval(X,Y,width,height);
        }

    }

}
