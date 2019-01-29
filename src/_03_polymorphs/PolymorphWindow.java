package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	// Polymorph bluePoly;
	// Polymorph redPoly;
	// Polymorph movingPoly;
	Polymorph circlePoly = new CircleMorph(100, 100, 50, 50);;
	Polymorph mousePoly = new MouseMorph(200, 200, 40, 40);
	Polymorph imagePoly = new ImageMorph(400, 400, 60, 60);
	Polymorph messagePoly = new MessageMorph(300, 300, 60, 60);

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();


	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		window.pack();
		window.setVisible(true);
		addMouseMotionListener((MouseMorph) mousePoly);
		addMouseListener((MessageMorph) messagePoly);
	
		// bluePoly = new BluePolymorph(50, 50, 50, 50);
		// redPoly = new RedMorph(100, 100, 100, 100);
		// movingPoly = new MovingMorph(100, 100, 50, 50);
		
		
		
		polymorphs.add(circlePoly);
		polymorphs.add(mousePoly);
		polymorphs.add(imagePoly);
		polymorphs.add(messagePoly);
		
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph

		for (Polymorph p : polymorphs) {
			p.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

		for (Polymorph p : polymorphs) {
			p.update();
		}
	}

	
}
