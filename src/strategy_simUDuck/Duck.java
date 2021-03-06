package strategy_simUDuck;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	public void performFly(){
		flybehavior.fly();
	}
	
	public void performQuack(){
		quackbehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
}
