

import java.applet.Applet;
import java.awt.*;


public class circleandeclips extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.drawOval(10, 10, 80, 30);
        g.fillOval(70, 70, 80, 80);
        
    }
}
