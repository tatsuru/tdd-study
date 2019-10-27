package money;

class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multipler) {
        return new Dollar(amount * multipler);
    }
}
