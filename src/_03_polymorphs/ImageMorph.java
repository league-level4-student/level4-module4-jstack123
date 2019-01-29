package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	BufferedImage image;
	
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("download.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.drawImage(image, getX(), getY(), getWidth(),getHeight(),null);
	}
	
	public void update() {
		
	}
	
}
