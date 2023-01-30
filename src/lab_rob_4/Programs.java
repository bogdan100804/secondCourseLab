package lab_rob_4;

public class Programs extends User{
    String nameProgram;
    String nameCompany;
    double sizeProgram;
    double price;
    int countPieces;

    Programs(String nameProgram, String nameCompany, double sizeProgram, double price, int countPieces) {
        super();
        this.nameProgram = nameProgram;
        this.nameCompany = nameCompany;
        this.sizeProgram = sizeProgram;
        this.price = price;
        this.countPieces = countPieces;
    }

    Programs(String nameProgram, String nameCompany, double sizeProgram, int countPieces) {
        this.nameProgram = nameProgram;
        this.nameCompany = nameCompany;
        this.sizeProgram = sizeProgram;
        this.countPieces = countPieces;
    }

    Programs() {

    }

    private void programView(){
        System.out.println("Назва програми: " + nameProgram + "; \n" + "Компанія: " + nameCompany + "; \n" + "Ціна: " + price + ";");
    }

    private double freeSpacePC(double sizePC) {
        if (sizePC < sizeProgram){
            double tempProgram = sizeProgram - sizePC;
            System.out.println("Увага! \n Bи можете придбати "+ nameProgram +", проте у Вас мало місця на ПК! \n Бракує: " + tempProgram);
            return tempProgram;
        }else{
            System.out.println("Bи придбали " + nameProgram + "! Встановіть її!");
            return 0;
        }
    }

    private double freeSpacePC(double sizePC, double freeSize) {
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

    private void priceOff(){
        if((!nameProgram.equals("Adobe")) || (!nameProgram.equals("JET Brains"))){
            System.out.println("На " + nameProgram + " діє знижка 20% \n Вартість становить: " + price*0.2);
        }
    }


    public void programViewDemo(){
        programView();
    }
    public double freeSpacePCDemo(){
        return freeSpacePC(19.0);
    }
    public double freeSpacePCDemo1(){
        return freeSpacePC(19.0, 20.9);

    }
    public void priceOffDemo(){
        priceOff();
    }

    public void fatherM(){
        System.out.println(userNameVerification("Admin"));
        programViewDemo();
    }

}

