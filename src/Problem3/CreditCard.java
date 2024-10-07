package Problem3;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);
        this.creditLimit = new Money(creditLimit);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public boolean charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("\tCharge: " + amount);
            return true;
        } else {
            System.out.println("\t**Exceeds credit limit**");
            return false;
        }
    }

    public void payment(Money amount) {
        System.out.println("\tPayment: " + amount);
        balance = balance.subtract(amount);
        if (balance.compareTo(new Money(0)) < 0) {
            balance = new Money(0);
        }
    }
}