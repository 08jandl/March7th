package fh.campus02;

import java.util.ArrayList;
import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {

//        int[] array = new int[] {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(array));
//
//        for(int number : array){
//            array[number-1] += 12;
//        }
//        System.out.println(Arrays.toString(array));
//
//        ArrayList<Integer> list = new ArrayList<>();

        int[][] arrayInception = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        for (int i = 0; i < arrayInception.length; i++) {
            for (int j = 0; j < arrayInception[i].length; j++) {
                System.out.print(arrayInception[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        arrayInception[1][1] = 9;

        arrayInception[0][0] = 3;
        arrayInception[0][2] = 3;
        arrayInception[2][0] = 3;
        arrayInception[2][2] = 3;

        for (int[] array : arrayInception) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
