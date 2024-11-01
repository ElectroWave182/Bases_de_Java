package jesaispas;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class Partitionnement extends Canvas implements WindowListener
{


	// Setup ------------------------------------------
 
	static ArrayList<PointColoré> points = new ArrayList<>();
	int xb, yb, xr, yr;

	public static void main(String[] args)
	{
		Partitionnement prog = new Partitionnement();
		Frame f = new Frame();
		f.add(prog); f.addWindowListener(prog);

		f.setBounds(0, 0, 900, 900);
		f.setTitle("Rien ne s'affiche...");
		f.setVisible(true);


	// Résultats ------------------------------------------

		int nbBlue = 0;
		int nbRed = 0;
		for(PointColoré p: points)
		{
			if(p.col.equals(Color.blue))
			{
				nbBlue++;
			}
			else if(p.col.equals(Color.red))
			{
				nbRed++;
			}
		}
		
		if(nbBlue > nbRed)
		{
			System.out.print("Blue wins");
		}
		else if(nbRed > nbBlue)
		{
			System.out.print("Red wins");
		}
		else
		{
			System.out.print("Draw");
		}
	}


	// Initialisation ------------------------------------------

	public Partitionnement()
	{
		Random gnr = new Random();

		xb = gnr.nextInt(870) + 15;
		yb = gnr.nextInt(870) + 15;
		xr = gnr.nextInt(870) + 15;
		yr = gnr.nextInt(870) + 15;

		int xp, yp;
		double blueDist, redDist;
		for(int i = 0; i < 100; i++)
		{


	// Calcul des distances ------------------------------------------

			xp = gnr.nextInt(888) + 12;
			yp = gnr.nextInt(888) + 12;
			blueDist = Math.sqrt(Math.pow(Math.abs(xp - xb), 2) + Math.pow(Math.abs(yp - yb), 2));
			redDist = Math.sqrt(Math.pow(Math.abs(xp - xr), 2) + Math.pow(Math.abs(yp - yr), 2));

			if(blueDist > redDist)
			{
				points.add(new PointColoré(xp, yp, Color.blue));
			}
			else if(redDist > blueDist)
			{
				points.add(new PointColoré(xp, yp, Color.red));
			}
			else
			{
				points.add(new PointColoré(xp, yp, Color.green));
			}
		}
	}


	// Dessin ------------------------------------------

	public void paint(Graphics uwu)
	{
		for(PointColoré p: points)
		{
			p.afficher(uwu, p);
		}
		uwu.setColor(Color.red);
		uwu.fillOval(xb - 14, yb - 14, 30, 30);
		uwu.setColor(Color.blue);
		uwu.fillOval(xr - 14, yr - 14, 30, 30);
	}


	// Fenêtre ------------------------------------------

	public void windowActivated(WindowEvent e)
	{
	}

	public void windowClosed(WindowEvent e)
	{
	}

	public void windowClosing(WindowEvent e)
	{
        System.exit(0);
	}

	public void windowDeactivated(WindowEvent e)
	{
	}

	public void windowDeiconified(WindowEvent e)
	{
	}

	public void windowIconified(WindowEvent e)
	{
	}

	public void windowOpened(WindowEvent e)
	{
	}

}
