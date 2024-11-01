import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.GroupLayout;

public class Evenement extends Canvas implements WindowListener, MouseListener {


    // Setup ------------------------------------------

    static Evenement prog = new Evenement();
    static Frame f = new Frame();
	public static void main(String[] args)
	{
		System.out.println("bonjour");

        f.add(prog);
        f.addWindowListener(prog);
        f.addMouseListener(prog);

        f.setBounds(0, 0, 500, 500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
	}


    // Dessin ------------------------------------------

	public void paint(Graphics uwu)
	{
		uwu.setColor(Color.blue);
		uwu.fillOval(0, 0, 450, 450);
		uwu.setColor(Color.red);
		uwu.fillOval(75, 75, 300, 300);
		uwu.setColor(Color.yellow);
		uwu.fillOval(150, 150, 150, 150);
		uwu.setColor(Color.black);
		uwu.fillOval(205, 205, 40, 40);

		uwu.setColor(Color.orange);
		Random g = new Random();
		int score = 0;

		for(int i = 1; i <= 3; i++)
		{
			int a = g.nextInt(400);
			int b = g.nextInt(400);
			uwu.drawString("" + i, a, b);

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


    // Fenêtre ------------------------------------------

	public void windowActivated(WindowEvent e) {
	    System.out.println("activated");
	}
	public void windowClosed(WindowEvent e) {
	    System.out.println("closed");
	}
	public void windowClosing(WindowEvent e) {
	    System.out.println("closing");
        f.dispose();
	}
	public void windowDeactivated(WindowEvent e) {
	    System.out.println("deactivated");
	}
	public void windowDeiconified(WindowEvent e) {
	    System.out.println("deiconified");
	}
	public void windowIconified(WindowEvent e) {
	    System.out.println("iconified");
	}
	public void windowOpened(WindowEvent e) {
	    System.out.println("opened");
	}


    // Souris ------------------------------------------

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

}
