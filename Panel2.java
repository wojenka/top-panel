import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {
    JButton btn1 = new JButton("ustaw działanie");
    Panel2(){
        setLayout(new FlowLayout(FlowLayout.LEADING));
        add(btn1);
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
    }
}
