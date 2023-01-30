package lab_rob_1;

public class Main {
    public static void main(String[] args) {
        Games game = new Games("CS:GO", "Шутер", 27.7, 1000, 4.9, 100, 16);

        Programs program = new Programs("Paint.net", "UA", 10, 100000);

        User user = new User("Admin", 17, "Teacher");


        System.out.println(game.freeSpacePC(13.7));
        game.gameView();

        System.out.println();

        program.programView();
        System.out.println(program.freeSpacePC(20.9));

        System.out.println();

        user.ageVerification(game);
        System.out.println(user.userNameVerification());

    }
}