package tw.org.iii.YEAR;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.function.IntConsumer;

import javax.swing.JPanel;

public class MyPainter extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycle;

	public MyPainter() {
		// setBackground(Color.YELLOW);
		MyAdapter adapter = new MyAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.GREEN);
		g2d.setStroke(new BasicStroke(4));
		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i - 1);
				HashMap<String, Integer> p1 = line.get(i);
				int p0x = p0.get("x"), p0y = p0.get("y");
				int p1x = p1.get("x"), p1y = p1.get("y");
				g2d.drawLine(p0x, p0y, p1x, p1y);

			}
		}
	}

	// g2d.fillOval(0, 0, 50, 60);
	void clear() {
		lines.clear();
		repaint();
	}

	void undo() {
		if (lines.size() > 0) {
			recycle.add(lines.removeLast());
			repaint();
		}
	}

	void redo() {
		if (recycle.size() > 0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
	
	void save() {
		
	}

	private class MyAdapter extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			// System.out.println("Dragged:" + e.getX());
			addPoint(e);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			// System.out.println("Pressed:" + e.getX());
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			lines.add(line);
			addPoint(e);
		}

		private void addPoint(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point);

		}

	}

}
