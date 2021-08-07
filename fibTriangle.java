import java.util.*;
public class fibTriangle {
    
    //static int a=0, b=1, c=0;

    public static void  fib(int n){
        
        int a=0, b=1, c=0;
        for(int i = 1; i<=n; i++){
            System.out.print(0);;
            a=0;
            b=1;
            for(int j=1; j<i; j++){
                c=a+b;
                System.out.print(" "+ c);
                a=b;
                b=c;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of lines to be printed: ");
        int n= sc.nextInt();
        System.out.println();
        fib(n);
    }
}
