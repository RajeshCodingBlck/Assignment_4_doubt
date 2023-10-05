import java.util.*;
public class Main {
    public static void main (String args[]) {
      
      Scanner s= new Scanner(System.in);

      int n=s.nextInt();

      int m= s.nextInt();

      int [][] mat= new int[n][m];

       for(int i=0; i<n;i++){

           for(int j=0; j<m;j++){

               mat[i][j]= s.nextInt();
           }
       }

       int [] row= new int[n];
       int [] col= new int[m];

       for(int i=0; i<n;i++){

           for(int j=0; j<m;j++){

               if(mat[i][j]==1){
                   row[i]=1;
                   col[j]=1;
               }
           }
       }

       int [][] ans= new int[n][m];

       for(int i=0; i<n;i++){

           for(int j=0; j<m;j++){

               if(row[i]==1 || col[j]==1){
                   ans[i][j]=1;
               }
               System.out.print(ans[i][j]+" ");
           }

           System.out.println();
       }

    }
}
