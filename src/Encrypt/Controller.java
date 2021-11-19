import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Controller implements ActionListener {
    Swing mvc;
    public void setSwing(Swing mvc){
        this.mvc = mvc;
    }
    public void actionPerformed(ActiveEvent e){

    }
    public void actionPerformed(ActionEvent e) {
        try {
            String v0 = mvc.text0.getText().trim();
            String v1 = mvc.text1.getText().trim();
            mvc.model.setOri(v0);
            mvc.model.setVia(v1);
            String result = mvc.model.getEncry();
            mvc.showArea.append(result + "\n");
        }catch (Exception exp){
            mvc.showArea.append("\n"+exp+"Unexpected error");
        }
    }
}
