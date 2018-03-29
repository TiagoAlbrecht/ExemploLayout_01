/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolayouts_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author a1818007
 */
public class GUI extends JFrame {
    Container cp;
    JPanel pnNorte = new JPanel();
    JPanel pnSul = new JPanel();
    JPanel pnOeste = new JPanel();
    JPanel pnLeste = new JPanel();
    JPanel pnCentro = new JPanel();
    JLabel lbTitulo = new JLabel("kefsvgbçevbqeçkvbqev");
    
    public GUI() {
        setSize(700,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp=getContentPane();
        cp.setLayout(new BorderLayout());
        
        cp.add(pnNorte,BorderLayout.NORTH);
        cp.add(pnSul,BorderLayout.SOUTH);
        cp.add(pnOeste,BorderLayout.WEST);
        cp.add(pnLeste,BorderLayout.EAST);
        cp.add(pnCentro,BorderLayout.CENTER);
        pnNorte.setBackground(Color.red);
        pnSul.setBackground(Color.cyan);
        pnLeste.setBackground(Color.PINK);
        pnOeste.setBackground(Color.YELLOW);
        pnCentro.setBackground(Color.MAGENTA);
        setVisible(true);
        setLocationRelativeTo(null); 
        
        pnNorte.add(lbTitulo);
        pnCentro.add(lbTitulo);
    }

   
    
}
