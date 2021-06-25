

import java.applet.Applet;
import java.awt.*;

public class arcs extends Applet {
    
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.drawArc(30, 30, 80, 40, 180, 180);
        g.fillArc(70, 70, 80, 40, 180, 50);
    }

    
}
