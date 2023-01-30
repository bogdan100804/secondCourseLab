package lab_rob_2;

public class User {
    public String userName;
    public int userAge;
    public String role;

    public User(String userName, int userAge, String role) {
        this.userName = userName;
        this.userAge = userAge;
        this.role = role;
    }

    public User() {

    }

    public void ageVerification(Games o){
        if(userAge > o.ageForPlay){
            System.out.println(userName + " може грати в " + o.nameGame);
        }else{
            System.out.println(userName + " не може грати в " + o.nameGame + ", оскільки йому не виповнилось " + o.ageForPlay);
        }
    }

    public String userNameVerification(){
        if((userName.equals("Admin")) || (userName.equals("User"))){
            return "Цей ім'я заняте! Змініть його!";
        }else{
            return "Тепер ваше ім'я: " + userName;
        }
    }
    public String userNameVerification(String newName){
        if((newName.equals("Admin")) || (newName.equals("User"))){
            return "Цей ім'я заняте! Змініть його!";
        }else{
            return "Тепер ваше ім'я: " + newName;
        }
    }

    public void priceOff(Programs programs) {
        if (role.equals("Student")) {
            System.out.println("На " + programs.nameProgram + " діє знижка 100% \n Вартість становить: " + programs.price * 0);
        }
    }
}
