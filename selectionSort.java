import java.util.*;

public class selectionSort {
    
    static void sort(int[] arr){

        int key, n, temp;
        n=arr.length;
        for(int i=0; i<n; i++){
            key=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[key]){
                    key=j;
                }
            }
            temp=arr[key];
            arr[key]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
       
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        sort(arr);
        System.out.println("");
        System.out.println("The sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
