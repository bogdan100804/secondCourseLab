package lab_rob_1;

public class Programs {
    public String nameProgram;
    public String nameCompany;
    public double sizeProgram;
    public double price;
    public int countPieces;

    public Programs(String nameProgram, String nameCompany, double sizeProgram, double price, int countPieces) {
        this.nameProgram = nameProgram;
        this.nameCompany = nameCompany;
        this.sizeProgram = sizeProgram;
        this.price = price;
        this.countPieces = countPieces;
    }

    public Programs(String nameProgram, String nameCompany, double sizeProgram, int countPieces) {
        this.nameProgram = nameProgram;
        this.nameCompany = nameCompany;
        this.sizeProgram = sizeProgram;
        this.countPieces = countPieces;
    }

    public Programs() {

    }

    public void programView(){
        System.out.println("Назва програми: " + nameProgram + "; \n" + "Компанія: " + nameCompany + "; \n" + "Ціна: " + price + ";");
    }

    public double freeSpacePC(double sizePC) {
        if (sizePC < sizeProgram){
            double tempProgram = sizeProgram - sizePC;
            System.out.println("Увага! \n Bи можете придбати "+ nameProgram +", проте у Вас мало місця на ПК! \n Бракує: " + tempProgram);
            return tempProgram;
        }else{
            System.out.println("Bи придбали " + nameProgram + "! Встановіть її!");
            return 0;
        }
    }
}

