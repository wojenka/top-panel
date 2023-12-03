import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {
    JTextField txt1 = new JTextField();
    Panel1(){
        txt1.setColumns(20);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        add(txt1);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
    }

}
