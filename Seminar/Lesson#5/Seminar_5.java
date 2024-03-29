import java.util.*;

public class Seminar_5 {
    public static void main(String[] args) {
        //task0();
        /*
        Pasword passwords = new Pasword();
        passwords.add("123456", "Иванов");
        passwords.add("321456", "Васильев");
        passwords.add("234561", "Петрова");
        passwords.add("234432", "Иванов");
        passwords.add("654321", "Петрова");
        passwords.add("345678", "Иванов");

        System.out.println(passwords.getAll());
        System.out.println(passwords.getPassNum("321456"));
        System.out.println(passwords.getByLastName("Иванов"));
         */
       // System.out.println(task1("foo","bar"));
        //System.out.println(task2("[a+(1*3)"));
        //task7("Мороз и солнце день чудесный " +
                //"Еще ты дремлешь друг прелестный " +
               // "Пора красавица проснись");
        //System.out.println(task3("MMXXII"));
       // System.out.println(task4(2022));

    }

    static boolean task1(String str1, String str2){
        /*
        Задание №1
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
         */
        if (str1.length() !=str2.length()) return false;
        Map <Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if(map.containsKey(c1[i])){
                if(c2[i] != map.get(c1[i])) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
    static boolean task2(String str){
        /*
        Задание №2
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
         */
        char[] c = str.toCharArray();
        Stack <Character> stack = new Stack<>();
        Map <Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('<','>');

        for (int i = 0; i < c.length; i++) {
            if(map.containsKey(c[i]))  stack.push(c[i]);
            if(map.containsValue(c[i])){
                if(stack.empty() || map.get(stack.pop()) != c[i])
                    return false;
            }

        }
        if (!stack.empty()) return false;
        return true;
    }
    static Integer task3(String str){
        /*
        Задание №3
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022

         */
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int end = str.length()-1;
        char[] arr = str.toCharArray();
        int arabian;
        int result = map.get(arr[end]);
        for (int i =end-1; i >= 0 ; i--) {
            arabian = map.get(arr[i]);

            if (arabian < map.get(arr[i+1])){
                result -= arabian;
            } else {
                result += arabian;
            }

        }
        return result;

    }
    static void task4(){
        /*
        Задание №4
Написать метод, который переведёт данное целое число в римский формат.
         */

        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');

    }
    static void task5(){
        /*
        Задание №5
        Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг
        прелестный Пора красавица проснись.
        Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
        одинаковой длиной не должны “потеряться”.
         */

    }
    static void task6(){
        /*
        Задание №6 (доп)
Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго
один раз.
         */
    }
    static void task7(String str){
        /*
        * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
        * */
    String[] words = str.split(" ");
    Map <Integer, List<String>> map = new TreeMap<>();
    //Map <Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());Сортирует по убыванию
    for (String word:
    words){
        int len = word.length();
        if (map.containsKey(len)){
            List<String>  list= map.get(len);
            list.add(word);
        } else {
            List<String> list = new ArrayList<>();
            list.add(word);
            map.put(len, list);
        }
    }
        System.out.println(map);
    }
    static void homeTask(){
        /*
        ДЗ
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
человек может иметь несколько телефонов.
Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на
платформе)
Написать программу, которая найдет и выведет повторяющиеся имена с
количеством повторений. Отсортировать по убыванию популярности.
Реализовать алгоритм пирамидальной сортировки (HeapSort).
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
Формат сдачи: файл с
расширением java или ссылка на
гит с подписанными ФИ и
номером группы.
         */
    }
}