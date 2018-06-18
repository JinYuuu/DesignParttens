package factory_pizza;

public abstract class PizzaStore {
	//SimplePizzaFactory factory;
	
	/*public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}*/
	
	
	public Pizza orderPizza (String type){
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
