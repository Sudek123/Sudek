import java.util.*;
class Array1{
    public static void main(String []args){
    int[] arr=new int[10];
    for(int i=1;i<=10;i++){
       arr[i-1]=5*i;
    }
      for(int i:arr)   System.out.print(i+" ");
    System.out.println();
         arr2();
     }
     public static void arr2(){
      double[][] arr=new double[3][3];
      for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               arr[i][j]=Math.random();
           }
       }
      for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(arr[i][j]+" ");
           }
       }

      
     }
}