package lab7;

import java.awt.event.*;

import javax.swing.*;

public class test implements KeyListener, MouseListener, MouseMotionListener {

	// KeyListener
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.printf("%c %d\n", e.getKeyChar(), e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_1) {
			System.out.println("lel");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Fucking Click!!!!!!!");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Fucking Presss!!!!!!!");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Fucking Releaseeeeeeeeeezzzzzzzzz!!!!!!!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// MouseMotionListener
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ahhhhh It's draggggg inside~~~@!!@$!^");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ahhhhh It's moveeee inside~~~@!!@$!^");

	}

	private KeyListener keyListener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	};

	private MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	};
	
	@SuppressWarnings("unused")
	private MouseMotionListener mouseMotionListener = new MouseMotionListener() {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};

	// Init and main
	public void init() {
		JFrame fr = new JFrame("Test");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fr.setSize(500, 500);

		fr.addKeyListener(this);
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);

		fr.setVisible(true);

	}

	public static void main(String[] args) {
		test hello = new test();
		hello.init();
	}

}
