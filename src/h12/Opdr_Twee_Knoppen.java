package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Twee_Knoppen extends Applet{
    Button[] knop;

    public void init() {
        knop = new Button[25];
        for (int i = 0; i < knop.length; i++){
            knop[i] = new Button("Ok");
            add(knop[i]);
        }
    }

    public void paint(Graphics g){
    }

}