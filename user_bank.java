package Internship_CodeSoft;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class atm extends JFrame implements ActionListener{
    JLabel label,label1;
    JFrame frame;
    JButton btnWithdrawal,btnDeposite,btnCheckBalance;
    public static int amount,count=0;
    public static int balance;
    public String input1;
    atm(String s){
        super(s);
        //this.amount=amount;
        getContentPane().setBackground(Color.WHITE);
        label=new JLabel();
        frame=new JFrame("My Frame");
        label.setText(" Select a Transaction ");
        label.setFont(new Font("Tahoma", Font.BOLD, 17));
        add(label);
        label1=new JLabel();
        add(label1);
        label1.setBounds(300, 150, 550, 40);
        label1.setFont(new Font("", Font.BOLD, 17));
        btnWithdrawal = new JButton("Withdrawal");
        btnDeposite = new JButton("Deposite");
        btnCheckBalance = new JButton("CheckBalance");
        btnWithdrawal.addActionListener(this);
        btnDeposite.addActionListener(this);
        btnCheckBalance.addActionListener(this);
        add(btnWithdrawal);
        add(btnDeposite);
        add(btnCheckBalance);
        label.setBounds(300, 20, 550, 40);
        btnWithdrawal.setBounds(100,100,100,30);
        btnDeposite.setBounds(565,100,100,30);
        btnCheckBalance.setBounds(300,250,150,30);
        setLayout(null);
        setLocation(350,100);
        setVisible(true);
        setSize(800, 450);
    }
    void setData(){    
        input1 =JOptionPane.showInputDialog("Enter your amount : ");
        balance=Integer.parseInt(input1);
    }
    public void withdrawal(int balance)
    {    
        if(balance<amount){
            amount-=balance;
            count=1;
            JOptionPane.showMessageDialog(frame, "Your Avalabel Balance is "+amount);
        }
        else{
            JOptionPane.showMessageDialog(frame, "Insuficeant Balance.");
            count=0;
            JOptionPane.showMessageDialog(frame, "Your Avalabel Balance is "+amount);
        }
    }
    public void deposit(int balance){
        amount+=balance;
        count=1;
        JOptionPane.showMessageDialog(frame, "Your Avalabel Balance is "+amount);
    }
    public void print(){
        label1.setText("Your Account Balance is "+amount);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(e.getSource()==btnWithdrawal){
            setData();
            withdrawal(balance);
            if(count==1)
            label1.setText("Withdrwan Successfully !!");
            else
            label1.setText("Transaction Failed !!");
        }
        if(e.getSource()==btnDeposite){
            setData();
            deposit(balance);
            if(count==1)
            label1.setText("Deposit Successfully !!");
            else
            label1.setText("Transaction Failed !!");
        }
        if(e.getSource()==btnCheckBalance){
            print();
        }
    }   
}
public class user_bank {
    //static int amount =0;
    public static void main(String[] args) {
        new atm("Simple ATM Machine.");
    }    
}
