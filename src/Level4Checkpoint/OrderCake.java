package Level4Checkpoint;

public class OrderCake extends Cake {
	int weightKG = 2;
	double priceOrder;
	
		public OrderCake(String n, double r) {
			super(n, r);		
			//OrderCake order = new OrderCake("order", 15);
		}

		@Override
		public double calcPrice() {
			priceOrder = rate * weightKG;	
			//System.out.println(toString() + " Total: " + priceOrder);
			return priceOrder;
		}

	}
