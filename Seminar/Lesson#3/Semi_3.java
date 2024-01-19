import java.util.*;

public class Semi_3 {
    public static void main(String[] args) {
        //task0();
        //task1(10,2,9);
       // task2();
        List<List<String>> bookShop = new ArrayList<>();
        addBook("Война и мир!","Литература", bookShop);
        addBook("Шерлок Холмс","Детектив", bookShop);
        addBook("Python для детей","Учеба", bookShop);
        addBook("JS для детей","Учеба", bookShop);
        System.out.println(bookShop);
    }

    static void task0(){
        /*
        Задание №0
Даны следующие строки, cравнить их с помощью == и
метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
         */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
        // Ссылочных имеет значение == или equals();
// Примитивные тоесть (int, boolean,) не имееть значение == или equals();

    }
    static void task1(int size,int min, int max){
        /*
        Задание №1
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.
         */
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(min, max +1 ));
        }
        Collections.sort(list);
       // Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
    // JavaFX графическя библеотека для java
    static void task2(){
        /*
        Задание № 2
        Создать список типа ArrayList<String>. Поместитьв него как строки, так и целые числа.
        Пройти по списоку, найти и удалить целые числа.
         */
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Isi");
        list.add(2);
        list.add("Nasir");
        list.add(11.15);

        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof  Integer){
                iterator.remove();
            }
           /* if (o instanceof  Double){
                iterator.remove();
            }*/
        }
        System.out.println(list);
    }
    static void task2_1(){
        /*Задание №2.1
Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
         */
        List<String> list = new ArrayList<>();
    }
    static void task2_2(){
/*
Задание №2.2 (если выполнено первое задание)
Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.
 */
    }

    static void addBook(String nameBook, String janr, List<List<String>>bookShop){
       // List<List<String>> list = new ArrayList<>(); // Создание двухмерного списка
        for (int i = 0; i < bookShop.size(); i++) {
            if (bookShop.get(i).get(0).equals(janr)){
            bookShop.get(i).add(nameBook);
            return;
            }
        }
        List<String> bookList = new ArrayList<>();
        bookList.add(janr);
        bookList.add(nameBook);
        bookShop.add(bookList);

    }

}