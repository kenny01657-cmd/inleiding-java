package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class HoogsteGetal extends Applet {
    TextField tekstvak;
    Label label;
    double hoogsteGetal;
    double nieuwGetal;
    double vorigGetal;



    public void init() {
        vorigGetal = 0;
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new TekstVakListener());
        label = new Label("Voer hier een getal in en druk op enter");
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g){
        g.drawString("Het hoogste getal is: " + hoogsteGetal,50,60);
    }

    class TekstVakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nieuwGetal = Double.parseDouble(tekstvak.getText());
            if (nieuwGetal > vorigGetal){
                hoogsteGetal = nieuwGetal;
                vorigGetal = hoogsteGetal;
            }
            else {
                hoogsteGetal = vorigGetal;
            }
            repaint();
            tekstvak.setText("");
        }
    }


}
