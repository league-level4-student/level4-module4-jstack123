package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	int radius = 50;
	int time = 0;

	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		super.update();

		setX((int) (radius * Math.cos(time)));
		setY((int) (radius * Math.sin(time)));
		time += 1;
	}

}
