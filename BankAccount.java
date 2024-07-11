public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        if (sum > 0) {
            amount += sum;
        }
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма превышает остаток на счете", amount);
        }else {
            amount -= sum;
        }
    }
}
