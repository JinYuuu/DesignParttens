package strategy_simUDuck;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
	}
	
	
}
