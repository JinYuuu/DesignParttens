package decorator_starbuzz;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	/*
	public double cost() {
		return .15 + beverage.cost();
	}
	*/
	public double cost() {
		double cost = beverage.cost();
		
		switch (beverage.getSize()){
			case TALL : cost += .10; break;
			case GRANDE : cost += .15; break;
			case VENTI : cost += .20; break;
			default : break;
		}
		
		return cost;
	}
}
