import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements KeyListener{
    JFrame box = new JFrame();
    Panel4 p4 = new Panel4();
    Window(){
        //Set undecorated pozbywa się belki tytułowej okna
        box.setUndecorated(true);
        box.setLayout(new GridLayout(1,5,0,0));
        //Set focusable ustawia początkową obsługę klawiszy
        box.setFocusable(true);
        //Set focusTravelsalKeysEnabled(false) sprawia, że nie ważne na jakim panelu jest "fokus" keyListener zawsze będzie działał
        box.setFocusTraversalKeysEnabled(false);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth() pobiera szerokośc ekranu, możemy to samo zrobić z wysokością
        box.setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),25);
        //setLocation ustawia lokalizacje ekranu na monitorze
        box.setLocation(0,0);
        Panel1 p1 = new Panel1();
        Panel2 p2 = new Panel2();
        Panel3 p3 = new Panel3();
        Panel5 p5 = new Panel5();
        p5.setSize(20,20);
        p2.btn1.addActionListener(e -> p3.lbl.setText(p1.txt1.getText()));
        //keyListener "słucha" czy żaden klawisz nie został wciśnięty i w razie takiego wypadku, wysyła sygnał do funkcji keyTyped, keyPressed, keyReleased
        p1.txt1.addKeyListener(this);
        box.add(p1);
        box.add(p2);
        box.add(p3);
        box.add(p4);
        box.add(p5);
        box.setForeground(Color.WHITE);
        box.setBackground(Color.BLACK);
        box.addKeyListener(this);
        //to samo co keyListener ale dla myszki
        box.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                int src = e.getButton();
                String odp;
                if(src == 1){
                    odp = "left";
                }
                else if(src == 2){
                    odp = "scroll";
                }
                else if(src == 3){
                    odp = "right";
                }
                else{
                    odp = "side button";
                }
                p4.lbl1.setText(odp);
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}

        });
        box.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        String text = KeyEvent.getKeyText(e.getKeyCode());
        p4.lbl1.setText(text);
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    public static void main(String[] args) {
        Window window = new Window();
    }
}
