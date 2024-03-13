/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg114_tugassatu;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author 123220114
 */
class KotakFrame extends JFrame{
    JLabel tulisan1 = new JLabel("Selamat Datang!");
    JLabel tulisan2 = new JLabel("Silahkan masuk untuk melanjutkan.");

    JLabel user = new JLabel("Username");
    JTextField inputuser = new JTextField();

    JLabel pass = new JLabel("Password");
    JTextField inputpass = new JTextField();

    JLabel gender = new JLabel ("Jenis Kelamin");
    JRadioButton genderlaki = new JRadioButton("Laki-Laki");
    JRadioButton genderperempuan = new JRadioButton("Perempuan");

    JButton tombol = new JButton ("Login");

    KotakFrame(){
        setVisible(true);
        setSize(700, 700);
        setTitle("Frame pertama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(tulisan1);
        tulisan1.setBounds(30, 10, 700, 50);
        tulisan1.setFont (tulisan1.getFont().deriveFont (34.0f));
        
        add(tulisan2);
        tulisan2.setBounds(30, 40, 700, 50);
        tulisan2.setFont (tulisan2.getFont().deriveFont (20.0f));
        
        add(user);
        user.setBounds(30, 100, 700, 50);
        user.setFont (user.getFont().deriveFont (18.0f));
        add(inputuser);
        inputuser.setBounds(30, 145, 550, 30);
        
        add(pass);
        pass.setBounds(30, 200, 700, 50);
        pass.setFont (pass.getFont().deriveFont (18.0f));
        add(inputpass);
        inputpass.setBounds(30, 245, 550, 30);
        
        add(gender);
        gender.setBounds(30, 300, 700, 50);
        gender.setFont (gender.getFont().deriveFont (18.0f));
        
        ButtonGroup pilihgender = new ButtonGroup();
        pilihgender.add(genderlaki);
        pilihgender.add(genderperempuan);
        add(genderlaki);
        genderlaki.setBounds(30, 345, 100, 32);
        add(genderperempuan);
        genderperempuan.setBounds(300, 345, 100, 32);
        
        add(tombol);
        tombol.setBounds(70, 430, 500, 30);
    }
}

public class Login123220114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KotakFrame kotakFrame = new KotakFrame();
    }
    
}
