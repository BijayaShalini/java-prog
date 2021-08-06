import java.util.Scanner;

public class palinRec {
    
    static int Rec(int n, int temp){
        if(n==0)
            return temp;
        else{
            temp = (temp*10)+(n%10);
            return Rec(n/10, temp);
        }

    }
    public static void main(String args[]) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n= sc.nextInt();
        int temp = Rec(n,0);
        if(n==temp)
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");
    }
}
