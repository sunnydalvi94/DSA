package BasicJava;

import java.util.Scanner;

public class Array {

    public  static void main(String args[]){

      int arr[]; // this is a declaration part
      arr=new int[5];
        Scanner s= new Scanner(System.in);

      for (int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
      }
        System.out.println("array elements are: ");

      for (int j : arr) {
        System.out.print(j + " ");
      }

    }



}
