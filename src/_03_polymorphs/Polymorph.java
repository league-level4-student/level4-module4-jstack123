package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public int getX() {
    		return x;
    }
    public int getY() {
		return y;
    }
    public int getWidth() {
		return width;
    }
    public int getHeight() {
		return height;
    }
    public void setX(int newX) {
    		this.x = newX;
    }
    public void setY(int newY) {
    		this.y = newY;
    }
    public void setWidth(int newWidth) {
    		this.width = newWidth;
    }
    public void setHeight(int newHeight) {
    		this.height = newHeight;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
