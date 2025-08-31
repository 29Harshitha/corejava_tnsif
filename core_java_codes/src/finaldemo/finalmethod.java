package finaldemo;
class EcommercePlatform
{
	final void calculateDiscount()
	{
		System.out.println("Base discount =10%");
	}
}
class Amazon extends EcommercePlatform
{
	void showExtraDiscount()
	{
	    System.out.println("Extra Discount =20%");	
	}
}

public class finalmethod {
	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.calculateDiscount();
		obj.showExtraDiscount();
	}

}
