//1.Телефон
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три объекта этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, принимает один аргумент – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber
// возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//Создать метод sendMessage с одним аргументом - номером телефонов на который будет отправлено сообщение. Метод выводит в консоль номер этих телефонов.

package Task1;

public class Task1 {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = "+79228530908";
        phone1.model = "iPhone 15";
        phone1.weight = 0.52;

        Phone phone2 = new Phone();
        phone2.number = "+79992034847";
        phone2.model = "Samsung galaxy S23";
        phone2.weight = 0.467;

        Phone phone3 = new Phone();
        phone3.number = "+79778067723";
        phone3.model = "Poco F4";
        phone3.weight = 0.573;

        System.out.println("Задача #1");
        System.out.println(" ");

        System.out.println("Значения переменных трёх созданных объектов:");
        phone1.getPhoneInfo();
        phone2.getPhoneInfo();
        phone3.getPhoneInfo();
        System.out.println(" ");

        System.out.println("Вызов методов receiveCall и getNumber для созданных объектов:");
        System.out.print("На ");
        phone1.getNumber();
        phone1.receiveCall("Петя");

        System.out.print("На ");
        phone2.getNumber();
        phone2.receiveCall("Саша");

        System.out.print("На ");
        phone3.getNumber();
        phone3.receiveCall("Антон");
        System.out.println(" ");

        System.out.println("Вызов перегруженного метода receiveCall:");
        phone1.receiveCall("Антон", "+79008009010");
        System.out.println(" ");

        System.out.println("Метод sendMessage с массивом номеров в аргументе:");
        phone1.sendMessage("+7999","+7989");
    }
}
