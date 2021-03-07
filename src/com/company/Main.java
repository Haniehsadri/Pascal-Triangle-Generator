package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i =input.nextInt();
        int j=i;
        int [][] array = new int [i+1][j+1];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {


                if(row==0 || column==0){
                    array [row][ 0]=1;
                    array [0][0]=1;

                }


                else {
                    if(row!=0 || column!=0 ) {
                        array[row][column] = array[row-1][column-1] + array[row-1][column];
                    }
                }


            }




        }    Main.Printarray(array);
        // write your code here
    }

    public static void Printarray(int[][] array) {
        for(int i=0 ;i<array.length;i++){
            for(int j=0 ;j<array[i].length;j++){
                if(array[i][j]!=0){
                    System.out.printf("%d ",array[i][j]);
                }
            }
            System.out.println();
        }

    }
}
