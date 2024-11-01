import java.math.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

class Dessin extends Canvas {
	
	public static void main(String[] args)
	{
		System.out.println("bonjour");
		
		Dessin d = new Dessin();
		Frame f = new Frame();
		f.add(d);
		f.setVisible(true);
		f.setSize(450, 500);
		
		Scanner entre = new Scanner(System.in);
		String test = entre.nextLine();
		f.dispose();
	}
	
	public void paint(Graphics p)
	{
		p.setColor(Color.blue);
		p.fillOval(0, 0, 450, 450);
		p.setColor(Color.red);
		p.fillOval(75, 75, 300, 300);
		p.setColor(Color.yellow);
		p.fillOval(150, 150, 150, 150);
		p.setColor(Color.black);
		p.fillOval(205, 205, 40, 40);
		
		p.setColor(Color.orange);
		Random g = new Random();
		int score = 0;
		for(int i = 1; i <= 3; i++)
		{
			int a = g.nextInt(400);
			int b = g.nextInt(400);
			p.drawString("" + i, a, b);
			
			if(Math.hypot(Math.abs(a - 225), Math.abs(b - 225)) < 225)
			{
				score += 10;
			}
			if(Math.hypot(Math.abs(a - 225), Math.abs(b - 225)) < 150)
			{
				score += 10;
			}
			if(Math.hypot(Math.abs(a - 225), Math.abs(b - 225)) < 75)
			{
				score += 10;
			}
			if(Math.hypot(Math.abs(a - 225), Math.abs(b - 225)) < 20)
			{
				score += 20;
			}
		}
		System.out.println("Score : " + score);
	}
	
}
