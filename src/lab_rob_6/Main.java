package lab_rob_6;


public class Main {
    public static void main(String[] args) {
        User user = new User("Admin", 17, "Teacher","CS:GO", 1000, 4.9);

        Games games = new Games("Admin", 17, "Teacher","CS:GO", 1000, 4.9);

        AppProgram appProgram = new AppProgram(2, "Gta", "PyCharm","Paint.net", "UA", 10, 100000);


        System.out.println(user.userNameVerification());

        System.out.println();

        System.out.println(games.userNameVerification());

        System.out.println();

        appProgram.programView();
        appProgram.showApp();
    }
}
