package Arrays;

public class ArraysForEach {

    public static void main(String args[]) {
        //One dimensional array:
        int[] oneD_arr = {125, 132, 95, 116, 110};

        System.out.println();
        System.out.println(" One dimensional array: with normal for oop");
        System.out.println();

        for (int i = 0; i < oneD_arr.length; i++) {
            System.out.print(" " + oneD_arr[i]);
        }

        System.out.println();
        System.out.println(" One dimensional array: with normal for each loop");
        System.out.println();

        for (int i : oneD_arr
        ) {
            System.out.print(" " + i);
        }

        //Two dimensional array:
        System.out.println(" ");
        int[][] twoD_arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println();
        System.out.println(" Two dimensional array: with normal for loop");
        System.out.println();

        for (int i = 0; i < twoD_arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < twoD_arr[i].length; j++) {
                System.out.print(" " + twoD_arr[i][j]);
            }
        }

        System.out.println();
        System.out.println(" Two dimensional array: with normal for each loop");
        System.out.println();

        for (int[] arr2 : twoD_arr) {
            System.out.println(" ");
            for (int val : arr2)
                System.out.print(" " + val);
        }

        //Three dimensional array:
        int[][][] threeD_arr = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}},
        };

        System.out.println();
        System.out.println(" Three dimensional array: with normal for loop");
        System.out.println();

        for (int i = 0; i < threeD_arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < threeD_arr.length; j++) {
                for (int k = 0; k < threeD_arr.length; k++) {
                    System.out.print(" " + threeD_arr[i][j][k]);
                }
            }
        }

        System.out.println();
        System.out.println(" Three dimensional array: with normal for each loop");
        System.out.println();

        for (int[][] arr1 : threeD_arr) {
            System.out.println();
            for (int[] arr2 : arr1) {
                for (int val : arr2)
                    System.out.print(" " + val);
            }
        }
    }

}

