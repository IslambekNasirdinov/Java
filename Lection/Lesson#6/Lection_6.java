import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lection_6 {
    public static void main(String[] args) {
        //Ex001_HashSet();
       // Ex002_MathSet();
        Worker w1 = new Worker();
        w1.firstName = "Иван";
        w1.LastName = "Иванов";
        w1.salari = 10000;
        w1.id = 1;

        Worker w2 = new Worker();
        w2.firstName = "Иван";
        w2.LastName = "Зверев";
        w2.salari = 7000;
        w2.id = 1;

        Worker w3 = new Worker();
        w3.firstName = "Сергей";
        w3.LastName = "Темиров";
        w3.salari = 6000;
        w3.id = 2;

        Worker w4 = new Worker();
        w3.firstName = "Илья";
        w3.LastName = "Суров";
        w3.salari = 5000;
        w3.id = 3;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w4, w3));
        System.out.println(workers.contains(w2));
    }
    static void Ex001_HashSet(){
        Set<Integer> set = new HashSet<>();
        set.add(123);
        set.add(12);set.add(5);
        System.out.println(set.contains(12));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(12);
        for (var item : set) System.out.println(item);
        set.clear();
        System.out.println(set);
        /*
        1. Иерархия Set и определения
2. Обзор функционала HashSet
3. Обзор функционала LinkedHashSet
4. Обзор функционала SortedSet
5. Дерево в программировании
6. Обзор функционала TreeSet
7. Введение в создание собственных типов
8. equals, hashCode, compareTo и их назначение

isEmpty() – проверка на пустоту.
add(V) – добавление элемента в коллекцию.
remove(V) – удаление элемента из коллекцию.
contains(V) – проверка на включение элемента в коллекции.
clear() – удаление всех элементов коллекции.
size() – возвращает количество элементов коллекции.

addAll(Coll) – объединение множеств.
retainAll(Coll) – пересечение множеств.
removeAll(Coll) – разность множеств.
         */

    }
    static void Ex002_MathSet(){
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        var b = new HashSet<>(Arrays.asList(2,5,6,7,89,4,8,9,62,5));
        var c = new HashSet<Integer>(a); c.addAll(b);
        var d = new HashSet<Integer>(a); d.retainAll(b);
        var e = new HashSet<Integer>(a); e.removeAll(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        boolean res = a.addAll(b);
    }

}