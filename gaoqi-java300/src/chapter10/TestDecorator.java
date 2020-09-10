package chapter10;

/**
 * *装饰器设计模式
 * 1.抽象组件：    需要装饰的抽象对象（接口或抽象父类）
 * 2.具体组件：    需要装饰的对象
 * 3.抽象装饰类：包含了对抽象组件的引用以及装饰着共有的方法
 * 4.具体装饰类：装饰后的对象
 * @author pYq
 *
 */
public class TestDecorator {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.info() + ". ** Price:" +coffee.cost());

		Milk milk = new Milk(coffee);
		System.out.println(milk.info() + ". ** Price:" +milk.cost());

		Suger suger = new Suger(milk);
		System.out.println(suger.info() + ". ** Price:" +suger.cost());
	}



}

//抽象组件
interface Drink {
	double cost();
	String info();
}

//具体组件
class Coffee implements Drink {

	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String info() {
		return "SimpleCoffee";
	}
}

//抽象装饰类
abstract class Decorator implements Drink {
	private Drink drink;
	public Decorator(Drink drink) {
		this.drink = drink;
	}

	@Override
	public double cost() {
		return this.drink.cost();
	}

	@Override
	public String info() {
		return this.drink.info();
	}
}

//具体装饰类1
class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		return super.cost() * 2;
	}

	@Override
	public String info() {
		return super.info()+" with milk";
	}
}

//具体装饰类2
class Suger extends Decorator {

	public Suger(Drink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		return super.cost() * 3;
	}

	@Override
	public String info() {
		return super.info()+" with suger";
	}
}