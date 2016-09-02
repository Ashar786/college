import java.applet.* ;
import java.awt.* ;
public class Calc extends Applet {
	TextField t1 , t2 ;
	public void init() {
		 t1 = new TextField(" ") ;
		 t2 = new TextField(" ") ;

		add (t1) ;
		add (t2) ;
	}
		
	public void paint(Graphics g) {
		g.drawString("Enter first number :",20,50) ;
		g.drawString("Enter Second number :",20,80) ;
		g.drawString("Sum  :",30,100) ;
		
		int a1 = Integer.parseInt(t1.getText()) ;
		int a2 = Integer.parseInt(t2.getText()) ;
		int sum = (a1 + a2) ; 
		String s ;
		s = String.valueOf(sum) ; 
		g.drawString(s,100,100) ;
	}
}
