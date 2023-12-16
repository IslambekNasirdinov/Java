import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public interface javaFirstLesson {
    public static void main(String[] args) {
       // task1();
        //task2();
        //task3();
        System.out.println(task4("isi,isil,ant,lkfd"));  
       System.out.println(task6(2, -2));
    }
    static void task1(){
     /*Задание №1
     В консоли запросить имя пользователя. В зависимости от
    текущего времени, вывести приветствие вида
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
        System.out.println("What is your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();

        if (hour >= 5 && hour <12) System.out.println("Good morning " + name);
        else if (hour <18 ) System.out.println("Good afternoon " + name);
        else if (hour < 23) System.out.println("Good evning " + name);
        else System.out.println("Good night " +name);
    }

    static void task2(){
        /*Задание №2
        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1. */
    int [] arr = {1,1,0,1,1,1,0,1,1,1,1,1};
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == 1) count = count + 1;
        else {
            if(maxCount < count) 
            maxCount = count;
            count = 0;
        }
    if (maxCount < count) maxCount = count;
    }
      System.out.println(maxCount);
    }
     
    static void task3(){
        /*Задание №3
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему. */
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                tempArr[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));


    }

    static String task4(String[] strs){
        /*
         * Задание №4
Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
         */
        
            if(strs.length == 0){
              return "";
            }
            if (strs.length == 1){
              return strs[0];
            }
             
            String rez = strs[0];
            for(int i = 1; i < strs.length; i ++){
              String cur = strs[i];
              int reader = 0;
              int lastCommon = 0;
              while(reader < rez.length() && reader < cur.length()){
                if(rez.charAt(reader) == cur.charAt(reader)){
                  lastCommon ++;
                } else {
                  break;
                }
                reader++;
              }
              rez = rez.substring(0, lastCommon);
            }
            return rez;
          
    }
    static String task5(String str){
        /*
         * Задание №5 (доп)
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
         */
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String result="";
        for (int i = arr.length -1; i >= 0; i--){
            result +=arr[i] + " ";
        } 
        return result;
    }

    static double task6(int a, int b){
        /*
         * Задание №6 (доп)
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
         */
        double result = 1;
        int c = (b < 0) ? -b :b;
        for (int i = 0; i < c; i++){
            result *=a;
        }
        return b > 0 ? result: 1/result;
    }
    static void task7(){
        /*
         * Задание №7 (доп)
На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть
две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
Написать программу, которая выдаёт набор команд, позволяющий число a
превратить в число b или сообщить, что это невозможно
Пример 1: а = 1, b = 7, c = 1, d = 3
ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
Пример 2: а = 11, b = 7, c = 2, d = 1
ответ: “”. 
         */
    }
    static void task8(){
        /*
         * Задание №8 (доп)
Задан массив, например, nums = [1,7,3,6,5,6].
Написать программу, которая найдет индекс i для этого массива
такой, что сумма элементов с индексами < i равна сумме
элементов с индексами > i. 
         */
    }
    static void task9(){
        /*
         * Задание №9 (доп)
Записать в файл следующие данные:
Name Surname Age
Kate Smith 20
Paul Green 25
Mike Black 23 
         */
    }
}
