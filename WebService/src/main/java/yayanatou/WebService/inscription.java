package yayanatou.WebService;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class inscription extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labelnom;
	private JLabel labelprenom;
	private JLabel labelmail;
	private JLabel labeladresse;
	
	private JTextField fieldnom;
	private JTextField fieldprenom;
	private JTextField fieldmail;
	private JTextField fieldadresse;
	private JButton jButtonenreg;
	//private JButton jButtonAnn;
	private JPanel contentPane;
	

	public inscription()
	{
		super();
		initializeComponent();
		
		this.setVisible(true);
	}

	

	private void initializeComponent()
	{
		
		labelnom = new JLabel();
		labelprenom = new JLabel();
		labelmail = new JLabel();
		labeladresse = new JLabel();
		
		fieldnom = new JTextField();
		fieldprenom = new JTextField();
		fieldmail = new JTextField();
		fieldadresse = new JTextField();
		jButtonenreg = new JButton();
	//	jButtonAnn = new JButton();
		contentPane = (JPanel)this.getContentPane();

		
				
		labelnom.setText(" Nom");
		
		labelprenom.setText(" Prenom");
		labelmail.setText(" Mail");
		labeladresse.setText(" Adresse");
		
		
		jButtonenreg.setText("enregistrer");
		jButtonenreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonenreg_actionPerformed(e);
			}

		});
		

		/*jButtonAnn.setText("Annuler");
		jButtonAnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonAnn_actionPerformed(e);
			}

		});*/
		
		contentPane.setLayout(null);
		
		addComponent(contentPane, labelnom, 10,96,60,19);
		addComponent(contentPane, labelprenom, 10,133,60,18);
		addComponent(contentPane, labelmail, 10,160,60,17);
		addComponent(contentPane, labeladresse, 10,190,60,16);
		
		addComponent(contentPane, fieldnom, 91,91,100,22);
		addComponent(contentPane, fieldprenom, 91,130,100,22);
		addComponent(contentPane, fieldmail, 91,160,100,22);
		addComponent(contentPane, fieldadresse, 91,190,100,22);
		addComponent(contentPane, jButtonenreg, 200,200,100,28);
		//addComponent(contentPane, jButtonAnn, 220,200,100,28);
		

		this.setTitle("Inscription ");
		this.setLocation(new Point(47, 0));
		//this.setSize(new Dimension(390, 300));
		this.setBounds(0,0,400,300);
	}

	
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	


	private void jButtonenreg_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButtonenreg_actionPerformed(ActionEvent e) called.");
		

	}

	@SuppressWarnings("unused")
	private void jButtonAnn_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButtonAnn_actionPerformed(ActionEvent e) called.");
		

	}

	




	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new inscription();
	}


}

