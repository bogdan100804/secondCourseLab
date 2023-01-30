package lab_rob_4;


public class Games extends Programs{
    String nameGame;
    String genre;
    double sizeGame;
    double price;
    double rate;
    int countPieces;
    int ageForPlay;

    Games(String nameGame, String genre, double sizeGame, double price, double rate, int countPieces, int ageForPlay) {
        super();
        this.nameGame = nameGame;
        this.genre = genre;
        this.sizeGame = sizeGame;
        this.price = price;
        this.rate = rate;
        this.countPieces = countPieces;
        this.ageForPlay = ageForPlay;
    }

    public Games(String nameGame, String genre, double sizeGame, double price, double rate, int countPieces) {
        this.nameGame = nameGame;
        this.genre = genre;
        this.sizeGame = sizeGame;
        this.price = price;
        this.rate = rate;
        this.countPieces = countPieces;
    }

    Games() {

    }

    Games(String nameGame) {
        this.nameGame = nameGame;
    }

    void gameView(){
        System.out.println("Назва гри: " + nameGame + "; \n" + "Жанр: " + genre + "; \n" + "Ціна: " + price + "; \n" + "Допустимий вік: " + ageForPlay + ";");
    }

    double freeSpacePC(double sizePC){
        if (sizePC < sizeGame){
            double tempGame = sizeGame - sizePC;
            System.out.println("Увага! \n Bи можете придбати "+ nameGame +", проте у Вас мало місця на ПК! \n Бракує: " + tempGame);
            return tempGame;
        }else{
            System.out.println("Bи придбали " + nameGame + "! Встановіть її!");
            return 0;
        }
    }

    double freeSpacePC(double sizePC, double freeSize){
        if (sizePC < sizeGame){
            double tempGame = sizeGame - sizePC;
            System.out.println("Увага! \n Bи можете придбати "+ nameGame +", проте у Вас мало місця на ПК! \n Бракує: " + tempGame);
            return tempGame;
        }else{
            System.out.println("Bи придбали " + nameGame + "! Встановіть її!");
            System.out.println("Вільне місце: " + freeSize);
            return 0;
        }
    }

    void priceOff(){
        if(rate < 3){
            System.out.println("На " + nameGame + " діє знижка 30% \n Вартість становить: " + price*0.3);
        }
    }

    void someM(Games games){
        priceOff();
        System.out.println(games.nameGame);
    }

    Games up(double i, int j){
        Games games = new Games(nameGame, genre, sizeGame + i, price + i, rate + i, countPieces + j, ageForPlay + j);
        return games;
    }

    void others(Programs programs, User user){
        System.out.println(programs.nameProgram);
        System.out.println(user.getUserName());
    }

    void fatherMethod(){
        programViewDemo();
        gameView();
    }
}