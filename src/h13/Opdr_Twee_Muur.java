package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Twee_Muur extends Applet {

    public void init() {
        setSize(600,300);
    }

    public void paint(Graphics g) {
        tekenRodeMuur(g,50,30,50,50);
    }

    void tekenRodeMuur(Graphics g, int width, int height, int X, int Y){
        int aantalBakstenen;
        int X1;
        X1 = X;
        aantalBakstenen = 70;
        for(int i = 0; i < aantalBakstenen; i++){
            g.setColor(Color.RED);
            g.fillRect(X,Y,width,height);
            g.setColor(Color.black);
            g.drawRect(X,Y,width,height);
            X += width;

            if(X == X1 + width*10){
                X -= width*10-(width/2);
                Y += height;
            }
            else if (X == (X1+width/2) + width*10){
                X -= width*10+(width/2);
                Y += height;
            }
        }
    }
}
