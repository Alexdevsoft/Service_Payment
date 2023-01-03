package services;

public class PaypalService implements OnlinePaymentServices {

	@Override
	public double paymentFree(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, double months) {
		return amount * 0.01 * months;
	}
	
	

}
