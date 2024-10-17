package br.com.gerenciamentoestoque.func;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Utilitarios {
    public void LimparTela(JPanel container){
        Component conponents[] = container.getComponents();
        for(Component component : conponents){
            if(component instanceof JTextField){
                ((JTextField)component).setText(null);
            }
        }
    }
}
