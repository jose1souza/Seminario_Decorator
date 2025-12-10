package model;
public class MilkIceCream extends IceCream{
	private int numberOfBalls;
	
    public MilkIceCream(int numberOfBalls) {
    		if(numberOfBalls < 1)
    			throw new IllegalArgumentException("Coloque pelo"
    					+ " menos uma bola de sorvete");
    		
    		this.numberOfBalls = numberOfBalls;
    		description = "Sorvete ao leite de "
    	    		+ this.numberOfBalls + " bola(s)";
    }

	@Override
	public double getCost() {
		return 3.0 * numberOfBalls;
	}

}