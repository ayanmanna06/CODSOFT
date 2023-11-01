// Number Game Project OR Task -1
package Internship_CodeSoft;
import java.util.Scanner;
class game
{
    int num,min,max;
    static int count=0,round,win,rand,at;
    game(int n,int min,int max)
    {
        num=n;
        this.min=min;
        this.max=max;
    }
     void random()
    {
        rand=(int)(Math.random()*(max-min+1)+min);
    }
    static void rule(){
        System.out.println("************** Rule of this game *****************");
        System.out.println("1. You have to enter the range of this number game.");
        System.out.println("2. You have to guess a number between a given range.");
        System.out.println("3. Depending your guess and generated number , your result will show.");
        System.out.println("4. You can play multiple round but In each round you can maximun attemp 3times.");
        System.out.println("5. After Ending the Game you will see the final result.");
    }
    void checkGuess()
    {
        at=0;
        count+=1;
        if(num>rand)
            System.out.println("Your Guess is High.");
        else if(num<rand)
            System.out.println("Your Guess is too Low.");
        else{
            System.out.println("Your Guess is correct.");
            win+=1;
            at+=1;
        } 
    }
    static void DisplayResult()
    {
        System.out.println("/n******** Final Score ********");
        System.out.println("You Play upto "+round+" Round.");
        System.out.println("You attemp "+count+" number of times.");
        System.out.println("And you win "+win+" times.");
    }
}
//// Main Program
public class number_game 
{
    public static void main(String[] args) 
    {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        game.rule();
        while(ch=='y')
        {
            int count=0,gs=0;
            System.out.println("Enter minimum Value :");
            int min=sc.nextInt();
            System.out.println("Enter maximum Value :");
            int max=sc.nextInt();
            game g=new game(gs,min,max);
            g.random();
            do{
                count+=1;
                System.out.println("Guess the number between "+min+" to "+max);
                gs=sc.nextInt();
                game G=new game(gs,min,max);
                G.checkGuess();
            }while(game.at!=1 && count!=3);
            sc.nextLine();
            System.out.println("Do you want to play in next Round ?(yes--> y and No--> n) ");
            String op=sc.nextLine();
            ch=op.charAt(0);
            game.round+=1;
        }
        game.DisplayResult();
    } 
}
