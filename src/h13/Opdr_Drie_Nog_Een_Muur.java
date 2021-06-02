package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr_Drie_Nog_Een_Muur extends Applet {
    Button rodeMuur;
    Button grijzeMuur;
    boolean rodeMuurWeerg;
    boolean grijzeMuurWeerg;

    public void init() {
        setSize(600,300);
        rodeMuur = new Button("Rode muur");
        rodeMuur.addActionListener(new RodeMuurListener());
        grijzeMuur = new Button("Grijze muur");
        grijzeMuur.addActionListener(new GrijzeMuurListener());
        add(rodeMuur);
        add(grijzeMuur);
    }

    public void paint(Graphics g) {
        tekenMuur(g,50,30,50,50);
    }

    void tekenMuur(Graphics g, int width, int height, int X, int Y){
        if (rodeMuurWeerg){
            rodeMuurWeerg = false;
            int aantalBakstenen;
            int X1;
            X1 = X;
            aantalBakstenen = 70;
            for(int i = 0; i < aantalBakstenen; i++){
                g.setColor(Color.RED);
                g.fillRect(X,Y,width,height);
                g.setColor(Color.black);
                g.drawRect(X,Y,width,height);
                X += width;

                if(X == X1 + width*10){
                    X -= width*10;
                    Y += height;
                }
            }
        }
        else if (grijzeMuurWeerg){
            grijzeMuurWeerg = false;
            int aantalBakstenen;
            int X1;
            X1 = X;
            aantalBakstenen = 30;
            for(int i = 0; i < aantalBakstenen; i++){
                g.setColor(Color.gray);
                g.fillRect(X,Y,width*2,height);
                g.setColor(Color.black);
                g.drawRect(X,Y,width*2,height);
                X += width*2;

                if(X == X1 + width*10){
                    X -= width*10;
                    Y += height;
                }
            }
        }
    }

    class RodeMuurListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            rodeMuurWeerg = true;
            repaint();
        }
    }

    class GrijzeMuurListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            grijzeMuurWeerg = true;
            repaint();
        }
    }

}
