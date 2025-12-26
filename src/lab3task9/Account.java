package lab3task9;

public class Account {
    private String owner;
    private int balance;
    private int accountnumber;

    public Account(String owner, int balance, int accountnumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountnumber = accountnumber;
    }

    public String getowner() {
        return owner;
    }
    public void setowner(String owner) {
        this.owner = owner;
    }


    public int getbalance() {
        return balance;
    }
    public void setbalance(int balance) {
        this.balance = balance;
    }


    public int getaccountnumber() {
        return accountnumber;
    }
    public void setaccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }



    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("transfer amount is more than the account balance");
        }

        balance -= amount;
        System.out.println("transfer completed. Amount: " + amount);
    }

    }
