package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        Team team = new Team("Страх");
        Course course = new Course();
        team.infoTeam();
        course.doIt(team);
    }
}
