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
        setSize(700,400);
        rodeMuur = new Button("Rode muur");
        rodeMuur.addActionListener(new RodeMuurListener());
        grijzeMuur = new Button("Grijze muur");
        grijzeMuur.addActionListener(new GrijzeMuurListener());
        add(rodeMuur);
        add(grijzeMuur);
    }

    public void paint(Graphics g) {
        tekenMuur(g,60,30,50,50,70, 40);
    }

    void tekenMuur(Graphics g, int width, int height, int X, int Y, int width2, int height2){
        if (rodeMuurWeerg){
            rodeMuurWeerg = false;
            int aantalBakstenen;
            int X1;
            X1 = X;
            aantalBakstenen = 56;
            for(int i = 0; i < aantalBakstenen; i++){
                g.setColor(Color.RED);
                g.fillRect(X,Y,width,height);
                g.setColor(Color.black);
                g.drawRect(X,Y,width,height);
                X += width;

                if(X == X1 + width*7){
                    g.setColor(Color.red);
                    g.fillRect(X,Y,width/2,height);
                    g.setColor(Color.black);
                    g.drawRect(X,Y,width/2,height);
                    X -= width*7-(width/2);
                    Y += height;
                    if(i < 49) {
                        g.setColor(Color.red);
                        g.fillRect(X - (width / 2), Y, width / 2, height);
                        g.setColor(Color.black);
                        g.drawRect(X - (width / 2), Y, width / 2, height);
                    }
                }
                else if (X == (X1+width/2) + width*7){
                    X -= width*7+(width/2);
                    Y += height;
                }
            }
        }
        else if (grijzeMuurWeerg){
            grijzeMuurWeerg = false;
            int aantalBakstenen;
            int X1;
            X1 = X;
            aantalBakstenen = 49;
            for(int i = 0; i < aantalBakstenen; i++){
                g.setColor(Color.gray);
                g.fillRect(X,Y,width2,height2);
                g.setColor(Color.black);
                g.drawRect(X,Y,width2,height2);
                X += width2;

                if(X == X1 + width2*7){
                    g.setColor(Color.gray);
                    g.fillRect(X,Y,width2/2,height2);
                    g.setColor(Color.black);
                    g.drawRect(X,Y,width2/2,height2);
                    X -= width2*7-(width2/2);
                    Y += height2;
                    if(i < 48) {
                        g.setColor(Color.gray);
                        g.fillRect(X - (width2 / 2), Y, width2 / 2, height2);
                        g.setColor(Color.black);
                        g.drawRect(X - (width2 / 2), Y, width2 / 2, height2);
                    }
                }
                else if (X == (X1+width2/2) + width2*7){
                    X -= width2*7+(width2/2);
                    Y += height2;
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
