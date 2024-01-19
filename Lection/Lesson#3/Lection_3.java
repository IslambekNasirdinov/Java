import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lection_3 {
     public static void main(String[] args) {
        // Object o = 1; GetType(o); // java.lang.Integer
        // o = 1.2; GetType(o);       // java.lang.Double
        // o = "IS"; GetType(o);
         //System.out.println(Sum(1, 2));
         //System.out.println(Sum(1.1, 2));
         //System.out.println(Sum(1, 2.2));
         //System.out.println(Sum(1.0, 2.2));
         //System.out.println(Sum("Каша", "Миша"));
         //array();
         //CollectionArrayList();
         //ArrayList();
         //Ex005_Array_Method();
         //Ex006_ListMethod();
         Iter();
     }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b){
         if(a instanceof Double && b instanceof  Double){
             return (Object) ((Double) a + (Double) b);
         } else if (a instanceof Integer && b instanceof  Integer) {
             return (Object) ((Integer) a + (Integer) b);
             
         }else  return 0;
    }
    static void array(){
         int [] a = new int[] {1,2};
         int [] b = new int[3];
        System.arraycopy(a, 0,b, 0, a.length);

        for (int i : a) {
            System.out.printf("%d",i);
        }
        for (int j :b){
            System.out.printf("%d",j);
        }
    }
    // Колекция
    static void CollectionArrayList(){
        ArrayList <Integer> list = new ArrayList <Integer>();
        list.add(208);


        for (Object o : list){
            System.out.println(o);
        }
/*
        Иерархия коллекций. ArrayList
                «Удобный массив»
        Разные способы создания
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        */

    }
    static void ArrayList(){
        List<Integer> list = new ArrayList<>();
        list.add(108);
        list.add(2005);
        //list.add("string line");
        for (Object o : list){
            System.out.println(o);
        }
        /*
        Коллекции. Функционал
        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        get(pos) – возвращает элемент из списка по указанной позиции
        indexOf(item) – первое вхождение или -1
        lastIndexOf(item) – последнее вхождение или -1
        remove(pos) – удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) – gjvtoftn значение item элементу, который находится
        на позиции pos
        void sort(Comparator) – сортирует набор данных по правилу
        subList(int start, int end) – получение набора данных от позиции start до end
         */
    }
    static void Ex005_Array_Method(){
         StringBuilder day = new StringBuilder("04");
         StringBuilder month = new StringBuilder("09");
         StringBuilder year = new StringBuilder("1967");
         StringBuilder[] data = new StringBuilder[] {day, month,year};
         List<StringBuilder> d= Arrays.asList(data);
        System.out.println(d);
        data[1] = new StringBuilder("03");
        System.out.println(d);
/*
        Коллекции. Функционал
        clear() – очистка списка
        toString() – «конвертация» списка в строку
        Arrays.asList – преобразует массив в список
        containsAll(col) – проверяет включение всех элементов из col
        removeAll(col) – удаляет элементы, имеющиеся в col
        retainAll(col) – оставляет элементы, имеющиеся в col
        toArray() – конвертация списка в массив Object’ов
        toArray(type array) – конвертация списка в массив type
        List.copyOf(col) – возвращает копию списка на основе имеющегося
        List.of(item1, item2,...) – возвращает неизменяемый список
 */

    }
    static void Ex006_ListMethod(){
         /*
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y'); Если так удалит будет ощибка
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);

          */
        Character value = null;
        List <Character> list1 = new ArrayList<>();
        list1.add('s');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);

    }
    // Итератор
    static void Iter(){
         List<Integer> list = List.of(1,12,14,15,16,18);

         for(int item : list){
             System.out.println(item);
         }

        Iterator <Integer> col =list.iterator();
        System.out.println();

        while (col.hasNext()){
            System.out.println(col.next());
            //col.next();
            //col.remove();
        }
    }

}