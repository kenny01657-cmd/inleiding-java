package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Negen_SchaakBord extends Applet {
    int width = 30;
    int height = 30;

    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g){
        int X = 70;
        int Y = 20;
        Color color1 = Color.black;
        Color color2 = Color.white;
        for(int velden = 0; velden < 32; velden++){
            g.setColor(color1);
            g.fillRect(X,Y,width,height);
            X += width;

            g.setColor(color2);
            g.fillRect(X,Y,width,height);
            X += width;

            if(X == 70+(width*8)){
                color1 = color2;
                if(color1 == Color.white){
                    color2 = Color.black;
                }
                else{
                    color2 = Color.white;
                }
                X = 70;
                Y += height;
            }
        }
    }

}
