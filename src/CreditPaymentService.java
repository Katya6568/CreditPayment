public class CreditPaymentService {

    public int calculate(int sum, double ratePercent, int months) {
        int payment;

        double rate = ratePercent / 100;
        double monthRate = rate / 12;
        payment = (int) (sum * ((monthRate * Math.pow (1 + monthRate, months))) / (Math.pow (1 + monthRate, months) - 1));

        return payment;
    }
}
