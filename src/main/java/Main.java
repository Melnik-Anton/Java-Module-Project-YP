import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // главный метод

        Scanner scanner = new Scanner(System.in); // ввод с клавиатуры
        Race race = new Race(); // объект гонка для начальных данных лидера

        for (int i = 1; i <= 3; i++) { // цикл на 3 автомобиля
            System.out.println("Введите название автомобиля №" + i + ":"); // выводим на экран сообщение
            String name = scanner.next(); // вводим название автомобиля

            while (true) {
                System.out.println("Введите скорость автомобиля №" + i + ":"); // выводим на экран сообщение
                int speed = scanner.nextInt(); // вводим скорость автомобиля
                if (speed >= 0 && speed <= 250) { // проверяем диапазон скорости, если в диапазоне, то
                    Automobile automobile = new Automobile(name, speed); // создаём объект
                    race.testNewLeader(automobile.name, automobile.speed); // проверяем данные лидера
                    break; // останавливаем цикл
                } else { // если скорость не в диапазоне, то
                    System.out.println("Неправильная скорость"); // выводим на экран сообщение
                }

            }
        }
        System.out.println("Самая быстрая машина:" + race.leader);
    }
}