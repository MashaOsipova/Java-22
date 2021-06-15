public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int topUpBalance = 1200;

        if (topUpBalance > 1000) {
            int bonus = topUpBalance / 100;
            System.out.println(bonus);
        }
        if (topUpBalance < 1000) {
            int bonus = 0;
        }
        int bonus = topUpBalance / 100;
        int totalBalance = accountBalance + topUpBalance + bonus;
        System.out.println(totalBalance);
    }
}
