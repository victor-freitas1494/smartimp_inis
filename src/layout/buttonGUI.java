package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


import javax.swing.JButton;

public class buttonGUI {
    
    JButton impressora = new JButton();
    
    int buttonx = 200;
    int buttony = 80;

    public void iniciaButton(String Nome, int t1, int t2, File arquivo, File destino){
        impressora.setText(Nome);
        impressora.setBounds(t1, t2, buttonx, buttony);
        impressora.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
                    try {
                        copiar(arquivo, destino);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
            }
        });
    }

    public JButton getbutton(){
        return this.impressora;
    }

    static void copiar(File fonte, File destino) throws IOException{
        InputStream in = new FileInputStream(fonte);
        OutputStream out = new FileOutputStream(destino);
     
        byte[] buf = new byte[1024];
        int len;
        while((len = in.read(buf)) > 0){
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }
}
