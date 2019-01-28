package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	int xspeed = 0;
	int yspeed = 0;

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		super.update();
		if (getX() < 105 && getY() < 105) {
			xspeed = 10;
			yspeed = 10;
		}

		if (getX() > 400 && getY() < 100) {
			xspeed = -10;
			yspeed = 0;

		}
		if (getX() > 400 && getY() > 400) {
			xspeed = -10;
			yspeed = 0;
		}
		if (getX() < 100 && getY() > 400) {
			xspeed = 10;
			yspeed = -10;
		}
		setX(getX() + xspeed);
		setY(getY() + yspeed);
	}

}
