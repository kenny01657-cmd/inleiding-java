package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Opdr_Drie_TekstVak extends Applet {
    // Declareren
    TextField[] tekstVak;
    Button knop;
    int[] getal = new int[5];
    int i;
    boolean getalWeergeven = false;

    public void init() {
        // Initialiseren
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        tekstVak = new TextField[5];
        for (i = 0; i < tekstVak.length; i++){
            tekstVak[i] = new TextField(5);
            add(tekstVak[i]);
        }
        add(knop);
    }

    public void paint(Graphics g) {
        // de gesorteerde getallen weergeven
        int y;
        y = 50;
        if (getalWeergeven){
            for (i = 0; i < getal.length; i++){
                g.drawString("" + getal[i],50,y);
                y += 20;
            }
        }
        else{
            g.drawString("Type 5 getallen in ",50,y);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            // getal[i] een waarde geven en sorteren
            for (i = 0; i < getal.length; i++){
                getal[i] = Integer.parseInt(tekstVak[i].getText());
                if(getal.length == 5){
                    getalWeergeven = true;
                }
            }
            repaint();
            Arrays.sort(getal);
        }
    }

}
