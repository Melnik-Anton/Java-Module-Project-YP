public class Race { // создаём класс гонка
    String leader = ""; // переменная - имя текущего лидера
    int leaderDistance = 0; // переменная - дистанция текущего лидера
    public void testNewLeader(String name, int speed) {// метод проверки нового лидера
        int distance = speed * 24; // дистанция за 24 часа
        if (distance > leaderDistance) { // если новая дистанция больше дистанции лидера, то
            leader = name; // присваиваем лидеру новое имя
            leaderDistance = distance; // присваиваем лидеру новую дистанцию
        }
    }
}