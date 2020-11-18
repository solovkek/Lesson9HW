
    import java.util.Scanner;

    public class ReversedArray {

        static void toReverse(int [] array) {
            System.out.println("Инвертированный массив: ");
            for (int i = array.length -1; i>=0; i--) {
                int a = array[i];
                System.out.print(" " + a);
            }
            System.out.println("");
        }

        static void subArray(int [] array, int index, int count) {

            System.out.println("Часть исходного массива: " + count + " элементов с индекса позиции " + index + " ");
            int num = array[index];
            int[] array2 = new int[count];
            int length = index;
            for (int i = 0; i < count; i++ )
            {
                if (length < array.length ) {
                    length = length + 1;
                    array2[i] = array[index + i];
                }
                else  break;
            }
            for (int value:array2) {
                System.out.print(" " + value);
            }
            System.out.println("");
        }

        public static void main (String[] args){

            System.out.println("Введите длину массива: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int[] array = new int[num];

            for (int i = 0; i < array.length; i++) {
                array[i] = i + 15;
            }

            System.out.println("Исходный массив: ");
            for (int value:array) {
                System.out.print(" " + value);
            }
            System.out.println("");

            toReverse(array);

            int index = 5, count = 7;
            subArray(array,index, count);
        }

    }

