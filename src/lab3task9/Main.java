package lab3task9;

public class Main {
    public static void main(String[] args) {
        Account a = new Account("Ammar Elsayed", 700, 16122006);

        try {
            a.transfer(800);
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("exception caught :");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final balance: " + a.getbalance());
        }


    }
}
