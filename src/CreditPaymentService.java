public class CreditPaymentService {

    public int calculate(int sum, double rate, int months) {
        int payment;

        double monthRate = rate / months;
        payment = (int) ((int) sum * (monthRate * Math.pow (1 + monthRate, months)) / Math.pow (1 + monthRate, months) - 1);

        return payment;
    }
}
