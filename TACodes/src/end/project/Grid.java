package end.project;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grid extends JFrame {
	int x = 0;
	int y = 0;

	Rectangle rectangle = new Rectangle();

	public Grid() {

		Action rightAction = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				x += ((int)(Math.random()*1011))%20;
				y += ((int)(Math.random()*1011))%20;
				rectangle.repaint();
			}
		};

		InputMap inputMap = rectangle
				.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = rectangle.getActionMap();

		inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		actionMap.put("rightAction", rightAction);

		add(rectangle);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private class Rectangle extends JPanel {

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.GREEN);
			g.fillRect(x, y, 50, 50);
		}

		public Dimension getPreferredSize() {
			return new Dimension(500, 500);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Grid();
			}
		});
	}
}