package money;

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multipler) {
        return new Franc(amount * multipler);
    }
}
