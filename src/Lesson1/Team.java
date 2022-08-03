package Lesson1;

public class Team {
    private String team;
    private String[] name;

    public Team(String team) {
        this.team = team;
        this.name = new String[]{"Миша", "Гоша", "Саша", "Елена" };
    }
    public String getTeam() {
        return team;
    }
    public String[] getName() {
        return name;
    }

    public void infoTeam() {
        System.out.println("Команда " + getTeam() + "." + " Состав команды: ");
        for (var str : getName()) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
