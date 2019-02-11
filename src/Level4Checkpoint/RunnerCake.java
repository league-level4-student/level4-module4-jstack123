package Level4Checkpoint;

import java.util.Random;

public class RunnerCake {
public static void main(String[] args) {
	Random random = new Random();
	Cake[] cake = new Cake[20];
	int totalOrdered = 0;
	for (int i = 0; i < cake.length / 2; i++) {
	
		int r = random.nextInt(25);
		cake[i] = new OrderCake("Fresh", r);
		System.out.println("Order cakes total price: "+ cake[i].calcPrice());
		totalOrdered += cake[i].calcPrice();
	}
		System.out.println("Total price of all ordered cakes: " + totalOrdered);
		int totalReady = 0;
	for (int i = 10; i < cake.length; i++) {
		int r = random.nextInt(15);
		cake[i] = new ReadyMadeCake("Takeout", r);
		System.out.println("Ready-made cakes total price: "+ cake[i].calcPrice() + " Quantity sold: " + cake[i].calcPrice()/cake[i].rate);
		totalReady += cake[i].calcPrice();
	}
	System.out.println("Total price of all ready cakes: " + totalReady);
	double cakeHighestPrice = 0;
	for (int i = 0; i < cake.length; i++) {
		if(cake[i].calcPrice() > cakeHighestPrice) {
			cakeHighestPrice = cake[i].calcPrice();
		}
	}
	System.out.println("Highest priced cake: " + cakeHighestPrice);
}
}
