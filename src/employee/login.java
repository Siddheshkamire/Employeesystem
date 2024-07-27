
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener{

    JTextField tusername;
    JPasswordField tpassword;

    JButton login,back;
   

    login(){

        JLabel username= new JLabel("Username");
        username.setBounds(40,20,100,30);
        username.setForeground(Color.white);
        add(username);

        tusername=new JTextField();
        tusername.setBounds(150, 20, 150, 30);
        add(tusername);



        JLabel password= new JLabel("Password");
        password.setBounds(40,70,100,30);
        password.setForeground(Color.white);
        add(password);

        tpassword= new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);


        login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/Login.PNG"));
        Image i2=i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);


        setSize(600, 300);
        setLocation(700,350);
        setLayout(null);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){

        }
        else if(e.getSource()==back){
            System.exit(90);
        }

    }


    public static void main(String[] args) {
        new login();
    }

}