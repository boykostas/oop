package Lesson_work_6.isp;

public class InternetPaymentService extends PaymentService implements WebMoney, CreditCard, PhoneNumber {

	@Override
	public void payWebMoney(int amount) {
		System.out.println("Internet pay by webMoney" + amount + "\n");
	}

	@Override
	public void payCreditCard(int amount) {
		System.out.println("Internet pay by credit card " + amount + "\n");
	}

	@Override
	public void payPhoneNumber(int amount) {
		System.out.println("Internet pay by phone number " + amount + "\n");
	}

}
