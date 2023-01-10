import java.awt.*;
import javax.swing.*;
class stureg extends JFrame{
	JLabel maintxt,jname,jage,jcourse,jgender,jdob,jmail,jmobile,jpass,jrepass;
	JTextField tname,tage,tcourse,tdob,tmail,tmob,tpass,trepass;
	JRadioButton gmale,gfemale;
	ButtonGroup gGrp;
	JButton submit;
	Container c;
	stureg{
		maintxt=new JLabel("Amity Student Registration Form");
		maintxt.setFont(new Font("Calibri",Fon.BOLD,25));
		jname=new JLabel("Name: ");
		tname-new JTextField();
		jage=new JLabel("Age: ");
		tage=new JTextField();
		jcourse=new JLabel("Course: ");
		tcourse=new JTextField();
		jgender=new JLabel("Gender: ");
		gmale=new JRadioButton("Male",true);
		gfemale=new JRadioButton("Female");
		gGrp=new ButtonGroup();
		gGrp.add(gmale);
		gGrp.add(gfemale);
		jdob=new JLabel("Date of Birth: ");
		tdob=new JTextField();
		jmail=new JLabel("Email: ");
		jmob=new JLabel("Mobile: ");
		tmail=new JTextField();
		tmob=new JTextField();
		jpass=new JLabel("Password: ");
		jrepass=new JLabel("Re-Enter Password: ");
		tpass=new JTextField();
		trepass=new JTextField();
		submit=new JButton("Submit");
		c=getContentPane();
		c.setLayout(null);
		setBonds();
		addComponents();
	}
	public void setBonds(){
		
	}
	public void addComponents(){
	}
	public static void main(String[] args){
		RegisterFrame f=new RegisterFrame();
		f.setTitle("Student Register Form");
		f.setVisible(true);
		f.setBounds(500,100,500,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(true);
	}
}