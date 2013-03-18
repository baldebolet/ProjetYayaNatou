package yayanatou.WebService;

import javax.swing.SwingUtilities;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!");
        SwingUtilities.invokeLater(new Runnable()
		{
       public void run(){
			
			inscription window = new inscription();
			window.setVisible(true);
			System.out.println( "jjjjjj");
       }});
    }
}
