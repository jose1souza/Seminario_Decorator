package model;

public abstract class IceCream {
	protected String name;
	protected String description;

	public String getDescription() {
		return description;
	}

	public abstract double getCost();

}