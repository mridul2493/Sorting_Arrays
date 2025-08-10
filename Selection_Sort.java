import java.util.*;
public class Selection_Sort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                    continue;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={46,24,56,34,44,26,13,9};
        sort(arr);
    }
}