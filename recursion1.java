// recursion function to count factorial of a number
import java.util.Scanner;

class Factorial {
    int fact(int n){
        int result;
        if(n==1)
            return 1;
        result=fact(n-1)*n;
        return result;
    }
}
class recursion1{
    public static void main(String args[]){
        Factorial f= new Factorial();
        int n;
        System.out.println("Enter number:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Factorial is:"+ f.fact(n));
    }
}