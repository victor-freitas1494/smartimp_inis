package layout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;


public class janelaGUI extends arquivoInis{
    
    JFrame janelaGUI = new JFrame("Smart INIS");
    buttonGUI buttaoOne = new buttonGUI();
    buttonGUI buttaoTwo = new buttonGUI();
    buttonGUI buttaotwe = new buttonGUI();
    
    public void janelaIniciar(){
        janelaGUI.setSize(560, 450);
        janelaGUI.setLayout(null);
        janelaGUI.setVisible(true);
        janelaGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janelaGUI.setResizable(false);
        janelaGUI.getContentPane().setBackground(Color.WHITE);
    }

    public void buttonIniciar(){
        buttaoOne.iniciaButton("IMP 1", 40, 80, IMP1, iniExit);
        janelaGUI.add(buttaoOne.getbutton());
        buttaoTwo.iniciaButton("IMP 2", 300, 80, IMP2, iniExit);
        janelaGUI.add(buttaoTwo.getbutton());
        buttaotwe.iniciaButton("IMP 3", 40, 200, IMP3, iniExit);
        janelaGUI.add(buttaotwe.getbutton());
    }
}
