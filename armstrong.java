import java.util.Scanner;


public class armstrong {
    
    public static void main(String[] args) {
        int n, temp, count=0, digit, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        temp=n;

        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>0){
            digit=temp%10;
            sum+=Math.pow(digit, count);
            temp/=10;
        }
        if(sum==n)
            System.out.println("Armstrong  number");
        else
            System.out.println("Not an armstrong number");
    }
}
