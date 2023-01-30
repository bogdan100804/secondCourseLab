package lab_rob_1;

public class Games {
    public String nameGame;
    public String genre;
    public double sizeGame;
    public double price;
    public double rate;
    public int countPieces;
    public int ageForPlay;

    public Games(String nameGame, String genre, double sizeGame, double price, double rate, int countPieces, int ageForPlay) {
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

    public Games() {

    }

    public void gameView(){
        System.out.println("Назва гри: " + nameGame + "; \n" + "Жанр: " + genre + "; \n" + "Ціна: " + price + "; \n" + "Допустимий вік: " + ageForPlay + ";");
    }

    public double freeSpacePC(double sizePC){
        if (sizePC < sizeGame){
            double tempGame = sizeGame - sizePC;
            System.out.println("Увага! \n Bи можете придбати "+ nameGame +", проте у Вас мало місця на ПК! \n Бракує: " + tempGame);
            return tempGame;
        }else{
            System.out.println("Bи придбали " + nameGame + "! Встановіть її!");
            return 0;
        }
    }
}