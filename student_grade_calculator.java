// Task 2 
//package Internship_CodeSoft;

import java.util.Scanner;

class marks_obtained {
    double mark;

    marks_obtained(double mark) {
        this.mark = mark;
    }

    char grade() {
        if (mark >= 90)
            return 'O';
        else if (mark >= 80)
            return 'E';
        else if (mark >= 70)
            return 'A';
        else if (mark >= 60)
            return 'B';
        else if (mark >= 50)
            return 'C';
        else if (mark >= 40)
            return 'D';
        else
            return 'F';
    }

    static void Display() {
        System.out.println("Where ,");
        System.out.println("O --> Outstanding.");
        System.out.println("E --> Excelent.");
        System.out.println("A --> Very Good.");
        System.out.println("B --> Good.");
        System.out.println("C --> Average.");
        System.out.println("D --> Well/Pass marks");
    }
}

public class student_grade_calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject");
        int n = sc.nextInt();
        double t_ob = 0.0, m;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks of " + i + " no subject (out of 100):");
            m = sc.nextDouble();
            if (m > 100) {
                System.out.println("You Enter a Invalid Marks.");
                return;
            }
            t_ob += m;
        }
        double avg = t_ob / n;
        marks_obtained mb = new marks_obtained(avg);
        System.out.println("Total Marks obtained marks is " + t_ob + " out of " + n * 100);
        System.out.printf("Avgerage percentage = %.2f", avg);
        System.out.print("%\n");
        System.out.println("Grade = " + mb.grade());
        marks_obtained.Display();
    }
}
