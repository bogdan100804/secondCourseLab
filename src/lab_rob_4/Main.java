package lab_rob_4;


public class Main {
    public static void main(String[] args) {
       Games game = new Games("CS:GO", "Шутер", 27.7, 1000, 4.9, 100, 16);
       Games game1 = new Games("CS:GO");
       Games game2 = new Games();
       Games game3 = new Games("CS:GO", "Шутер", 27.7, 1000, 4.9, 100);


        Programs program = new Programs("Paint.net", "UA", 10, 100000);

        User user = new User("Admin", 17, "Teacher");


        System.out.println(game.freeSpacePC(13.7));
        game.gameView();
        System.out.println(game.freeSpacePC(19.7, 30.8));
        game.priceOff();
        game.someM(game);
        game.up(1.9, 2);
        game.others(program,user);
        game.fatherMethod();


        System.out.println();

        program.programViewDemo();
        System.out.println(program.freeSpacePCDemo());
        System.out.println(program.freeSpacePCDemo1());
        program.priceOffDemo();
        program.fatherM();

        System.out.println();

        user.ageVerification(game);
        System.out.println(user.userNameVerification());
        System.out.println(user.userNameVerification("Admin"));
        user.priceOff(program);

        System.out.println();

        Basket.addBasketGame("GTA");
        Basket.addBasketProgram("Intellij");

        System.out.println();

        NewApps newApps = new NewApps();
        newApps.addApp("CorelDraw");
        newApps.showApp();

        System.out.println();

        DownloadGame downloadGame = new DownloadGame("CS:GO", "Шутер", 27.7, 1000, 4.9, 100, 16);
        downloadGame.test();

    }
}