import java.util.Arrays;

public class MyStack {
    /*
    Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
     */
    private int[] arr = new int[10];
    private int size = 0;

    int size(){
        return size;
    }
    boolean empty(){
        return  size == 0;
    }
    void push(int item){
        if (size == arr.length){
            int[] tempArray = new int[arr.length*2];
            System.arraycopy(arr, 0, tempArray,0, arr.length);
            arr =tempArray;
        }
        arr[size++] = item;
    }
    int peek(){
        return arr[size-1];
    }
    int pop(){
        return arr[--size];
    }
}