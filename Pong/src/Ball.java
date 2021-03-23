import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends Rectangle{
	
	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed =2;
	
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(10);
		if(randomXDirection%2 == 0) {
			setXDirection((-randomXDirection+1)*initialSpeed);
			if(randomXDirection == 0) {
				randomXDirection++;
				setYDirection(-randomXDirection*initialSpeed);
			}
		}
		else
			{setXDirection(randomXDirection*initialSpeed);}
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection%2 == 0) {
			setYDirection(-randomYDirection*initialSpeed);
			if(randomYDirection == 0) {
				randomYDirection++;
				setYDirection((-randomYDirection+1)*initialSpeed);
			}
			}
		else
			{setYDirection(randomYDirection*initialSpeed);}
	}
	
	public void setXDirection(int randomXDirection){
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection){
			yVelocity = randomYDirection;
	}
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, height, width); 
	}
}

