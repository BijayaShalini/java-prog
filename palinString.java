import java.util.Scanner;
import java.util.*;

public class palinString {
    
    public static void main(String args[]) {
        
        Scanner sc= new Scanner(System.in);
        String str, rev="";
        System.out.println("Enter the string: ");
        str= sc.nextLine();
        int n=str.length();
        for(int i = n-1 ; i>=0; i--){
            rev= rev+ str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println("Palindrome");
        else    
            System.out.println("not a palindrome");

    }
}
