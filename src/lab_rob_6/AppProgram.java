package lab_rob_6;

public class AppProgram {
     int count;
     String name1;
     String name2;

    String nameProgram;
    String nameCompany;
    double sizeProgram;
    double price;

    public AppProgram(int count, String name1, String name2, String nameProgram, String nameCompany, double sizeProgram, double price) {
        this.count = count;
        this.name1 = name1;
        this.name2 = name2;
        this.nameProgram = nameProgram;
        this.nameCompany = nameCompany;
        this.sizeProgram = sizeProgram;
        this.price = price;

    }

    void showApp(){
        System.out.println(count);
        System.out.println(name1);
        System.out.println(name2);
    }

    void programView(){
        System.out.println("Назва програми: " + nameProgram + "; \n" + "Компанія: " + nameCompany + "; \n" + "Ціна: " + price + ";");
    }

    public interface NewM{
        public void priceOff();
    }
}
