import java.util.Scanner;

public class Main {
    /*
        Напишите группу методов, которые будут создавать массив, заполнять его пользовательским вводом
        и выводить на печать. Все методы должны быть задокументированы.
        В ответе оставьте ссылку на репозиторий. *
     */
    public static void main(String[] args) {
        // write your code here
        int n = 5; // размер массива
        int[] arr = createArray();
        fillArray(arr);
        printArray(arr);
    }

    // создаёт массив размера n
    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        return new int[n];
    }

    // заполняет массив arr размера n пользовательским вводом
    public static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter array item: ");
            arr[i] = sc.nextInt();
        }
    }

    // выводит на печать массив arr размера n
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
