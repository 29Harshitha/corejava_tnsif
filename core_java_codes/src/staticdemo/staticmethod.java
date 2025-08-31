package staticdemo;
class PaymentGateway
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Banks : SBI, HDFC,ICICI,AXis");
	}
}

public class staticmethod {
	public static void main(String[] args) {
		PaymentGateway.showSupportedBanks();

	}

}
