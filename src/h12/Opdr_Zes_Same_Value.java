package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr_Zes_Same_Value extends Applet {
    int[] tabel = {1,1,4,3,5,5,6,3,69,420,33,33,420,69,69};
    TextField tekstVak;
    Button knop;
    int getal;
    int aantal;

    public void init(){
        tekstVak = new TextField(10);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstVak);
        add(knop);
    }

    public void paint(Graphics g) {
        for (int j : tabel) {
            if (getal == j) {
                aantal++;
            }
        }
        if (getal > 0) {
            g.drawString("" + getal + " komt " + aantal + " keer voor in de tabel", 50, 50);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getal = Integer.parseInt(tekstVak.getText());
            aantal = 0;
            repaint();
        }
    }

}
