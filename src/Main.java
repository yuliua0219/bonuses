public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 1500;
        int amount = x + y;
        int bonus;
        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        System.out.println(amount + bonus);
        System.out.println(bonus);
    }
}

