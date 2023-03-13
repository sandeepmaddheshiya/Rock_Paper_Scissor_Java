import java.util.*;

public class Rock_Paper_Scissor{
    //0-Rock
    //1-Paper
    //2-Scissor

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int c=r.nextInt(3);
        System.out.println("0- for Rock, 1- for Paper, 2- for Scissor");
        int n=sc.nextInt();

        if(c==n){
            System.out.println("Draw");
        }
        else if(c==0 && n==1 || c==1 && n==2 || c==2 && n==0){
            System.out.println("You Won!");
        }
        else{
            System.out.println("You Lose");
        }
        System.out.println("Computer choice:"+c);

    }
}