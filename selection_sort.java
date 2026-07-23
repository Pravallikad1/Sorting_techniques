import java.util.*;
public class selection_sort{
    public static void sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
         
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

    }
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        sorted(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));

    }
}
/*output:
The sorted array is [9, 13, 20, 24, 46, 52]
  */
