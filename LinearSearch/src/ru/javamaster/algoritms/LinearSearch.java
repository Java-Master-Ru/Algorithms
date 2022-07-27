/*
 * @author Java-Master-Ru
 * @date 27.7.2022
 */

package ru.javamaster.algoritms;

/**
 * Реализация алгоритма линейного поиска
 */

public class LinearSearch {
    public static void main(String[] args) {
//        Задаем массив целых чисел и искомое значение
        int[] sequence = new  int[] {-3, 0, 4, 8, 11, 14, 17};
        int element = 8;

        System.out.println(linearSearch(sequence, element));
    }

    public static int linearSearch(int[] sequence, int element) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
