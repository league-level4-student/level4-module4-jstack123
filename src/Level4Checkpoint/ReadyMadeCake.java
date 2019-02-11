package Level4Checkpoint;

public class ReadyMadeCake extends Cake {
	 int quantity = 5;
	 double priceReady;
	//ReadyMadeCake ready = new ReadyMadeCake("Takeout", 10);
		public ReadyMadeCake(String n, double r) {
			super(n, r);
		}

		public double calcPrice() {
			priceReady = rate * quantity;
//			System.out.println(toString() + " Total: " + priceReady);
//			System.out.println(quantity + " ready-made cakes have been sold for a total price of " + priceReady);
			return priceReady;

		}
	}