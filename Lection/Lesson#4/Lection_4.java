import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class Lection_4 {
    public static void main(String[] args) {
       // LinkedList();
       // PriorityQueue();
        Stack();
    }

    static void LinkedList(){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());

        // poll() - Извлечение данных
        /*
        LinkedList
        Представляет собой двусвязный список.
Список – гибкая структура данных, позволяющая легко менять свой
размер. Элементы доступны для вставки или удаления в любой позиции.
         */
    }
    static void PriorityQueue(){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(555);
        pq.add(89);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    static void Stack(){
        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])){
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]){
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n",st.pop());
    }
}