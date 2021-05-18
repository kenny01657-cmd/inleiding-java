package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PrijsIncBTW extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    double bedrag;
    double bedragIncBTW;


    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("voer hier een bedrag in");
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
    }


    public void paint(Graphics g) {
        g.drawString("Het bedrag inclusief BTW is " + bedragIncBTW + " euro",50,60);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            bedrag = Double.parseDouble(tekstvak.getText());
            bedragIncBTW = (bedrag/100) * 121;
            repaint();
        }
    }

}
