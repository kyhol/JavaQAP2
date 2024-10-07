package Problem3;

public class Money {
    private long dollars;
    private long cents;

    // Constructor for double amount
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Add method (modifies this object and returns it)
    public Money add(Money otherAmount) {
        this.cents += otherAmount.cents;
        this.dollars += otherAmount.dollars + this.cents / 100;
        this.cents %= 100;
        return this;
    }

    // Subtract method (modifies this object and returns it)
    public Money subtract(Money otherAmount) {
        long thisCents = this.dollars * 100 + this.cents;
        long otherCents = otherAmount.dollars * 100 + otherAmount.cents;
        long diffCents = thisCents - otherCents;
        this.dollars = diffCents / 100;
        this.cents = diffCents % 100;
        return this;
    }

    // Compare method
    public int compareTo(Money otherObject) {
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars);
        }
        return Long.compare(this.cents, otherObject.cents);
    }

    // Equals method
    public boolean equals(Money otherObject) {
        return (this.dollars == otherObject.dollars && this.cents == otherObject.cents);
    }

    // ToString method
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}