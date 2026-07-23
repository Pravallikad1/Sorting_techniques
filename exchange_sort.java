import java.util.*;
public class exchange_sort{
    public static void sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        sorted(arr);
        System.out.println(Arrays.toString(arr));

    }
}
/*output:
[9, 13, 20, 24, 46, 52]
*/
