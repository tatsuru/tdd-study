package money;

class Dollar extends Money {
    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multipler) {
        return Money.dollar(amount * multipler);
    }
}
