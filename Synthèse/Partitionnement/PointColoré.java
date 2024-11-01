package jesaispas;

import java.awt.*;

public class PointColoré
{


	// Initialisation ------------------------------------------

	int x, y;
	Color col;

	public PointColoré(int abc, int ord, Color rb)
	{
		this.x = abc;
		this.y = ord;
		this.col = rb;
	}


	// Dessin ------------------------------------------

	public void afficher(Graphics uwu, PointColoré p)
	{
		uwu.setColor(p.col);
		uwu.fillRect(p.x - 5, p.y - 1, 11, 3);
		uwu.fillRect(p.x - 1, p.y - 5, 3, 11);
	}

}
