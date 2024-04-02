package ru.diana.selection_sort_practice.main;
import java.util.Arrays;
import static ru.diana.selection_sort_practice.service.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"5+6+32=43", "1+1=2", "(3+5)*4*21=483", "((21-20)*(32-30))/2=1"};
        System.out.println(Arrays.toString(arr) + "\n");
        selectionSort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }
}
