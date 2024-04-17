import java.awt.*;
import java.applet.*;
public class Flag extends Applet
{
    public void paint(Graphics g)
    {
        g.drawRect(50,60,200,40);
        g.drawRect(50,100,200,40);
        g.drawRect(50,140,200,40);
        g.drawOval(135,105,30,20);
        g.setColor(Color.orange);
        g.fillRect(50,60,200,40);
        g.setColor(Color.green);
        g.fillRect(50,140,200,40);
        g.setColor(Color.blue);
        g.fillOval(135,105,30,20);
   }
}
/*
<html>
<applet code="Flag.class" width=300 height=300>
</applet>
</html>
*/