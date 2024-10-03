package Problem3;

public class Money {
    // Define fields with long separately because floating-point numbers will cause rounding errors
    private long dollars;
    private long cents;

    // Converting to cents to get total value in cents then convert back in the
    private long getTotalCents() {
        return dollars * 100 + cents;
    }

    // Constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100.0);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add monies objects together and get new monies object
    public Money add(Money otherAmount) {
        long totalCents = this.getTotalCents() + otherAmount.getTotalCents();
        return new Money(totalCents / 100.0);
    }

    // Subtract monies objects from each other creating new object
    public Money subtract(Money otherAmount) {
        long totalCents = this.getTotalCents() - otherAmount.getTotalCents();
        return new Money(totalCents / 100.0);
    }

    // Compare total cents value
    public int compareTo(Money otherAmount) {
        return Long.compare(this.getTotalCents(), otherAmount.getTotalCents());
    }

    @Override // Check to see if objects are equal
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Money))
            return false;
        Money other = (Money) obj;
        return this.getTotalCents() == other.getTotalCents();
    }

    // Convert to string. String representation = to format %d to display dollars in decimal and cents with %02d (to pad with 0's and 2 digits after the .)
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}