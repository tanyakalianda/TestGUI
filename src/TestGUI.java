import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestGUI extends JFrame
{
	//to refer to the frame it self: this._____ but we can leave initial parameter blank (this. is assumed) b/c its the same class
	//in constructor - make array list of bank accounts
	//use action listeners
	//make array list of bankaccounts a field
	//drop down menu for account type
		public TestGUI()
	{
		setTitle("My Test Constructor");
		setBounds(100,100,600,400);
		setLayout(null);
		
		JLabel lbl1 = new JLabel("Label: ");
		lbl1.setBounds(20,20,100,30);
		add(lbl1);
		
		JTextField text = new JTextField("");
		text.setBounds(120,20,100,30);
		add(text);
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args)
	{
		new TestGUI();  //instantiates JFrame
	}
	
}
