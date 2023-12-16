/*
N-ое треугольное число

Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое 
треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.

Пример

n = 4 -> 10
n = 5 -> 15
*/
public class HomeTask1 {
    // Т(n) = (n*(n+1)/2)
 static void main(String[] args){
    //System.out.print(countNTriangle(2));
   countNTriangle(2);
 }

    static Integer countNTriangle(int n){
        if(n < 0)          
        return 1;
    else
        return( n + countNTriangle(n-1) );


        /*if (n >= 0){
            return  (n*(n+1)/2);
        }
        else{
            return -1;
        }
        */
       
        
    }
    
}
