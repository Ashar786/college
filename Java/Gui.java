import java.awt.*;
import java.applet.*;


	
public class Gui extends Applet 
{
	public void paint (Graphics a)
	{
		
		a.drawOval(60,60,200,210) ; 
		a.drawOval(90,120,30,40) ;
		a.drawOval(190,120,30,40) ;
		a.fillOval(95,125,20,20);
		a.fillOval(195,125,20,20);
		a.drawLine(155,150,155,185) ;
		a.drawArc(110,130,95,95,0,-180) ;
		a.drawArc(110,130,95,115,0,-180);
		setBackground (Color.cyan);

	}
}
