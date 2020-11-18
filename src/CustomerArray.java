import java.util.Scanner;
public class CustomerArray {

    static void maxNum (int[]array){
        int max = array[0];
        for (int i=1; i <= array.length -1; i++) {
            if (array[i] > max ) {
                max = array[i];
            }
        }

        System.out.print("Максимальное значение: " + max);
        System.out.println("");
    }

    static void minVal(int[] array) {
        int min = array[0];
        for (int i=1; i <= array.length -1; i++) {
            if (array[i] < min ) {
                min = array[i];
            }
        }

        System.out.print("Минимальное значение: " + min);
        System.out.println("");
    }
    static void sum(int[] array) {
        int sum =0;

        for (int value:array) {
            sum = sum + value;
        }
        System.out.print("Сума значений: " + sum);
        System.out.println("");
    }

    static void aver(int[] array, int num) {
        int sum =0;

        for (int value:array) {
            sum = sum + value;
        }
        double average = (double) sum / num;

        System.out.print("Среднее арифметическое: " + average);
        System.out.println("");
    }

    static void oddNum(int[] array, int num) {
        int sum =0;
        System.out.print("Нечетные значения массива: ");
        for (int value:array) {
            if ((value % 2) != 0 ) {

                System.out.print(" " + value);
            }
        }
    }

    public static void main (String[] args){

        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 15;
        }

        for (int value: array) {
            System.out.print(" " + value);
        }
        System.out.print("\n");

        maxNum(array);
        minVal(array);
        sum(array);
        aver(array, num);
        oddNum(array, num);
    }
}








