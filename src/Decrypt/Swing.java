import java.awt.*;
import javax.swing.*;
public class Swing extends JFrame {
    Decrypt0 model;
    JTextField text0,text1;
    JTextArea showArea;
    JButton button;
    Controller controller;
    Swing(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init(){
        model = new Decrypt0();
        text0 = new JTextField(15);
        text1 = new JTextField(15);
        button = new JButton("Decrypt");
        showArea = new JTextArea();
        showArea.setWrapStyleWord(true);
        showArea.setLineWrap(true);
        showArea.setEditable(false);
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("Original text"));
        pNorth.add(text0);
        pNorth.add(new JLabel("Password"));
        pNorth.add(text1);
        pNorth.add(button);
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(showArea),BorderLayout.CENTER);
        controller = new Controller();
        button.addActionListener(controller);
        controller.setSwing(this);
        validate();
    }
}

