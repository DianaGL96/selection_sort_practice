package ru.diana.selection_sort_practice.service;

public class CountOperations {
    public static int countOperations(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == '+' || c == '-' || c == '/' || c == '*' || c == '(' || c == ')' ) {
                count++;
            }
        }
        return count;
    }

}
