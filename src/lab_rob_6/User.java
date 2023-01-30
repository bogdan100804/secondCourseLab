package lab_rob_6;

public class User {
    public String userName;
    public int userAge;
    public String role;

    public String nameGame;
    public double price;
    public double rate;

    public User(String userName, int userAge, String role, String nameGame, double price, double rate) {
        this.userName = userName;
        this.userAge = userAge;
        this.role = role;
        this.nameGame = nameGame;
        this.price = price;
        this.rate = rate;
    }

    public String userNameVerification(){
        if((userName.equals("Admin")) || (userName.equals("User"))){
            return "Цей ім'я заняте! Змініть його!";
        }else{
            return "Тепер ваше ім'я: " + userName;
        }
    }
}
