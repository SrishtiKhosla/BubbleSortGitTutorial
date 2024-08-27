package org.example;

public class App {
    public static void main(String[] args) {
        // Create an instance of the BubbleSort class
        BubbleSort bubbleSort = new BubbleSort();

        // Define the arrays to be sorted
        Integer[] array1 = {70, 61, 72, 83, 38};
        Integer[] array2 = {7, 2, 76, 4, 99};
        Integer[] array3 = {28, 9, 13, 78, 19};
        Integer[] array4 = {68, 84, 41, 62, 18};
        Integer[] array5 = {37, 57, 40, 13, 50};

        // Sort the arrays using the BubbleSort class
        Integer[] sortedArray1 = bubbleSort.sort(array1);
        Integer[] sortedArray2 = bubbleSort.sort(array2);
        Integer[] sortedArray3 = bubbleSort.sort(array3);
        Integer[] sortedArray4 = bubbleSort.sort(array4);
        Integer[] sortedArray5 = bubbleSort.sort(array5);

        // Print the sorted arrays to the console
        System.out.println("Sorted Array 1: ");
        printArray(sortedArray1);

        System.out.println("Sorted Array 2: ");
        printArray(sortedArray2);

        System.out.println("Sorted Array 3: ");
        printArray(sortedArray3);

        System.out.println("Sorted Array 4: ");
        printArray(sortedArray4);

        System.out.println("Sorted Array 5: ");
        printArray(sortedArray5);
    }

    // Helper method to print the contents of an array
    private static void printArray(Integer[] array) {
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
