public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int topUp = 1500;
        int amount = balance + topUp;
        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        System.out.println(amount + bonus);
        System.out.println(bonus);
    }
}

