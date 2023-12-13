import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public interface javaFirstLesson {
    public static void main(String[] args) {
       // task1();
        //task2();
        task3();
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
        int[] nums = {3,2,2,3,4,5,3,6,8};
        int val = 2;
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

    
}
