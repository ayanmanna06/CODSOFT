
// Task 4
//package Internship_CodeSoft;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class quzi_app extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0;
    public static int timer = 30;
    public static int ans_given = 0;

    quzi_app(String s) {
        super(s);
        getContentPane().setBackground(Color.WHITE);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnNext.addActionListener(this);
        btnResult.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30, 40, 450, 20);
        radioButtons[0].setBounds(50, 80, 450, 40);
        radioButtons[1].setBounds(50, 110, 450, 40);
        radioButtons[2].setBounds(50, 140, 450, 40);
        radioButtons[3].setBounds(50, 170, 450, 40);
        radioButtons[0].setBackground(Color.WHITE);
        radioButtons[1].setBackground(Color.WHITE);
        radioButtons[2].setBackground(Color.WHITE);
        radioButtons[3].setBackground(Color.WHITE);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    void setData() {
        radioButtons[4].setSelected(true);
        if (current == 0) {
            label.setText("Q1 : JDK stands for ____.");
            radioButtons[0].setText("Java development kit");
            radioButtons[1].setText("Java deployment kit");
            radioButtons[2].setText("JavaScript deployment kit");
            radioButtons[3].setText("None of these");
        }
        if (current == 1) {
            label.setText("Q2 : What makes the Java platform independent ?");
            radioButtons[0].setText("Advanced programming-language");
            radioButtons[1].setText("It uses bytecode for execution");
            radioButtons[2].setText("Class compilation");
            radioButtons[3].setText("All of these");
        }
        if (current == 2) {
            label.setText("Q3 : What are the types of memory allocated in memory in java ?");
            radioButtons[0].setText("Heap memory");
            radioButtons[1].setText("Stack memory");
            radioButtons[2].setText("Both A and B");
            radioButtons[3].setText("None of these");
        }
        if (current == 3) {
            label.setText("Q4 : What is the entry point of a program in Java ?");
            radioButtons[0].setText("main() method");
            radioButtons[1].setText("The first line of code");
            radioButtons[2].setText("Last line of code");
            radioButtons[3].setText("main class");
        }
        if (current == 4) {
            label.setText("Q5 :  Which keyword in java is used for exception handling ?");
            radioButtons[0].setText("exep");
            radioButtons[1].setText("excepHand");
            radioButtons[2].setText("throw");
            radioButtons[3].setText("All of these");
        }
        if (current == 5) {
            label.setText("Q6 : Which class in Java is used to take input from the user ?");
            radioButtons[0].setText("Scanner");
            radioButtons[1].setText("Input");
            radioButtons[2].setText("Applier");
            radioButtons[3].setText("None of these");
        }
        if (current == 6) {
            label.setText("Q7 : Which of these is a type of variable in Java ?");
            radioButtons[0].setText("Instance Variable");
            radioButtons[1].setText("Local Variable");
            radioButtons[2].setText("Static Variable");
            radioButtons[3].setText("All of these");
        }
        if (current == 7) {
            label.setText("Q8 : Which graph is used to check for deadlock in Java ?");
            radioButtons[0].setText("Deadlock graph");
            radioButtons[1].setText("Time graph");
            radioButtons[2].setText("Wait-for-graph");
            radioButtons[3].setText("None of these");
        }
        if (current == 8) {
            label.setText("Q9 : Which of the following can be declared as final in java ?");
            radioButtons[0].setText("Class");
            radioButtons[1].setText("Method");
            radioButtons[2].setText("Variable");
            radioButtons[3].setText("All of these");
        }
        if (current == 9) {
            label.setText("Q10 :  Finally block is attached to ?");
            radioButtons[0].setText("Try-catch block");
            radioButtons[1].setText("Class block");
            radioButtons[2].setText("Method block");
            radioButtons[3].setText("All of these");
        }
        if (current == 10) {
            label.setText("Q11:Can the Java program accept input from the command line?");
            radioButtons[0].setText("Yes, using command-line arguments");
            radioButtons[1].setText("Yes, by access command prompt");
            radioButtons[2].setText("No");
            radioButtons[3].setText("None of these");
        }
        if (current == 11) {
            label.setText("Q12 : What is garbage collection in java ?");
            radioButtons[0].setText("Method to manage memory in java");
            radioButtons[1].setText("Create new garbage values");
            radioButtons[2].setText("Delete all values");
            radioButtons[3].setText("All of these");
        }
        if (current == 12) {
            label.setText("Q13 :  Static variables in java are declared as ___.");
            radioButtons[0].setText("final variables");
            radioButtons[1].setText("new variables");
            radioButtons[2].setText("Constants");
            radioButtons[3].setText("All of these");
        }
        if (current == 13) {
            label.setText("Q14 : 'this' keyword in java is ___.");
            radioButtons[0].setText("Used to hold the reference of the current object");
            radioButtons[1].setText("Holds object value");
            radioButtons[2].setText("Used to create a new instance");
            radioButtons[3].setText("All of these");
        }
        if (current == 14) {
            label.setText("Q15 :  Encapsulation is ___.");
            radioButtons[0].setText("Wrapping up of data and related functions into a single entity");
            radioButtons[1].setText("Creating special methods");
            radioButtons[2].setText("Creating special data structure");
            radioButtons[3].setText("All of these");
        }
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 300, 20);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String time = "Time left -  " + timer + " seconds.";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 17));

        if (timer > 0) {
            g.drawString(time, 398, 85);
        } else {
            g.drawString("Times Up!!", 398, 85);
            if (bg.getSelection() == null) {
                ans_given = 0;
            } else {
                if (checkAns()) {
                    count++;
                }
                current++;
                timer = 30; // Reset the timer to 15 seconds
                setData();
                ans_given = 1; // Mark that an answer has been given
            }
        }

        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        }
    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[0].isSelected());
        }
        if (current == 1) {
            return (radioButtons[1].isSelected());
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[2].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[3].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[3].isSelected());
        }
        if (current == 9) {
            return (radioButtons[0].isSelected());
        }
        if (current == 10) {
            return (radioButtons[0].isSelected());
        }
        if (current == 11) {
            return (radioButtons[0].isSelected());
        }
        if (current == 12) {
            return (radioButtons[3].isSelected());
        }
        if (current == 13) {
            return (radioButtons[1].isSelected());
        }
        if (current == 14) {
            return (radioButtons[0].isSelected());
        }
        return false;
    }

    public static void main(String[] args) {
        new quzi_app("Simple Quiz App.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            timer = 0;

            if (bg.getSelection() == null) {
                ans_given = 0; // Set ans_given to 0 when no option is chosen
            } else {
                if (checkAns()) {
                    count++;
                }
                current++;
                timer = 30; // Reset the timer to 15 seconds
                setData();
                ans_given = 1; // Mark that an answer has been given
            }
        }
        if (current == 14) {
            btnNext.setEnabled(false);
            btnResult.setVisible(true);
            btnResult.setText("Result");
        }
        if (e.getActionCommand().equals("Result")) {
            if (checkAns())
                count = count + 1;
            current++;
            JOptionPane.showMessageDialog(this, "Correct Answer are " + count + " Out of 15");
            System.exit(0);
        }
    }
}
