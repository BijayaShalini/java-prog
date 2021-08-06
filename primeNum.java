import java.util.*;

public class primeNum{

    public static boolean isPrime(double n){

        if(n<=1)
            return false;
        else{
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the num: ");
            double n= sc.nextInt();
            if(isPrime(n))
                System.out.println("Prime number");
            else
                System.out.println("Not a prime number");

    }
}