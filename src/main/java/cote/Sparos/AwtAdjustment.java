package cote.Sparos;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtAdjustment extends Frame implements AdjustmentListener {

    Scrollbar sb;
    TextArea output;

    public AwtAdjustment() {
        super("AdjustmentEvent");

        sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 1, 105);
        output = new TextArea();

        add(sb, BorderLayout.NORTH);
        add(output, BorderLayout.SOUTH);

        sb.addAdjustmentListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e ) {
        int type = e.getAdjustmentType();
        String[] name = {"", "UNIT_INCREMENT", "UNIT_DECREMENT",
            "BLOCK_DECREMENT", "BLOCK_INCREMENT", "TRACK"};
        output.append(name[type] + " : " + e.getValue()+"\n");
    }
    public static void main(String[] args) {}

}
