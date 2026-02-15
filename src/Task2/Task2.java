//Создать класс Person, который содержит:
//
//        переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Петров В.В идет", "Петров В.В говорит"
//Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
//Вызовите методы move() и talk().

package Task2;

public class Task2 {
    public static void main(String[] args) {
        Person human1 = new Person();
        human1.fullName = "Иванов И.И";
        human1.age = 27;

        Person human2 = new Person("Александров А.А", 31);

        System.out.println("Задача #2");
        human1.move();
        human1.talk();
        human2.move();
        human2.talk();
    }
}
