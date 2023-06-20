package org.example.Seminar2;
import java.util.Arrays;

/* Урок 2. Структуры данных. Массивы. Алгоритмы массивов.
        Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

 */
public class PiramidSort {
    public static void main(String[] args) {
        int[] array = new int []{1,8,9,2,3,5,8,4};
        sortirovka(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sortirovka(int[] array){
        for(int i = array.length/2 - 1; i >= 0; i--) {
            heap(array, array.length, i);
        }
        for(int i = array.length - 1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap(array, i, 0);
        }
    }
    private static void heap(int[] array, int heapSize, int heapIndex){
        int maxElement = heapIndex;
        int leftChild = 2 * heapIndex + 1;
        int rightChild = 2 * heapIndex + 2;
        if(leftChild < heapSize && array[leftChild]> array[maxElement]) {
            maxElement = leftChild;
        }
        if(rightChild < heapSize && array[rightChild]>array[maxElement]) {
            maxElement = rightChild;
        }
        if(maxElement !=heapIndex){
            int temp = array[heapIndex];
            array[heapIndex] = array[maxElement];
            array[maxElement] = temp;
            heap(array, heapSize, maxElement);
        }
    }
}
