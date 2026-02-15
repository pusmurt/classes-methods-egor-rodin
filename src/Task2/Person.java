//Создать класс Person, который содержит:
//
//        переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Петров В.В идет", "Петров В.В говорит"
//Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
//Вызовите методы move() и talk().

package Task2;

public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public Person () {
    }

    public Person (String fullName, int age) {
    this.fullName = fullName;
    this.age = age;
    }
}
