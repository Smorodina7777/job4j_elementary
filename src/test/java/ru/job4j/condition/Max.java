package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean c = left > right;
        int result = c ? left : right;
        return result;
    }
}
