import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


class add_emp extends JFrame implements ActionListener{

    Random ran = new Random();
    int number = ran.nextInt(999999);
    JLabel tempid;

    JTextField tname,   tSector, trole, tsalary, tmobile, temail, taadhar,  taddress ;

    JDateChooser tdob, tjoindate ;

    JComboBox tgender;

    JButton add, back;

    add_emp(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/add_emp.gif"));
        Image i2 = i1.getImage().getScaledInstance(1050,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1050,750);
        add(image);


        //emp_name
        JLabel name= new JLabel("Name :");
        name.setBounds(50,150,150,30);
        name.setForeground(Color.white);
        image.add(name);

        tname = new JTextField();
        tname.setBounds(180,150,450,30);
        tname.setBackground(Color.white);
        image.add(tname);



        //emp id to be generated
        JLabel empid= new JLabel("Emp. Id :");
        empid.setBounds(700,150,150,30);
        empid.setForeground(Color.white);
        image.add(empid);

        tempid = new JLabel(""+number);
        tempid.setBounds(800,150,80,30);
        tempid.setForeground(Color.red);
        tempid.setFont(new Font("Now",Font.BOLD, 20));
        tempid.setBackground(Color.white);
        image.add(tempid);



        //emp DOB
        JLabel dob = new JLabel("DOB :");
        dob.setBounds(50,220,150,30);
        dob.setForeground(Color.white);
        image.add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(180,220,250,30);
        tdob.setBackground(Color.white);
        image.add(tdob);

        //emp gender
        JLabel gender = new JLabel("Gender :");
        gender.setBounds(490,220,150,30);
        gender.setForeground(Color.white);
        image.add(gender);

        String sex[]={" ", "Male", "Female","Other"};
        tgender = new JComboBox<>(sex);
        tgender.setBounds(620,220,250,30);
        tgender.setBackground(Color.white);
        image.add(tgender);



        //emp sector
        JLabel Sector = new JLabel("Sector :");
        Sector.setBounds(50,290,150,30);
        Sector.setForeground(Color.white);
        image.add(Sector);

        tSector = new JTextField();
        tSector.setBounds(180,290,250,30);
        tSector.setBackground(Color.white);
        image.add(tSector);

        //emp role
        JLabel role = new JLabel("Role :");
        role.setBounds(490,290,150,30);
        role.setForeground(Color.white);
        image.add(role);

        trole = new JTextField();
        trole.setBounds(620,290,250,30);
        trole.setBackground(Color.white);
        image.add(trole);



        //emp join date
        JLabel joindate = new JLabel("Join Date :");
        joindate.setBounds(50,360,150,30);
        joindate.setForeground(Color.white);
        image.add(joindate);

        tjoindate = new JDateChooser();
        tjoindate.setBounds(180,360,250,30);
        tjoindate.setBackground(Color.white);
        image.add(tjoindate);

        //emp salary
        JLabel salary = new JLabel("Salary :");
        salary.setBounds(490,360,150,30);
        salary.setForeground(Color.white);
        image.add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(620,360,250,30);
        tsalary.setBackground(Color.white);
        image.add(tsalary);



        //emp email
        JLabel email = new JLabel("Email :");
        email.setBounds(50,430,150,30);
        email.setForeground(Color.white);
        image.add(email);

        temail = new JTextField();
        temail.setBounds(180,430,400,30);
        temail.setBackground(Color.white);
        image.add(temail);



        //emp mobile
        JLabel mobile = new JLabel("Mobile :");
        mobile.setBounds(50,500,150,30);
        mobile.setForeground(Color.white);
        image.add(mobile);

        tmobile = new JTextField();
        tmobile.setBounds(180,500,250,30);
        tmobile.setBackground(Color.white);
        image.add(tmobile);


        
        //emp aadhar
        JLabel aadhar = new JLabel("Aadhar :");
        aadhar.setBounds(490,500,150,30);
        aadhar.setForeground(Color.white);
        image.add(aadhar);

        taadhar = new JTextField();
        taadhar.setBounds(620,500,250,30);
        taadhar.setBackground(Color.white);
        image.add(taadhar);



        //emp address
        JLabel address = new JLabel("Address :");
        address.setBounds(50,570,150,30);
        address.setForeground(Color.white);
        image.add(address);

        taddress = new JTextField();
        taddress.setBounds(180,570,600,30);
        taddress.setBackground(Color.white);
        image.add(taddress);



        add = new JButton("ADD");
        add.setBounds(350,640,150,30);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(this);
        image.add(add);

        back = new JButton("BACK");
        back.setBounds(600,640,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);



        Font font= new Font("Now", Font.BOLD, 20);
        name.setFont(font);
        dob.setFont(font);
        gender.setFont(font);
        Sector.setFont(font);
        role.setFont(font);
        joindate.setFont(font);
        salary.setFont(font);
        mobile.setFont(font);
        email.setFont(font);
        aadhar.setFont(font);
        address.setFont(font);
        empid.setFont(font);
        add.setFont(font);
        back.setFont(font);

        setSize(1050,750);
        setLocation(400,160);
        setLayout(null);
        setVisible(true);

    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add){
            String Name = tname.getText();
            String Emp_Id = tempid.getText();
            String Dob = ((JTextField)tdob.getDateEditor().getUiComponent()).getText();
            String Gender = (String) tgender.getSelectedItem();
            String Sector = tSector.getText();
            String Role = trole.getText();
            String Join_Date = ((JTextField)tjoindate.getDateEditor().getUiComponent()).getText();
            String Salary = tsalary.getText();
            String Mobile = tmobile.getText();
            String Email = temail.getText();
            String Aadhar = taadhar.getText();
            String Address = taddress.getText();

            try {
                conn c = new conn();
                String query= "insert into employee values('"+Name+"','"+Emp_Id+"','"+Dob+"','"+Gender+"','"+Sector+"','"+Role+"','"+Join_Date+"','"+Salary+"','"+Mobile+"','"+Email+"','"+Aadhar+"','"+Address+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                 setVisible(false);
                 new main_class();

            } catch (Exception E) {
                E.printStackTrace();
            }
        }else{
            setVisible(false);
            new main_class();
        }

    }


    public static void main(String[] args) {
        new add_emp();
    }

}
