import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        var a = 2; // Не явная типизация 
        int b = 525;
        float e = 2.8f; // При написание вещественных чисел обезательно в конце написат f
        boolean f = true ^ false; // ^ - или или разделителное дезюнкция  
        int c = 123;
        System.out.println(c=c-- - --c); // c++ - постфексный инкримент ++с - префекный инкримент
        //System.out.println(f);
        //System.out.println(e); // Вывод в коньсол
        //System.out.println(Integer.MAX_VALUE);

        // По битовые операции 
        //  По битовые здвиги
        int x = 8;
        // 1000
        // x = x << 1;
        System.out.println(x<<1); // x << 1 Здвик 1 бит в лева >> здвиг права

        // По битовые операции
        int y = 5;
        int z = 2;
        System.out.println(y | z); // | или
        System.out.println(y & z); // & и
        //101 = 5                   // ^ Истино тогда когда одно дольно быть истиной
        //010 = 2
        //111 = 7

        String s ="qwer1"; // 4, 0..3
        boolean y1 =s.length()>=5 && s.charAt(4) == '1';
        System.out.println(y1);  // && быстрая проверка так как если первая сторона не истина оно не будеть проверять второй. & провеяет обо стороны не зависимо результата первего

        //  Массивы
        int[] arr = new int[10];
        arr[3] =3;
        System.out.println(arr[3]);

        int[][] array = new int[2][3];
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++){
                System.out.printf("%d", array[i][j]);     
            }
        }
        System.out.println();

         // Получение данных из терминала

        Scanner iScanner = new Scanner(System.in);
        /*System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();*/

      /*  System.out.printf("int a: ");
        int x2 = iScanner.nextInt();
        System.out.printf("double a: ");
        double y2 = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x2, y2, x2+y2);
        iScanner.close();*/
        /*
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
        */

        // Канкатинация строк это катострофа 
        // так нельза делать
        String q = "qwer";
        int a1 = 123;
        String q1 = a1 + q;
        System.out.println(q1);
        // :(
/*
        int a3 = 2, b3 =1;
        int c3 = a3 + b3;
        String res = a3 + "+" + b3 + "=" + c3;
        System.out.println(res);*/

        // Форматированный вывод
        int a3 = 2, b3 =1;
        int c3 = a3 + b3;
        String res = String.format("%d + %d = %d /n",a3, b3, c3);
        System.out.println(res);
        lib.sayHi();
        lib.minNumber();

        for (int i = 0; i < 10; i++){
            if (i % 2==0){
                continue;
            }
            System.out.println(i);
        }

        // Работа с файлами 

        
    }

}
