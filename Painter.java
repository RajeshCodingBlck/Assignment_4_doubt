import java.util.*;
public class Main {

    public static boolean can_paint(int [] arr, int k, int mid){

         int no_of_painter=1;

          int time=0;
         for(int i=0; i<arr.length;i++){

             if(arr[i]>mid){

                 return false;
             }

             if(time+ arr[i]<=mid){
                 time+=arr[i];
             }else{
                 no_of_painter++;
                 time=arr[i];
             }
         }

         if(no_of_painter>k){
             return false;
         }else{
             return true;
         }
    }
    public static void main(String args[]) {
       
       Scanner s= new Scanner(System.in);

       int k= s.nextInt();

       int n= s.nextInt();

       int [] arr= new int[n];

       for(int i=0; i<n;i++){

           arr[i]= s.nextInt();
       }


       int low=1;

       int high=(int)(1e9);

       int ans=-1;


       while(low<=high){

           int mid= (low+high)/2;

           if(can_paint(arr, k, mid)==false){
                  
                  low=mid+1;
           }else{
                ans=mid;

                high=mid-1;
           }
       }

       System.out.println(ans);

    }
}
