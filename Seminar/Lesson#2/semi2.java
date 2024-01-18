import jdk.jshell.execution.LoaderDelegate;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.ClassFileFormatVersion;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class semi2{
    public static void main(String[] args){

       // System.out.println(task1(5,'a','b'));
       // task2("aabbvlllld");
       // System.out.println(task3("otto"));
        tak4(wordRepeat(11,"Test"));
        task5("test");

    }

    static String task1(int n, char c1, char c2){
        /*Задание №1
        Дано четное число N (>0) и символы c1 и c2.
                Написать метод, который вернет строку длины N, которая
        состоит из чередующихся символов c1 и c2, начиная с c1.*/
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < n/2; i++){
        stringBuilder.append(c1).append(c2);
    }
    return stringBuilder.toString();
    }
    static void task2(String str){
        /*
        * Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
*       выход 4a3b1c2d */
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
       int count =1;
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]){
                stringBuilder.append(chars[i-1]).append(count+1);
                count =0;
            } else {
                count++;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        System.out.println(stringBuilder);

    }
    static boolean task3(String str){
        /*Задание №3
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).*/
    StringBuilder stringBuilder = new StringBuilder(str);
    String str2 = stringBuilder.reverse().toString();
    return str.equals(str2);
    }
    static void tak4(String str){
        /*Задание №4
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.*/
        try(FileWriter writer = new FileWriter("text.txt", true);) {
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String wordRepeat(int n, String str){
        return str.repeat(n);
    }
    static void task5(String str){
        /*Задание №5
Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл.
*/
        Logger logger = Logger.getAnonymousLogger();
        try {
            FileHandler fh = new FileHandler("log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter simpleFormatter = new SimpleFormatter(); // SimpleFormatter - Исползуется для форматирование XML указано в Log.txt
            fh.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileWriter writer = new FileWriter("/dg/hj/text.txt", true);) {
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }

    }



    static void task6(){
        /*
        Задание №6 (доп)
Напишите метод, который определит тип (расширение) файлов из
текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла:
4 Расширение файла: jpg
*/

            
        }
    static void homeTask1(){
        /* ДЗ
        1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
        используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
                Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
        запишите в лог-файл.
        */
    }
    static void homeTask2(){
        /*ДЗ
3.** Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"
Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент
[фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
4*. К калькулятору из предыдущего дз добавить логирование.
*/
    }

    }

}