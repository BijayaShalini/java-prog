import java.util.*;

public class duplicateWords{

    public static void main(String args[]) {
        
        String str = "big black bug bit a big black dog on his big black nose";
        int count;

        str=str.toLowerCase();
        String[] word= str.split(" ");
        
        for(int i=0;i<word.length;i++){
            count=1;
            for(int j=i+1; j<word.length;j++){
                if(word[i].equals(word[j])){
                    count++;
                    word[j]="0";
            }
            }
            if(count>1 && word[i]!="0")
                System.out.println(word[i]+" -> occurs more than once.");
        }
    }
    
}