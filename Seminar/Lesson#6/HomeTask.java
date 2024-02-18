import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeTask {
    /*
       ДЗ
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут
повторяющиеся имена с разными телефонами, их необходимо считать,
как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
        */
    public static void main(String[] args) {
    Map<String, ArrayList<Integer>> contact = new HashMap<>();
    telNumber("Ivanov", 123, contact);
        telNumber("Alek", 1234, contact);
        telNumber("Nikolai", 1234, contact);
        telNumber("Ivanov", 1234, contact);
        telNumber("Petrov", 546585, contact);
        telNumber("Sidorov", 8956477, contact);
        telNumber("Ivanov", 12356233, contact);
        telNumber("Petrov", 787897, contact);
        printContact(contact);

    }

    static void telNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)){
            map.get(key).add(value);
        } else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key,list);
        }

    }
    static void printContact(Map<String,ArrayList<Integer>>map){
        for (var item:map.entrySet()){
            String phonesNumber = "";
            for (int tel:item.getValue()){
                phonesNumber = phonesNumber + tel + ",";
            }
            System.out.printf("%s:%s/", item.getKey(),phonesNumber);
        }
    }

}