package me._19_observer.java.integerdisplay._03_after;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Graph extends Canvas implements ValueListener {
    public static final int RECTANGLE = 0;
    public static final int CIRCLE = 1;

    protected int graphValue;

    public static Graph createGraph(int type, int width, int height) {
        Graph graph = null;
        if (type == RECTANGLE) {
            graph = new RectangleGraph();
        } else if (type == CIRCLE) {
            graph = new CircleGraph();
        } else {
            throw new IllegalArgumentException("Unsupported type: " + type);
        }
        graph.setSize(new Dimension(width, height));
        return graph;
    }

    @Override
    public void valueChanged(ValueChangeEvent e) {
        graphValue = e.getSource().getValue();
        repaint();
    }


    private static class RectangleGraph extends Graph {
        public void paint(Graphics g) {
            g.setColor(graphValue > 0 ? Color.BLUE : Color.RED);
            Rectangle bounds = getBounds();
            int x, y, w, h;
            if (graphValue > 0) {
                w = bounds.width / 2 * graphValue / 100;
                h = bounds.height / 2;
                x = bounds.width / 2;
                y = bounds.height / 4;
            } else {
                w = bounds.width / 2 * - graphValue / 100;
                h = bounds.height / 2;
                x = bounds.width / 2 - w;
                y = bounds.height / 4;
            }
            g.fillRect(x, y, w, h);
        }
    }

    private static class CircleGraph extends Graph {
        public void paint(Graphics g) {
            g.setColor(graphValue > 0 ? Color.BLUE : Color.RED);
            Rectangle bounds = getBounds();
            int startAngle = 90;
            int endAngle = graphValue * 10;
            g.fillArc(0, 0, bounds.width, bounds.height, startAngle, endAngle);
        }
    }
}
