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
        int[] arr = createArray(n);
        fillArray(arr, n);
        printArray(arr, n);
    }
    // создаёт массив размера n
    public static int[] createArray(int n) {
        return new int[n];
    }
    // заполняет массив arr размера n пользовательским вводом
    public static void fillArray(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter array item: ");
            arr[i] = sc.nextInt();
        }
    }
    // выводит на печать массив arr размера n
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
