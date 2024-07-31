import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;


public class view_emp extends JFrame implements ActionListener{

    JTable table;

    Choice choiceEmp;
    JButton search, print, update, back;

    view_emp(){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/view_emp.gif"));
        Image i2= i1.getImage().getScaledInstance(1100, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1100,750);
        add(image);



        choiceEmp = new Choice();
        choiceEmp.setBounds(320,160,100,30);
        image.add(choiceEmp);


        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee");
            while (resultSet.next()){
                choiceEmp.add(resultSet.getString("Emp_Id"));
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }




        table = new JTable();
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        JScrollPane jp= new JScrollPane(table);
        jp.setBounds(0,260,1100,750);
        image.add(jp);

        search = new JButton("SEARCH");
        search.setBounds(200,210,150,30);
        search.setBackground(Color.black);
        search.setForeground(Color.white);
        search.addActionListener(this);
        image.add(search);

        print = new JButton("PRINT");
        print.setBounds(380,210,150,30);
        print.setBackground(Color.black);
        print.setForeground(Color.white);
        print.addActionListener(this);
        image.add(print);

        update = new JButton("UPDATE");
        update.setBounds(560,210,150,30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        update.addActionListener(this);
        image.add(update);

        back = new JButton("BACK");
        back.setBounds(740,210,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);


        Font font= new Font("Now", Font.BOLD, 20);
        choiceEmp.setFont(font);
        search.setFont(font);
        print.setFont(font);
        update.setFont(font);
        back.setFont(font);
        



        setSize(1100,750);
        setLocation(400,160);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==search){
            String query =" select * from employee where Emp_Id='"+choiceEmp.getSelectedItem()+"'";
            try {
                conn c= new conn();
                ResultSet resultSet=c.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
                
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if(e.getSource()== print){
            try {
                table.print();
                
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if(e.getSource()== update){
            setVisible(false);
            new update_emp(choiceEmp.getSelectedItem());

        }else{
            setVisible(false);
            new main_class();
        }

    }
    

    public static void main(String[] args) {
        new view_emp();
    }

}
