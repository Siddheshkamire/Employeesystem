
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main_class extends JFrame{



    main_class(){

        

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/menu.gif"));
        Image i2= i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JButton add = new JButton("ADD");
        add.setBounds(120, 375,150,40);
        add.setForeground(Color.black);
        add.setBackground(Color.white);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        img.add(add);



        JButton view = new JButton("VIEW");
        view.setBounds(490, 375,150,40);
        view.setForeground(Color.black);
        view.setBackground(Color.white);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        img.add(view);



        JButton remove = new JButton("REMOVE");
        remove.setBounds(860, 375,150,40);
        remove.setBackground(Color.white);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        img.add(remove);



        Font font= new Font("Arial", Font.BOLD, 16);
        add.setFont(font);
        view.setFont(font);
        remove.setFont(font);
        
        setSize(1120,630);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new main_class();
    }

}
