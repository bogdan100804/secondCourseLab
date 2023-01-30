package lab_rob_3;


public class User {
    private String userName;
    private int userAge;
    private String role;

    User(String userName, int userAge, String role) {
        this.userName = userName;
        this.userAge = userAge;
        this.role = role;
    }

    User() {

    }

    void ageVerification(Games o){
        if(userAge > o.ageForPlay){
            System.out.println(userName + " може грати в " + o.nameGame);
        }else{
            System.out.println(userName + " не може грати в " + o.nameGame + ", оскільки йому не виповнилось " + o.ageForPlay);
        }
    }

    String userNameVerification(){
        if((userName.equals("Admin")) || (userName.equals("User"))){
            return "Цей ім'я заняте! Змініть його!";
        }else{
            return "Тепер ваше ім'я: " + userName;
        }
    }
    String userNameVerification(String newName){
        if((newName.equals("Admin")) || (newName.equals("User"))){
            return "Цей ім'я заняте! Змініть його!";
        }else{
            return "Тепер ваше ім'я: " + newName;
        }
    }

    void priceOff(Programs programs) {
        if (role.equals("Student")) {
            System.out.println("На " + programs.nameProgram + " діє знижка 100% \n Вартість становить: " + programs.price * 0);
        }
    }








    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        int u = userAge*2;
        this.userAge = u;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
