import java.util.*;

public class insertionSort {
    
    static void sort(int[] arr){

        int key, n;
        n=arr.length;
        for(int i=1; i<n; i++){
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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
