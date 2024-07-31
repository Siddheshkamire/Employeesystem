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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class update_emp extends JFrame implements ActionListener {

    JTextField tname, tgender, tdob, tSector, trole, tjoindate, tsalary, temail, tmobile, taadhar, taddress ;
    JButton update, back;
    JLabel tempid;
    String number;

    update_emp(String number) {
        this.number = number;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update_emp.gif"));
        Image i2 = i1.getImage().getScaledInstance(1050, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1050, 750);
        add(image);

        // emp_name
        JLabel name = new JLabel("Name :");
        name.setBounds(50, 150, 150, 30);
        name.setForeground(Color.white);
        image.add(name);

        JLabel tname = new JLabel();
        tname.setBounds(180, 150, 450, 30);
        tname.setFont(new Font("Now", Font.BOLD, 16));
        tname.setForeground(Color.WHITE);
        tname.setBackground(Color.white);
        image.add(tname);

        // emp id to be generated
        JLabel empid = new JLabel("Emp. Id :");
        empid.setBounds(490, 150, 150, 30);
        empid.setForeground(Color.white);
        image.add(empid);

        tempid = new JLabel();
        tempid.setBounds(620, 150, 80, 30);
        tempid.setForeground(Color.red);
        tempid.setFont(new Font("Now", Font.BOLD, 20));
        tempid.setBackground(Color.white);
        image.add(tempid);

        // emp DOB
        JLabel dob = new JLabel("DOB :");
        dob.setBounds(50, 220, 150, 30);
        dob.setForeground(Color.white);
        image.add(dob);

        JLabel tdob = new JLabel();
        tdob.setBounds(180, 220, 250, 30);
        tdob.setFont(new Font("Now", Font.BOLD, 16));
        tdob.setForeground(Color.WHITE);
        image.add(tdob);

        // emp gender
        JLabel gender = new JLabel("Gender :");
        gender.setBounds(490, 220, 150, 30);
        gender.setForeground(Color.white);
        image.add(gender);

        tgender = new JTextField();
        tgender.setBounds(620, 220, 250, 30);
        tgender.setFont(new Font("Now", Font.BOLD, 16));
        tgender.setBackground(Color.white);
        image.add(tgender);

        // emp sector
        JLabel Sector = new JLabel("Sector :");
        Sector.setBounds(50, 290, 150, 30);
        Sector.setForeground(Color.white);
        image.add(Sector);

        tSector = new JTextField();
        tSector.setBounds(180, 290, 250, 30);
        tSector.setFont(new Font("Now", Font.BOLD, 16));
        tSector.setBackground(Color.white);
        image.add(tSector);

        // emp role
        JLabel role = new JLabel("Role :");
        role.setBounds(490, 290, 150, 30);
        role.setForeground(Color.white);
        image.add(role);

        trole = new JTextField();
        trole.setBounds(620, 290, 250, 30);
        trole.setFont(new Font("Now", Font.BOLD, 16));
        trole.setBackground(Color.white);
        image.add(trole);

        // emp join date
        JLabel joindate = new JLabel("Join Date :");
        joindate.setBounds(50, 360, 150, 30);
        joindate.setForeground(Color.white);
        image.add(joindate);

        JLabel tjoindate = new JLabel();
        tjoindate.setBounds(180, 360, 250, 30);
        tjoindate.setFont(new Font("Now", Font.BOLD, 16));
        tjoindate.setForeground(Color.WHITE);
        image.add(tjoindate);

        // emp salary
        JLabel salary = new JLabel("Salary :");
        salary.setBounds(490, 360, 150, 30);
        salary.setForeground(Color.white);
        image.add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(620, 360, 250, 30);
        tsalary.setFont(new Font("Now", Font.BOLD, 16));
        tsalary.setBackground(Color.white);
        image.add(tsalary);

        // emp email
        JLabel email = new JLabel("Email :");
        email.setBounds(50, 430, 150, 30);
        email.setForeground(Color.white);
        image.add(email);

        temail = new JTextField();
        temail.setBounds(180, 430, 400, 30);
        temail.setFont(new Font("Now", Font.BOLD, 16));
        temail.setBackground(Color.white);
        image.add(temail);

        // emp mobile
        JLabel mobile = new JLabel("Mobile :");
        mobile.setBounds(50, 500, 150, 30);
        mobile.setForeground(Color.white);
        image.add(mobile);

        tmobile = new JTextField();
        tmobile.setBounds(180, 500, 250, 30);
        tmobile.setFont(new Font("Now", Font.BOLD, 16));
        tmobile.setBackground(Color.white);
        image.add(tmobile);

        // emp aadhar
        JLabel aadhar = new JLabel("Aadhar :");
        aadhar.setBounds(490, 500, 150, 30);
        aadhar.setForeground(Color.white);
        image.add(aadhar);

        JLabel taadhar = new JLabel();
        taadhar.setBounds(620, 500, 250, 30);
        taadhar.setFont(new Font("Now", Font.BOLD, 16));
        taadhar.setForeground(Color.WHITE);
        taadhar.setBackground(Color.white);
        image.add(taadhar);

        // emp address
        JLabel address = new JLabel("Address :");
        address.setBounds(50, 570, 150, 30);
        address.setForeground(Color.white);
        image.add(address);

        taddress = new JTextField();
        taddress.setBounds(180, 570, 600, 30);
        taddress.setFont(new Font("Now", Font.BOLD, 16));
        taddress.setBackground(Color.white);
        image.add(taddress);

        try {
            conn c = new conn();
            String query = "select * from employee where Emp_Id ='" + number + "'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()) {
                tname.setText(resultSet.getString("Name"));
                tempid.setText(resultSet.getString("Emp_Id"));
                tdob.setText(resultSet.getString("Date_of_Birth"));
                tgender.setText(resultSet.getString("Gender"));
                tSector.setText(resultSet.getString("Sector"));
                trole.setText(resultSet.getString("Role"));
                tjoindate.setText(resultSet.getString("Join_Date"));
                tsalary.setText(resultSet.getString("Salary"));
                temail.setText(resultSet.getString("Email"));
                tmobile.setText(resultSet.getString("Mobile_No"));
                taadhar.setText(resultSet.getString("Aadhar_No"));
                taddress.setText(resultSet.getString("Address"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        update = new JButton("UPDATE");
        update.setBounds(350, 640, 150, 30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        update.addActionListener(this);
        image.add(update);

        back = new JButton("BACK");
        back.setBounds(600, 640, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);

        Font font = new Font("Now", Font.BOLD, 20);
        name.setFont(font);
        // tname.setFont(font);
        dob.setFont(font);
        // tdob.setFont(font);
        gender.setFont(font);
        Sector.setFont(font);
        role.setFont(font);
        joindate.setFont(font);
        // tjoindate.setFont(font);
        salary.setFont(font);
        mobile.setFont(font);
        email.setFont(font);
        aadhar.setFont(font);
        // taadhar.setFont(font);
        address.setFont(font);
        empid.setFont(font);
        update.setFont(font);
        back.setFont(font);

        setSize(1050, 750);
        setLocation(400, 160);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == update) {
            String gender = tgender.getText();
            String Sector = tSector.getText();
            String role = trole.getText();
            String salary = tsalary.getText();
            String email = temail.getText();
            String mobile = tmobile.getText();
            String address = taddress.getText();

            try {
                conn c = new conn();
                String query = "update employee set Gender='" + gender + "', Sector='" + Sector + "', Role='" + role + "', Salary='" + salary + "', Email='" + email + "', Mobile_No='" + mobile + "', Address='" + address + "' where Emp_Id = '" + number + "'";
                c.statement.executeUpdate(query); 
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new main_class();

            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            setVisible(false);
            new view_emp();
        }
    }

    public static void main(String[] args) {
        new update_emp("");
    }
}
