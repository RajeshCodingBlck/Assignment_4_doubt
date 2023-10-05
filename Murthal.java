import java.util.*;
public class Main {

    public static boolean  can_possible(int [] arr, int p, int mid){

        int count=0;
       

      for(int i=0; i<arr.length;i++){

           int time=0;
           int j=1;
           while(time+ j*arr[i]<= mid){
               count++;
                time+= j*arr[i];
                j=j+1;
           }
      }

       if(count>=p){

           return true;
       }else{

           return false;
       }

    }
    public static void main(String args[]) {
       
        Scanner s= new Scanner(System.in);

        int P= s.nextInt();

        int n= s.nextInt();

        int [] arr= new int [n];

        for(int i=0; i<n;i++){

            arr[i]= s.nextInt();
        }
        
         int low=1;

         int high= (int)(1e9);

         int ans=-1;

         while(low<=high){

             int mid= (low+high)/2;

             if(can_possible(arr, P, mid)==false){
                 low=mid+1;
             }else{
                 ans=mid;
                 high=mid-1;
             }
         }

         System.out.println(ans);

    }
}
