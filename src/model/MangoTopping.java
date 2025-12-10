package model;
public class MangoTopping extends TopingsDecorator{
	private IceCream iceCream;
	
	public MangoTopping(IceCream iceCream) {
		if(iceCream == null)
			throw new IllegalArgumentException("O sorvete"
					+ "não pode ser nulo");
		this.iceCream = iceCream;
	}
	
	@Override
	public String getDescription() {
		return iceCream.getDescription() + " " + "com manga";
	}

	@Override
	public double getCost() {
		return iceCream.getCost() + 2.5;
	}
}