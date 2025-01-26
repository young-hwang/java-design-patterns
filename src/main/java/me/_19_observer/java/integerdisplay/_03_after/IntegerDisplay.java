package me._19_observer.java.integerdisplay._03_after;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IntegerDisplay extends Frame implements ActionListener, ValueListener {
    private Label octalLabel = new Label("0");
    private Label decimalLabel = new Label("0");
    private Label hexadecimalLabel = new Label("0");

    private Button incrementButton = new Button("+");
    private Button decrementButton = new Button("-");

    // private int value;
    private Value value = new Value(0);

    private final Graph graphCircle = Graph.createGraph(Graph.CIRCLE, 100, 100);
    private final Graph rectangleCircle = Graph.createGraph(Graph.RECTANGLE, 100, 50);

    public int getValue() {
        return this.value.getValue();
    }

    public void setValue(int value) {
        this.value.setValue(value);
//        octalLabel.setText(Integer.toOctalString(value));
//        decimalLabel.setText(Integer.toString(value));
//        hexadecimalLabel.setText(Integer.toHexString(value));
    }

    public IntegerDisplay() {
        super("Integer Display");

        Panel panel = new Panel(new GridLayout(4, 2));
        panel.add(new Label("Octal:"));
        panel.add(octalLabel);
        panel.add(new Label("Decimal:"));
        panel.add(decimalLabel);
        panel.add(new Label("Hexadecimal:"));
        panel.add(hexadecimalLabel);
        panel.add(incrementButton);
        panel.add(decrementButton);

        add(panel, BorderLayout.NORTH);
        add(graphCircle, BorderLayout.CENTER);
        add(rectangleCircle, BorderLayout.SOUTH);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        pack();
        setVisible(true);

        value.addValueListener(this);
        value.addValueListener(graphCircle);
        value.addValueListener(rectangleCircle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            setValue(getValue() + 1);
        } else if (e.getSource() == decrementButton) {
            setValue(getValue() - 1);
        }
    }

    @Override
    public void valueChanged(ValueChangeEvent e) {
        if (e.getSource() == value) {
            octalLabel.setText(Integer.toOctalString(value.getValue()));
            decimalLabel.setText(Integer.toString(value.getValue()));
            hexadecimalLabel.setText(Integer.toHexString(value.getValue()));
        }
    }
}
