package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr_Vier_Tabel extends Applet{
    TextField tekstVak;
    Button knop;
    int getal;
    int[] tabel = {12,21,43,54,65,34,32,69,79,41};
    String tekst;
    boolean gevonden;
    int index;

    public void init() {
        tekst = "";
        tekstVak = new TextField(10);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstVak);
        add(knop);
    }

    public void paint(Graphics g) {
        if (getal > 0) {
            gevonden = false;
            for (int i = 0; i < tabel.length; i++) {
                if (getal == tabel[i]) {
                    gevonden = true;
                    index = i;
                }
            }
            if (gevonden){
            tekst = "Dit getal staat in de tabel op index: " + index;
            g.drawString(tekst, 50, 50);

        }
        if(!gevonden){
            tekst = "Het ingevoerde getal komt niet voor in het tabel";
            g.drawString(tekst,50,50);
        }

    }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getal = Integer.parseInt(tekstVak.getText());
            repaint();
        }
    }

}