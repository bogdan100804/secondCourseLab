package lab_rob_5;

public class Dispatch {
    Games game = new Games("CS:GO", "Шутер", 27.7, 1000, 4.9, 100, 16);

    Programs program = new Programs("Paint.net", "UA", 10, 100000);

    User user = new User("Admin", 17, "Teacher");

    User u;

    void choice(int i){
        if (i == 1){
            u = user;
            u.blackFriday(40.0);
        } else if (i == 2) {
            u = program;
            u.blackFriday(30.0);
        } else if (i == 3) {
            u = game;
            u.blackFriday(20.0);
        }
    }
}
