import java.util.*;
public class Bubble_Sort {
    public static void sort(int arr[]){
        int n= arr.length;
        int last=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=last-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    continue;
                }
            }
            last=last-1;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={46,45,34,67,87,22,13,99};
        sort(arr);
    }
}