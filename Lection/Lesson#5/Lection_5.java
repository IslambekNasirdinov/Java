import java.util.*;

public class Lection_5 {
    public static void main(String[] args) {
        Ex001_HashMap();
        Ex002_HashMap();
        Ex003_HashMap();
        Ex004_TreeMap();
        Ex005_LinkedHashMap();
        Ex006_HashTable();
        /*
        Если нужно скорость используем HashMap ();
        Если скороть не особо важно и нужно порядок элементов то используем LinkedHashMap ();
         */
    }
    static void Ex001_HashMap(){
        /*
        HashMap
        Map – это множество коллекций, работающих с данными
по принципу <Ключ / Значение>.
Ключевые особенности:
● допускаются только уникальные ключи, значения
могут повторяться;
● помните про null значения*;
● ускоренная обработка данных;
● порядок добавления не запоминается.

put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.

         */
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "Один");
        System.out.println(db);
        db.put(2, "Два");
        System.out.println(db);
        db.put(3, "Три");
        System.out.println(db);
        db.put(31, "три один");
        System.out.println(db);
        db.put(13, "один три");
        System.out.println(db);
        db.put(null, "null");
        System.out.println(db);
        db.put(null, null);
        System.out.println(db);

    }
    static void Ex002_HashMap(){
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2,"Два");
        System.out.println(db);

        for (var item : db.entrySet()){
            System.out.printf("[%d: %s]\n",item.getKey(), item.getValue());

        }
    }
    static void Ex003_HashMap(){
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(9);
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f);
        /*
        HashMap. Любознательным
        ● Хэш-функции и хэш-таблицы
        ● Прямое связывание (хэширование с цепочками)
        ● Хэширование с открытой адресацией
       Теория графов:
            ● деревья построенные на списках
            ● бинарные деревья
            ● сбалансированные деревья
            ● *алгоритм балансировки дерева
            ● ** красно-черные деревья, деревья поиска
         */
    }
    static void Ex004_TreeMap(){
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

        /*
        TreeMap
        Методы, на которые нужно обратить внимание
            TreeMap
            put(K,V) get(K) remove(K)
            descendingMap() tailMap() headMap() lastEntry() firstEntry()

            В основе данной коллекции лежат красно-чёрное деревья.
Позволяют быстрее искать, но могут возникнуть «заминки»
при добавлении.
         */
    }
    static void Ex005_LinkedHashMap (){
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
        /*
        LinkedHashMap
        “Старший брат” коллекции HashMap, который всё помнит…
Помнит порядок добавления элементов ➜ более медлительный
Map<Integer,String> linkmap = new LinkedHashMap<>();

         */
    }
    static void Ex006_HashTable(){
        /*
        «Устаревший брат» коллекции HashMap,
который не знает про null
         */
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }
}