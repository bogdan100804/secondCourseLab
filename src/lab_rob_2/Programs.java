package lab_rob_2;

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

    public double freeSpacePC(double sizePC, double freeSize) {
        if (sizePC < sizeProgram){
            double tempProgram = sizeProgram - sizePC;
            System.out.println("Увага! \n Bи можете придбати "+ nameProgram +", проте у Вас мало місця на ПК! \n Бракує: " + tempProgram);
            return tempProgram;
        }else{
            System.out.println("Bи придбали " + nameProgram + "! Встановіть її!");
            System.out.println("Вільне місце: " + freeSize);
            return 0;
        }
    }

    public void priceOff(){
        if((!nameProgram.equals("Adobe")) || (!nameProgram.equals("JET Brains"))){
            System.out.println("На " + nameProgram + " діє знижка 20% \n Вартість становить: " + price*0.2);
        }
    }

}

