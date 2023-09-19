package Lesson_work_6.isp;

public class CustomPaymentService extends PaymentService implements WebMoney, CreditCard {

	@Override
	public void payWebMoney(int amount) {
		System.out.println("Custom pay by webMoney" + amount + "\n");
	}

	@Override
	public void payCreditCard(int amount) {
		System.out.println("Custom pay by credit card " + amount + "\n");
	}

}
