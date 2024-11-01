package ehbien;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class Couleur extends Canvas implements WindowListener, MouseListener
{


    // Setup ------------------------------------------

    static Couleur prog = new Couleur();
    static Frame f = new Frame();

    static ArrayList<Integer> abc, ord;
    static ArrayList<Color> coul;

	public static void main(String[] args)
	{
		System.out.println("bonjour");

		abc = new ArrayList<>();
		ord = new ArrayList<>();
		coul = new ArrayList<>();

        f.add(prog);
        f.setTitle("/!\\ Epilepsy warning.");
        f.addWindowListener(prog);
        prog.addMouseListener(prog);

        f.setBounds(0, 0, 500, 500);
        f.setVisible(true);
	}


    // Dessin ------------------------------------------

	public void paint(Graphics uwu)
	{
		for(int i = 0; i < coul.size(); i++)
		{
			uwu.setColor(coul.get(i));
			uwu.fillOval(abc.get(i), ord.get(i), 25, 25);
		}

		repaint();
	}


    // Fenêtre ------------------------------------------

	public void windowActivated(WindowEvent e)
	{
	    System.out.println("activated");
	}

	public void windowClosed(WindowEvent e)
	{
	    System.out.println("closed");
	}

	public void windowClosing(WindowEvent e)
	{
	    System.out.println("closing");
        f.dispose();
	}

	public void windowDeactivated(WindowEvent e)
	{
	    System.out.println("deactivated");
	}

	public void windowDeiconified(WindowEvent e)
	{
	    System.out.println("deiconified");
	}

	public void windowIconified(WindowEvent e)
	{
	    System.out.println("iconified");
	}

	public void windowOpened(WindowEvent e)
	{
	    System.out.println("opened");
	}


    // Souris ------------------------------------------

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed");
        
        Random gnr = new Random();
        
        abc.add(e.getX());
        ord.add(e.getY());
        coul.add(new Color(gnr.nextInt(256), gnr.nextInt(256), gnr.nextInt(256)));
    }

    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse Released");
    }

}