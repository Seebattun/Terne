import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class HomePage extends JFrame {
    private JPanel panel;
	private JLabel item1, item2;
	private JButton custom;
	private ImageIcon image;
	private ImageIcon image4;
	
	public HomePage(){
	
		
		
		super("Welcome To University Of Sharpy");
		//setLayout(new FlowLayout());
		
		//JPanel 1
		 JPanel Panel1 = new JPanel();
		 Panel1.setSize(900, 1800);
	        item1 =new JLabel("University Of Sharpy");
			item1.setToolTipText("WELCOME TO THE UNIVERSITY OF SHARPY.....BLABLABLA");;
			Panel1.add(item1);
			
			 
			image = new ImageIcon(getClass().getResource("HomePage.jpg"));
			item2= new JLabel(image);
			Image image2 = image.getImage(); // transform it 
			Image newimg = image2.getScaledInstance(900, 700,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			image = new ImageIcon(newimg);  // transform it back
			item2= new JLabel(image);

			Panel1.add(item2);
			
			
			
			
		//JPanel 2	
		JPanel Panel2= new JPanel();
		Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.Y_AXIS));
		Panel2.setSize(900, 900);
        //adding button with image
		Icon b = new ImageIcon(getClass().getResource("map.png"));	
		custom =new JButton("Login",b);
		Panel2.add(custom);
		
		HandlerClass handler=new HandlerClass();
		custom.addActionListener(handler);
        //Adding image mission, vision
		image4 = new ImageIcon(getClass().getResource("vison.jpg"));
		item2= new JLabel(image4);
		Image image3 = image4.getImage(); // transform it 
		Image newimg2 = image3.getScaledInstance(450, 553,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		image = new ImageIcon(newimg2);  // transform it back
		item2= new JLabel(image);

		Panel2.add(item2);
      
		
		
		
		
        JSplitPane splitPane = new JSplitPane();
        splitPane.setSize(600, 780);
        splitPane.setDividerSize(0);
        splitPane.setDividerLocation(900);
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(Panel1);
        splitPane.setRightComponent(Panel2);
        
        this.add(splitPane);
        
        
        
	}
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			mrLoginPopUp  register=new mrLoginPopUp ();
		register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 register.setSize(1800,1800);
		register.setVisible(true);
	    Close();
		}
	
	}
  //Closing HomePage window
	public void Close(){
        super.dispose();//setVisible(false);
}


	 
}
