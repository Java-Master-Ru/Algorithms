/*
 * @author Java-Master-Ru
 * @date 19.08.2022
 */

package ru.javamaster.algoritms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] array = {5, 2, 4, 6, 1, 3};
        for (int left = 0; left < array.length; left++) {
            // вытаскиваем значение элемента
            int value = array[left];
            // перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // если вытащили значение меньшее - передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // если вытащенный элемент больше - останавливаемся
                    break;
                }
            }
            // в освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}