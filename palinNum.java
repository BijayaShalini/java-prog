import java.util.Scanner;

public class palinNum{

    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n=num, sum=0;
        while (n>0) {

            int rem = n%10;
            sum=(sum*10)+rem;
            n = n/10;
        }
        if(num==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

    }
}