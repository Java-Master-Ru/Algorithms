/*
 * @author Java-Master-Ru
 * @date 08.07.2022
 */

package ru.javamaster.algoritms;

import java.util.Arrays;

/*
На входе массив чисел
Необходимо вычислить ТОП k самых больших из них
 */
public class GetTopKItems {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(GetTopKItemsWithArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3))); // 7, 8, 9
        System.out.println(Arrays.toString(GetTopKItemsWithArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 4))); // 6, 7, 8, 9
    }
//  На входе массив чисел и количество чисел, которые должны попасть в ТОП
    public static int[] GetTopKItemsWithArray(int[] data, int k) {
//      Создаем массив числе для вывода результата емкостью k
        int[] result = new int[k];
//      Сортируем исходный массив
        Arrays.sort(data);
//      Проходимся по массиву
        if (data.length - (data.length - k) >= 0)
            System.arraycopy(data, data.length - k, result, 0, data.length - (data.length - k));
        return result;
    }
}
