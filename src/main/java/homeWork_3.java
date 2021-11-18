import java.util.Arrays;

public class homeWork_3 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        //Конец задачи №1

        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));
        //Конец задачи №2

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr2.length; i++){
            if (arr2[i] < 6){
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
        //Конец задачи №3

        int[][] arr3 = new int[10][10];
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[0].length; j++){
                if (i == j || i + j == arr3.length - 1){
                    arr3[i][j] = 1;
                }
            }
        }
        printArr(arr3);
        //Конец задачи №4

        System.out.println(Arrays.toString(massivChisla(7,20)));
        //Конец задачи №5

        int[] arr5 = {1, 6, 5, 4, -3, -10, 125, 613};
        int max = 0;
        int min = 0;
        for (int i =0; i < arr5.length; i++){
            if (arr5[i] > max){
                max = arr5[i];
            }
            if (arr5[i] < min){
                min = arr5[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        //Конец задачи № 6

        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(ravenstvoChastey(arr6));
        //Конец задачи №7

        int[] arr7 = {3, 5, 6, 1};
        smeshenieMassiva(arr7, -2);
        System.out.println(Arrays.toString(arr7));
        //Конец задания №8, без вспомогательного массива не придумал ;(




    }


    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] massivChisla(int len, int initialValue) {
        int[] arr4 = new int[len];
        for (int i = 0; i < arr4.length; i ++){
            arr4[i] = initialValue;
        }
        return arr4;
    }

    public static boolean ravenstvoChastey(int[] arr){
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++){
            left += arr[i];
            for (int j = arr.length - 1; j > i; j--){
                right += arr[j];
            }
            if (right == left){
                return true;
            }
            right = 0;
        }
        return false;
    }
    public static void smeshenieMassiva(int[] arr, int n){
        int position = 0;
        int[] vspomogArr = new int[arr.length];
        for (int i =0; i < arr.length; i ++){
            vspomogArr[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            if (i + n >= 0){
                position = (i + n) % arr.length;
            }
            else {
                position = arr.length + ((i + n) % arr.length);
            }
            arr[i] = vspomogArr[position];
        }
    }


}
