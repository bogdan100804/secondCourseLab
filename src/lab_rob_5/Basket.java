package lab_rob_5;

public class Basket {
    static int countBasketGame;
    static int countBasketProgram;

    static void addBasketGame(String... item) {
        System.out.println("Корзина ігор: ");
        for (int i = 0; i < item.length; i++) {
            System.out.print(item[i] + "; ");
            countBasketGame += 1;
        }
        System.out.println();
        System.out.println("Кількість обраних ігор: " + countBasketGame);
    }

    static void addBasketProgram(String... item) {
        System.out.println("Корзина програм: ");
        for (int i = 0; i < item.length; i++) {
            System.out.print(item[i] + "; ");
            countBasketProgram += 1;
        }
        System.out.println();
        System.out.println("Кількість обраних програм: " + countBasketProgram);
    }
}
