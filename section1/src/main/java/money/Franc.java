package money;

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multipler) {
        return new Franc(amount * multipler);
    }
}
