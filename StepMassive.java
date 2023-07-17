package massive;


import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepMassive {
    static int element;
    static int row;
    static int[][] array = new int[row][];


    public static void main(String[] args) {
        System.out.println("Insert: ");
        array = generateMassive();
        printInfo(array);
        System.out.println();
        sortAllMassive(array);
    }

    public static int[][] generateMassive() {
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        element = scanner.nextInt();
        int[][] array = new int[row][element];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static void printInfo(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int binarySearch(int[] array, int valueToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == valueToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < valueToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void sorterFirstMassive(int[] array) {
        for (int j = 0; j < array.length -1 ; j++) {
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i + 1]) {
                    int result = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = result;
                }
            }
        }
    }
    public static void sortAllMassive(int[][] array){
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                sorterFirstMassive(ints);
            }
            System.out.println(Arrays.toString(ints));
        }
    }
}


//Створити двомірний ступінчатий масив випадкових чисел розміру NxM*, де:
//N - кількість рядків (вводимо з консолі);
//M - максимальна кількість елементів в рядку (також вводимо з консолі).
// Для кожного рядка кількість елементів має бути випадковим числом M* в діапазоні 0 <= M* < M.

//Створити наступні методи для роботи з масивом:
//відсортувати парні рядки за зростанням, а непарні за спаданням;
//обчислити суму всіх елементів двовимірного ступінчастого масива;
//знайти мінімальний елементи для кожного рядка (результат має бути масивом)
// та мінімальний елемент серед усіх елементів (абсолютний мінімум)
//якщо можливо, то поділити всі елементи ступінчатого масиву на абсолютний мінімум націло