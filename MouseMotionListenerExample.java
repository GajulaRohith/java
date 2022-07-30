import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
abstract class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    Label l = new Label();

    MouseMotionListenerExample() {
        l.setBounds(10, 50, 500, 20);
        add(l);
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("mouse dragging at " + e.getX() + "," + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("mouse moving at " + e.getX() + "," + e.getY());
    }

    public static void main(String args[]) {
        newMouseMotionListenerExample();


    }

    private static void newMouseMotionListenerExample() {
    }
}

