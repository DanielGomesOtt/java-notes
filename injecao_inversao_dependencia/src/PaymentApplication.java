import services.interfaces.PayInterface;

public class PaymentApplication {


    PayInterface payInterface;

    PaymentApplication(PayInterface payInterface) {
        this.payInterface = payInterface;
    }

    public void setPayment(double value){
        payInterface.setPay(value);
    }
}
