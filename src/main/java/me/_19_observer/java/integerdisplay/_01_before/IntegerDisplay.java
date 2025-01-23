package me._19_observer.java.integerdisplay._01_before;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IntegerDisplay extends Frame implements ActionListener {
    private Label octalLabel = new Label("0");
    private Label decimalLabel = new Label("0");
    private Label hexadecimalLabel = new Label("0");

    private Button incrementButton = new Button("+");
    private Button decrementButton = new Button("-");

    private int value;

    public void actionPerformed() {

    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
        octalLabel.setText(Integer.toOctalString(value));
        decimalLabel.setText(Integer.toString(value));
        hexadecimalLabel.setText(Integer.toHexString(value));
    }

    public IntegerDisplay() {
        super("Integer Display");

        setLayout(new GridLayout(4, 2));
        add(new Label("Octal:"));
        add(octalLabel);
        add(new Label("Decimal:"));
        add(decimalLabel);
        add(new Label("Hexadecimal:"));
        add(hexadecimalLabel);
        add(incrementButton);
        add(decrementButton);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            setValue(getValue() + 1);
        } else if (e.getSource() == decrementButton) {
            setValue(getValue() - 1);
        }
    }
}
