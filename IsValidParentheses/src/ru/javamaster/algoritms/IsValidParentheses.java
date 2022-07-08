/*
 * @author Java-Master-Ru
 * @date 8.7.2022
 */

package ru.javamaster.algoritms;

import java.util.Stack;

public class IsValidParentheses {

    public IsValidParentheses() {
    }

    public static void main(String[] args) {
        System.out.println(IsValidParenthesesWithStack("()"));
        System.out.println(IsValidParenthesesWithStack("((()))"));
        System.out.println(IsValidParenthesesWithStack("()()()"));
        System.out.println();
        System.out.println(IsValidParenthesesWithStack("()("));
        System.out.println(IsValidParenthesesWithStack("((())"));
        System.out.println(IsValidParenthesesWithStack(")(())("));
    }

//  Создаем метод
//  На вход подаем строку, на выходе - false (если скобки неправильно расставлены) или true (если правильно)
    public static boolean IsValidParenthesesWithStack(String s) {
//      Создаем стек
        Stack<Character> stack = new Stack<>();
//      Проходимся по строке
        for (int i = 0; i < s.length(); i++) {
//          Определяем очередной символ
            char symbol = s.charAt(i);
//          Если открывающая скобка, то помещаем ее в стек
            if (symbol == '(') {
                stack.push(symbol);
            }
//          Если закрывающая скобка
            if (symbol == ')') {
//              Если стек пустой, то строка будет однозначно невалидная
                if ((long) stack.size() == 0) {
                    return false;
                }
//              Если стек не пустой, то извлекаем символ
                stack.pop();
            }
        }
//      Если стек пустой, то возвращаем true, иначе - false
        return stack.size() <= 0;
    }
}