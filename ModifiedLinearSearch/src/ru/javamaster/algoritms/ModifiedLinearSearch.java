/*
 * @author Java-Master-Ru
 * @date 27.07.2022
 */

package ru.javamaster.algoritms;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация модифицированного алгоритма линейного поиска - O(n)
 */

public class ModifiedLinearSearch {

    public static void main(String[] args) {
//        Задаем массив целых чисел
        int[] s = new  int[] {-3, 0, 4, 8, 11, 14, 17};
//        Создаем пустой ArrayList
        List<Integer> sequence = new ArrayList<>();
//        В цикле заполняем ArrayList значениями из массива s
        for (int i : s) {
            sequence.add(i);
        }
//        Определяем искомый элемент
        int element = 8;
//        Выводим индекс искомого элемента
        System.out.println(modifiedLinearSearch(sequence, element));
    }

    public static int modifiedLinearSearch(List<Integer> sequence, int element) {
//        Добавляем искомый элемент в конец массива
        sequence.add(element);
//        Определяем индекс последнего элемента массива
        int lastIndex = sequence.size() - 1;
        int i = 0;
//        Проходимся по массиву в цикле, пока не найдем искомый элемент по индексу
        while (sequence.get(i) != element) {
            i++;
        }
//        Удаляем из массива последний элемент
        sequence.remove(lastIndex);
//        Если индекс искомого элемента не равен индексу последнего элемента, возвращаем индекс искомого элемента
        if (i != lastIndex) {
            return i;
        }
        return -1;
    }
}
