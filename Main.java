public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000);
        while (true){
            try {
                try {
                    account.withDraw(6000);
                    System.out.println("Снято 6000 сом, остаток: " + account.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                    try {
                        account.withDraw((int) e.getRemainingAmout());
                        System.out.println("Снята оставшаяся сумма: " +
                                e.getRemainingAmout() + "сом, остаток: " + account.getAmount());
                    }catch (LimitException ex){}
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
            break;
        }
    }
}