package homeWork1.obstracles;

import homeWork1.Participant;
import homeWork1.Team;

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
            //obstacle.doIt(team);
        }
    }
}
