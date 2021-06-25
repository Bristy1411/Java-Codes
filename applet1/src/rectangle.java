
import java.applet.Applet;
import java.awt.*;

public class rectangle extends Applet {

    
    public void paint(Graphics g) {
      setBackground(Color.green);
      g.drawRect(10, 60, 40, 30);
      g.fillRect(15, 65, 30, 20);
      g.drawRoundRect(10, 100, 80, 50, 10, 10);
      g.fillRoundRect(20, 110, 60, 30, 5, 5);
      
    }
}
