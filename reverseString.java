import java.util.*;
import java.lang.*;

public class reverseString {

    public static void main(String args[]) {

        String str = "my name is bijaya";
        StringBuilder sb= new StringBuilder();

        //String str1 = str.replaceAll("\\s", " ").trim();
        String[] str2 = str.split(" ");

        for(int i= str2.length-1; i>=0; i--){

            sb.append(str2[i]).append(" ");

        }

        System.out.println(sb.toString().trim());
               
    }
}
