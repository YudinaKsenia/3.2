public class Main {
    public static void main(String[] args) {
        int originalAmount = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;

        int totalAmount;
        if (replenishment > 1000) {
            totalAmount = replenishment + bonus + originalAmount;
        } else {
            totalAmount = replenishment + originalAmount;
            bonus = 0;
        }

        System.out.println(totalAmount);
        System.out.println(bonus);
    }
}

