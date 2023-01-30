package lab_rob_6;

public class Games extends User implements AppProgram.NewM{
    public Games(String userName, int userAge, String role, String nameGame, double price, double rate) {
        super(userName, userAge, role, nameGame, price, rate);
    }

    public String userNameVerification(){
        if((userName.equals("Admin")) || (userName.equals("User"))){
            return "Цей ім'я заняте! Змініть його!";
        }else{
            return "Тепер ваше ім'я: " + userName;
        }
    }

    public void priceOff(){
        if(rate < 3){
            System.out.println("На " + nameGame + " діє знижка 30% \n Вартість становить: " + price*0.3);
        }
    }


}
