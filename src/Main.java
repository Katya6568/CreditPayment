public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1000000, 9.99, 12));

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 24));

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 36));

    }

}

