import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("The Skywalker Family");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");

		theButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("click");
			}
		});
		JButton theButton1 = new JButton("Don't Click!");

		theButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("what have you done!");
			}
		});
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.add(theButton);
		container.add(theButton1);
		JPanel other = new JPanel();
		other.setLayout(new BoxLayout(other, BoxLayout.X_AXIS));
		other.add(new JButton("A"));
		other.add(new JButton("B"));
		other.add(new JButton("C"));
		this.add(container);
		this.add(other);
		this.pack();
		this.setVisible(true);		
	}
	
	
	public static void main(String[] args) {
    new MyGUI(); //create the frame
  }
}
