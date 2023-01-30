package lab_rob_4;

public class DownloadGame extends Games{
    public DownloadGame(String nameGame, String genre, double sizeGame, double price, double rate, int countPieces, int ageForPlay) {
        super(nameGame, genre, sizeGame, price, rate, countPieces, ageForPlay);
    }

    void showGame(){
        System.out.println(nameGame);
    }

    void test(){
        Downloading downloading = new Downloading();
        downloading.downloading(78.8);

    }
    class Downloading {
        void downloading(double i){
            System.out.println("Гру завантажено: " + i);
            showGame();
        }
    }
}
