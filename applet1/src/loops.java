

import java.applet.Applet;
import java.awt.*;

public class loops extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.gray);
        for(int i=0;i<=3;i++){
            if(i%2==0)
                g.drawOval(120, i*60, 50, 50);
            else
                g.fillOval(120, i*60, 50, 50);
        }
    }
}
