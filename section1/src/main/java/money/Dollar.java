package money;

class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multipler) {
        return new Dollar(amount * multipler);
    }
}
