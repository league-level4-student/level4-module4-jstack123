package Level4Checkpoint;

public abstract class Cake {
	protected String name;
	protected double rate;
	private int quantity;
	private int weight;

	Cake[] cake = new Cake[20];

	public Cake(String n, double r) {
		name = n;
		rate = r;
		for (int i = 0; i < cake.length / 2; i++) {
			cake[i] = new OrderCake("Fresh", 15);
		}
		for (int i = 10; i < cake.length; i++) {
			cake[i] = new ReadyMadeCake("Takeout", 10);
		}
	}

	public static void main(String[] args) {

	}

	public int getQuantity() {
		return quantity;
	}

	public int getWeight() {
		return weight;
	}

	public void setQuantity() {
		this.quantity = quantity;
	}

	public void setWeight() {
		this.weight = weight;
	}

	public abstract double calcPrice();

	public String toString() {
		return name + "\t" + rate;
	}
}

class OrderCake extends Cake {

	public OrderCake(String n, double r) {
		super(n, r);

	}

	@Override
	public double calcPrice() {
		double priceOrder;
		priceOrder = rate * getWeight();
		System.out.println(priceOrder);
		return priceOrder;
	}

}

class ReadyMadeCake extends Cake {

	public ReadyMadeCake(String n, double r) {
		super(n, r);

	}

	public double calcPrice() {
		double priceReady;
		priceReady = rate * getQuantity();
		System.out.println(getQuantity() + " cakes have been sold for a total price of " + priceReady);
		return priceReady;

	}
}
