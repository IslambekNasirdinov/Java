import java.util.*;

public class Seminar_4 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        //task0();
        //task1();
        //task2();
        //task3(arr);
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(113);
        stack.push(14);
        stack.push(15);
        stack.push(17);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());
    }

    static void task0(){
        /*
        Задание №0
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
                Сравните с предыдущим.

         */

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            //list.add(0, i);
            list.add( i);
        }
        long midle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            //list1.add(0,i);
            list1.add(i);
        }
        long finish = System.currentTimeMillis();

        System.out.println(midle-start  );
        System.out.println(finish-midle);
    }
    static void task1(){
        /*
        Задание №1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
         */
    LinkedList<String> list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    boolean work = true;
    while (work){
        System.out.println("Введите команду: ");
        String line = scanner.nextLine();
        String[] arr = line.split("~");
        String text = arr[0];
        int num = Integer.parseInt(arr[1]);
        switch (text){
            case "print":
                System.out.println(list.remove(num));
                break;
            case "exit":
                System.out.println("Пока!");
                work = false;
                break;
            default:
                list.add(num,text);
        }
    }
    }
    static void task2(){
        /*
        Задание №2
 Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean work = true;
        while (work) {
            System.out.println("Введите техт: ");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "exit":
                    System.out.println("Пока!");
                    work = false;
                    break;
                default:
                    list.add(line);
                    break;


            }
        }
    }
    static void task3(Integer[] arr){
        /*
        Задание №3
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди
         */
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(arr));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("_________________");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    static void task4(){
        /*
        Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
         */

    }
    static void task5(){
        /*
        Задание №5 (доп)
Реализовать алгоритм перевода из инфиксной записи в постфиксную для
арифметического выражения.
http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
Вычислить запись если это возможно.
         */
    }
    static void homeTask1(){
        /*
        ДЗ
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
“перевернутый” список.
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
3. * В калькулятор добавьте возможность отменить последнюю операцию.
Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером
группы.
         */
    }
}