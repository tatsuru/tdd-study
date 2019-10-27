package money;

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multipler) {
        return new Franc(amount * multipler);
    }
}
