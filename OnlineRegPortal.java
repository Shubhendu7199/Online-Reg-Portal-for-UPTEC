import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
class Project1
{
public static void main(String args[])
{
	JFrame f = new JFrame(&quot;SRM&quot;);
	f.setLocationRelativeTo(null);
	f.setLayout(new BorderLayout());
	f.setContentPane(new JLabel(new ImageIcon(&quot;C:\\Users\\Shubhendu Upadhyay\\Desktop\\59.jpg&quot;)));
	f.setLayout(new FlowLayout());
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);

	f.setUndecorated(true);
	f.setLayout(null);
	f.setVisible(true);
	JButton b1=new JButton(new ImageIcon(&quot;C:\\Users\\Shubhendu Upadhyay\\Desktop\\icon.png&quot;));
	f.add(b1);
	b1.setBounds(660,625,50,50);
	JLabel l1=new JLabel(&quot;Welcome to SRM University&quot;);
	f.add(l1);
	l1.setBounds(475,40,500,90);
	l1.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,40));
	l1.setForeground(Color.red);
	b1.addActionListener((ActionEvent ae) -&gt; {

	f.dispose();
	SecondFrame secondFrame = new SecondFrame();
});
}

}

class SecondFrame
{
	private JFrame f = new JFrame(&quot;SRM&quot;);
	public SecondFrame()
	{
		f.getContentPane().setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);

		f.setUndecorated(true);

		JLabel l2=new JLabel(&quot;SRM University&quot;);
		f.add(l2);
		l2.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,70));
		l2.setForeground(Color.red);
		l2.setBounds(475,40,500,140);
		f.setLayout(null);
		f.setVisible(true);
		JLabel l3=new JLabel(&quot;&lt;html&gt;The SRM University (Sri Ramaswami Memorial University), formerly SRM Institute of
		Science and Technology, is a deemed university in the state of Tamil Nadu, India.The university is approved by the University Grants
		Commission and is accredited by the National Assessment and Accreditation Council (NAAC).&lt;html&gt;&quot;);

		f.add(l3);
		l3.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,20));
		l3.setForeground(Color.red);
		l3.setBounds(250,300,1000,80);
		JButton b2= new JButton(&quot;Proceed&quot;);
		b2.setBackground(Color.gray);
		f.add(b2);
		b2.setBounds(1200,595,120,25);
		b2.addActionListener((ActionEvent e) -&gt; {

		f.dispose();
		ThirdFrame ThirdFrame;
		ThirdFrame = new ThirdFrame();
});
}
}

class ThirdFrame
{
	private final JFrame f = new JFrame(&quot;SRM&quot;);
	public ThirdFrame()
	{
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);

		f.setUndecorated(true);
		f.setLocationRelativeTo(null);
		f.setLayout(new BorderLayout());
		f.setContentPane(new JLabel(new ImageIcon(&quot;C:\\Users\\Shubhendu Upadhyay\\Desktop\\Srmseal.png&quot;)));
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
		JLabel l1=new JLabel(&quot;Name:&quot;,JLabel.LEFT);
		JLabel l2=new JLabel(&quot;age:&quot;,JLabel.LEFT);
		JLabel l3=new JLabel(&quot;Sex(M/F):&quot;,JLabel.LEFT);
		JLabel l4=new JLabel(&quot;Address:&quot;,JLabel.LEFT);
		JLabel l5=new JLabel(&quot;Course:&quot;,JLabel.LEFT);
		JLabel l6=new JLabel(&quot;Semester:&quot;,JLabel.LEFT);
		JTextField t1= new JTextField();
		f.add(t1);
		t1.setBounds(495,190,250,26);
		JRadioButton n=new JRadioButton();

		JRadioButton r1=new JRadioButton(&quot;A) Male&quot;);
		JRadioButton r2=new JRadioButton(&quot;B) Female&quot;);

		n.add(r1);
		n.add(r2);

		r1.setBounds(495,330,100,30);
		r2.setBounds(650,330,100,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		Choice c = new Choice();
		Choice c1 = new Choice();
		Choice c2 = new Choice();

		c.setBounds(495,265,90,20);
		c1.setBounds(495,530,90,20);
		c2.setBounds(495,600,90,20);
		f.add(c);
		f.add(c1);
		f.add(c2);
		c.add(&quot;17&quot;);
		c.add(&quot;18&quot;);
		c.add(&quot;19&quot;);
		c.add(&quot;20&quot;);
		c.add(&quot;21&quot;);
		c1.add(&quot;BTech IT&quot;);
		c1.add(&quot;BTech CSE&quot;);
		c1.add(&quot;BTech SWE&quot;);
		c1.add(&quot;Medical&quot;);
		c1.add(&quot;Others&quot;);
		c2.add(&quot;1&quot;);
		c2.add(&quot;2&quot;);
		c2.add(&quot;3&quot;);
		c2.add(&quot;4&quot;);
		c2.add(&quot;5&quot;);
		c2.add(&quot;6&quot;);
		JTextArea a =new JTextArea();
		a.setBounds(495,400,250,100);
		f.add(a);
		f.add(r1);
		f.add(r2);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		l1.setBounds(350,150,250,100);
		l1.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,30));
		l2.setBounds(350,220,250,100);
		l2.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,30));
		l3.setBounds(350,290,250,100);
		l3.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,30));
		l4.setBounds(350,360,250,100);

		l4.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,30));
		l5.setBounds(350,490,250,100);
		l5.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,30));
		l6.setBounds(350,560,250,100);
		l6.setFont(new Font(&quot;Serif&quot;, Font.PLAIN,30));
		JButton b1=new JButton(&quot;SAVE&quot;);
		f.add(b1);
		b1.setBounds(800,650,120,25);
		JButton b2=new JButton(&quot;Exit&quot;);
		f.add(b2);
		b2.setBounds(975,650,120,25);
		b2.addActionListener((ActionEvent se) -&gt;{
		System.exit(0);
});
		b1.addActionListener((ActionEvent e) -&gt; {

BufferedWriter writer;
try
{
	writer = new BufferedWriter(new FileWriter(&quot;Student.txt&quot;,true));
	writer.write(t1.getText() + &quot;\t&quot; + a.getText() + &quot;\t&quot; + c.getSelectedItem()+&quot;\t&quot;
	+c1.getSelectedItem()+&quot;\t&quot;+c2.getSelectedItem());
if(r1.isSelected())
{
	writer.write(r1.getText());
}
else
	writer.write(r2.getText());
	writer.newLine();
	writer.close();
}
catch(FileNotFoundException ex)
{
}
catch (IOException ex)
{
}
});

f.setLayout(null);
}