package model;
public class VanillaTopping extends TopingsDecorator{
	private IceCream iceCream;
	
    public VanillaTopping(IceCream iceCream) {
    		if(iceCream == null)
    			throw new IllegalArgumentException("O sorvete"
    					+ "não pode ser nulo");
    		this.iceCream = iceCream;
    }

	@Override
	public String getDescription() {
		return iceCream.getDescription() + " " + "com baunilha";
	}

	@Override
	public double getCost() {
		return iceCream.getCost() + 4.0;
	}

}