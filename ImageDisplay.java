import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageDisplay extends JFrame implements ActionListener {
    ImageIcon image;
    JLabel label;
    JButton button;
    Container con;
    JPanel pan1;
    public ImageDisplay(){//constructor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLayout(new BorderLayout());
        init();

    }
    private void init(){
       con = getContentPane();
       image = new ImageIcon("../JAVA/team.jpg");
       label = new JLabel();
       pan1 = new JPanel();
       button = new JButton("Display");
       con.add(pan1,BorderLayout.NORTH);
       pan1.setPreferredSize(new Dimension(500,300));
       pan1.setBorder(BorderFactory.createRaisedBevelBorder());
       pan1.add(label);
       con.add(button);
       button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){//actionperformed
        Object source = e.getSource();
        if(source == button){
            label.setIcon(image);
        }
    }
    public static void main(String[] args) {
       ImageDisplay i = new ImageDisplay();
       i.setVisible(true); 
    }
}
