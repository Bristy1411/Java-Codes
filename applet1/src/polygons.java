

import java.applet.Applet;
import java.awt.*;

public class polygons extends Applet {

    public void paint(Graphics g) {
    setBackground(Color.cyan);
    int x[]={10,170,80,10};
    int y[]={20,40,140,20};
    int n=x.length;
    g.drawPolygon(x,y,n);
   
    }
       
}
