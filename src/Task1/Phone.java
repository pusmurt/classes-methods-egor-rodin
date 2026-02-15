package Task1;

public class Phone {
    String number;
    String model;
    double weight;
    static int phoneCount = 1;

    public void getPhoneInfo() {
        System.out.println("Информация для телефона #" + phoneCount + " Номер телефона: " + number + " Модель телефона: " + model + " Вес телефона: " + weight);
        ++phoneCount;
    }

    public void receiveCall(String caller) {
        System.out.println(" звонит " + caller);
    }

    public void getNumber() {
        System.out.print("номер телефона: " + number);
    }

    public Phone(String number, double weight, String model) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String caller, String callerNumber) {
        System.out.println("Звонит " + caller + " с телефона " + callerNumber);
    }

    public void sendMessage(String...numbers) {
        for (String number: numbers) {
            System.out.println("Сообщение будет отправлено на номер" + number);
        }
    }
}
