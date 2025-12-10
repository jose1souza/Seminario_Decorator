package model;
public class ConeIceCream extends IceCream{
	private int numberOfBalls;
	
    public ConeIceCream(int numberOfBalls) {
    		if(numberOfBalls < 1)
    			throw new IllegalArgumentException("Coloque pelo"
    					+ " menos uma bola de sorvete");
    		
    		this.numberOfBalls = numberOfBalls;
    		description = "Sorvete de casquinha de "
    		+ this.numberOfBalls + " bola(s)";
    }

	@Override
	public double getCost() {
		return 3 + 3.0 * numberOfBalls;
	}

}