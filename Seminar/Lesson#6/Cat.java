import java.util.List;
import java.util.Objects;

public class Cat {
    /*
Задание №2
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
    private String onner;
   private String name;
   private int age;
   private String breed;
   private List<String> heathlist;

    @Override
    public String toString() {
        return "Cat{" +
                "onner='" + onner + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(onner, cat.onner) && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onner, name, age, breed);
    }

    public Cat(String onner, String name, int age, String breed) {
        this.onner = onner;
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}