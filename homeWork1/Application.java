package homeWork1;

import homeWork1.animals.Cat;
import homeWork1.animals.Dog;
import homeWork1.obstracles.*;

public class Application {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        });
        Team team = new Team("Команда",
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Dog ("Вертер", 50, 50, 50));  // Создаем команду
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}
