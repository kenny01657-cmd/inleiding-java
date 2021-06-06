package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr_Een_Kaart extends Applet {
    int color, type;
    Button shuffle;
    String[] cardColor = {"Schoppen", "Harten", "Klaveren", "Ruiten"};
    String[] cardType = {"Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer", "Aas"};

    public void init() {
        shuffle = new Button("Shuffle");
        shuffle.addActionListener(new ShuffleListener());
        add(shuffle);
    }

    public void paint(Graphics g) {
        g.drawString("" + cardColor[color-1] + " " + cardType[type-1],160,60);
    }

    class ShuffleListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            double getal;
            getal = Math.random();
            color = (int)(getal * (cardColor.length-1) + 1);
            System.out.println(color);
            getal = Math.random();
            type = (int)(getal * (cardType.length-1) + 1);
            System.out.println(type);
            repaint();
        }
    }
}
