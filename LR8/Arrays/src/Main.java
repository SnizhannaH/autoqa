/*
 1) Задача “Нечетные числа”
 Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на
 экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

 2) Задача “Случайные числа”
 Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. Замените каждый
 элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

 3) Задача* “Двумерный массив”
 Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив
 на экран.

 4) Задача* “Двумерный массив”
 Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив
 на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не
 имеет значения).
*/

public class Main {
    public static void main(String[] args) {

        Tasks tasks = new Tasks();
        tasks.task1();
        tasks.task2();
        tasks.task3();
        tasks.task4();
    }
}

