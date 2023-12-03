import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel5  extends JPanel implements ActionListener {
    JButton button = new JButton();
    Panel5(){
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        button.setText("x");
        button.setSize(25,25);
        button.addActionListener(this);
        add(button);
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
