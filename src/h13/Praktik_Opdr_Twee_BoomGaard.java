package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktik_Opdr_Twee_BoomGaard extends Applet {
    Color grass;
    Color brown;
    Color dirt;
    Color path;
    int aantalBomen;
    int X;
    int Y;

    public void init() {
        aantalBomen = 10;
        setSize(1000,500);
        brown = new Color(135, 62, 0);
        dirt = new Color(102, 43, 0);
        path = new Color(213, 99, 0);
        grass = new Color(0, 116,0);
        setBackground(grass);
    }

    public void paint(Graphics g) {
        X = 100;
        Y = 100;
        int X1;
        int Y1;
        X1 = X-20;
        Y1 = Y+60;
        tekenPad(g,20,80, 20,80,900,40);
        for(int i = 0; i < aantalBomen; i++) {
            g.setColor(dirt);
            g.fillRect(X1,Y1,70,70);
            tekenBoom(g, 30, 100, X, Y);

            X1 += 180;
            X += 180;
            if (i == (aantalBomen/2)-1){
                Y1 += 200;
                X = 100;
                X1 = X-20;
                Y += 200;
            }
        }
    }

    void tekenBoom(Graphics g, int width, int height, int X, int Y){
        int X1;
        int Y1;
        int X2;
        int Y2;
        int X3;
        int Y3;
        X1 = X-15;
        Y1 = Y-60;
        X2 = X+10;
        Y2 = Y-30;
        X3 = X-40;
        Y3 = Y-30;

        // De boom tekenen
        g.setColor(brown);
        g.fillRect(X,Y,width,height);
        g.setColor(Color.green);
        g.fillOval(X1,Y1,width*2,height/2);
        g.fillOval(X2,Y2,width*2,height/2);
        g.fillOval(X3,Y3,width*2,height/2);
    }

    void tekenPad(Graphics g,int X1, int Y1, int X2, int Y2, int width, int height){
        int aantalPaden;
        aantalPaden = 6;
        // Horizontalen paden
        g.setColor(path);
        g.fillRect(X1,Y1,width,height);
        g.fillRect(X1,Y1+190,width,height);
        g.fillRect(X1,Y1+370,width,height);
        // Verticale paden
        for (int i = 0; i < aantalPaden; i++){
            g.fillRect(X2,Y2,40,410);
            X2 += 175;
        }
    }

}
