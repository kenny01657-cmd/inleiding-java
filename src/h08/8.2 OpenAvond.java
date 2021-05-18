package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class OpenAvond extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    Button knop;
    int getal1;
    int getal2;
    int getal3;
    int getal4;
    int totaal;


    public void init() {
        setSize(900, 400);
        tekstvak1 = new TextField("Vrouwelijke bezoekers", 20);
        tekstvak2 = new TextField("Mannelijke bezoekers", 20);
        tekstvak3 = new TextField("Mogelijke vrouwelijke leerling", 30);
        tekstvak4 = new TextField("Mogelijke mannelijke leerling", 30);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(knop);
    }


    public void paint(Graphics g) {
        g.drawString("Aantal vrouwelijke bezoekers " + getal1,50,60);
        g.drawString("Aantal manneleijke bezoekers " + getal2,50,80);
        g.drawString("Aantal Mogelijke vrouwelijke leerlingen " + getal3,50,100);
        g.drawString("Aantal Mogelijke mannelijke leerlingen " + getal4,50,120);
        g.drawString("Het totaal aantal bezoekers " + totaal,50,140);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            getal3 = Integer.parseInt(tekstvak3.getText());
            getal4 = Integer.parseInt(tekstvak4.getText());
            totaal = getal1 + getal2;
            repaint();
        }
    }

}
