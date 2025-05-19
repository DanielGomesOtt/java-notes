package services;

import services.interfaces.PayInterface;

public class PixPay implements PayInterface {


    @Override
    public void setPay(double value) {
        System.out.println("O valor de " + value + " foi pago no pix");
    }
}
