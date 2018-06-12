package mktApp.utility;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diego Iturrizaga
 */

public class Clean {
    public void limpiar(JPanel J){
        for (int i = 0; i<J.getComponents().length;i++) {
            if(J.getComponents()[i] instanceof JTextField){
                ((JTextField)J.getComponents()[i]).setText("");
            }else if(J.getComponents()[i] instanceof JComboBox){
                ((JComboBox)J.getComponents()[i]).setSelectedItem(1);
            }
        }
    }
}
