import javax.swing.*;
import java.awt.*;

public class Panel3 extends JPanel{
    JLabel lbl = new JLabel("tytuł działania");
    Panel3(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lbl.setForeground(Color.WHITE);
        add(lbl);
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
    }
}
