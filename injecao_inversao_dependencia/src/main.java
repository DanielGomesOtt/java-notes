import services.PixPay;


public class main {

    public static void main(String[] args) {

        /*
          Injeção de dependência: "Não crie o objeto dentro da classe, injete de fora."
          Inversão de dependência: "Dependa de abstrações (interfaces), não de implementações."
        * */
        PaymentApplication payment = new PaymentApplication(new PixPay());
        payment.setPayment(150.00);
    }
}
