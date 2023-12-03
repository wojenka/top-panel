import javax.swing.*;
import java.awt.*;

public class Panel4  extends JPanel {
    JLabel lbl1 = new JLabel(" ");
    Panel4(){
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        setForeground(Color.WHITE);
        lbl1.setForeground(Color.WHITE);
        add(lbl1);
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);

    }
}
