package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Twee_Muur extends Applet {

    public void init() {
        setSize(500,300);
    }

    public void paint(Graphics g) {
        tekenRodeMuur(g,50,30,50,50);
    }

    void tekenRodeMuur(Graphics g, int width, int height, int X, int Y){
        int aantalBakstenen;
        int X1;
        X1 = X;
        aantalBakstenen = 56;
        for(int i = 0; i < aantalBakstenen; i++){
            g.setColor(Color.RED);
            g.fillRect(X,Y,width,height);
            g.setColor(Color.black);
            g.drawRect(X,Y,width,height);
            X += width;

            if(X == X1 + width*7){
                g.setColor(Color.red);
                g.fillRect(X,Y,width/2,height);
                g.setColor(Color.black);
                g.drawRect(X,Y,width/2,height);
                X -= width*7-(width/2);
                Y += height;
                if(i < 56) {
                    g.setColor(Color.red);
                    g.fillRect(X - (width / 2), Y, width / 2, height);
                    g.setColor(Color.black);
                    g.drawRect(X - (width / 2), Y, width / 2, height);
                }
            }
            else if (X == (X1+width/2) + width*7){
                X -= width*7+(width/2);
                Y += height;
            }
        }
    }
}
