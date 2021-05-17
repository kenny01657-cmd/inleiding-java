package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RekenMachine extends Applet {
    TextField getal1;
    TextField getal2;
    Button keer;
    Button gedeeldDoor;
    Button plus;
    Button min;
    double uitkomst;
    double getal1Double;
    double getal2Double;

    public void init(){
        setSize(500,300);
        getal1 = new TextField("Type hier een getal",20);
        getal2 = new TextField("Type hier een getal",20);
        keer = new Button("*");
        keer.addActionListener(new KeerListener());
        gedeeldDoor = new Button("/");
        gedeeldDoor.addActionListener(new gedeeldDoorListener());
        plus = new Button("+");
        plus.addActionListener(new PlusListener());
        min = new Button("-");
        min.addActionListener(new MinListener());
        add(getal1);
        add(getal2);
        add(keer);
        add(gedeeldDoor);
        add(plus);
        add(min);

    }


    public void paint(Graphics g){
    }

    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getal1Double = Double.parseDouble(getal1.getText());
            getal2Double = Double.parseDouble(getal2.getText());
            uitkomst = getal1Double*getal2Double;
            getal1.setText("" + uitkomst);
            getal2.setText("");
        }
    }

    class gedeeldDoorListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getal1Double = Double.parseDouble(getal1.getText());
            getal2Double = Double.parseDouble(getal2.getText());
            uitkomst = getal1Double/getal2Double;
            getal1.setText("" + uitkomst);
            getal2.setText("");
        }
    }

    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal1Double = Double.parseDouble(getal1.getText());
            getal2Double = Double.parseDouble(getal2.getText());
            uitkomst = getal1Double+getal2Double;
            getal1.setText("" + uitkomst);
            getal2.setText("");
        }
    }

    class MinListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal1Double = Double.parseDouble(getal1.getText());
            getal2Double = Double.parseDouble(getal2.getText());
            uitkomst = getal1Double-getal2Double;
            getal1.setText("" + uitkomst);
            getal2.setText("");
        }
    }
}
