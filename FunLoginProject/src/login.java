import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JDialog {
  private final JPanel obj = new JPanel();
  private JTextField username;
  private JPasswordField password;
 
   public static void main(String[] args) {
    
    	
      login obj1 = new login();
      obj1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      obj1.setVisible(true);
    
  }
 
  public login() {
	  
    setBounds(0, 0, 2000, 1000);
    
    setTitle("BMU USER LOGIN");
    getContentPane().add(obj, BorderLayout.CENTER);
    obj.setLayout(null);
 
    
    { 	
    	
    	 JLabel username = new JLabel("campus username");
         username.setBounds(89, 80,120, 20);
         obj.add(username);
         
         JLabel campus = new JLabel("campus domain");
         campus.setBounds(89, 76, 180, 80);
         obj.add(campus);
         
    	JLabel pass = new JLabel("Password");
        pass.setBounds(89, 130, 63, 40);
        obj.add(pass);

        JLabel submitButton = new JLabel("SUBMITTED BY:");

        submitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submitButton.setBounds(14, 119, 240, 180);
        obj.add(submitButton);
        
        JLabel submitButton1 = new JLabel("SUBMITTED TO:");

        submitButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submitButton1.setBounds(500, 119, 240, 180);
        obj.add(submitButton1);
        
        
        
        JLabel submitButton2 = new JLabel("NISHITHA ");
        submitButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        submitButton2.setBounds(540, 119, 240, 300);
        obj.add(submitButton2);
        
        JLabel pa = new JLabel("1.Akhil");
        pa.setBounds(14, 119, 240, 260);
        obj.add(pa);
        
        JLabel submitButton4 = new JLabel("2.Neeraj");
        submitButton4.setBounds(14, 119, 240, 300);
        obj.add(submitButton4);
        
        JLabel submitButton5 = new JLabel("3.Vilekha");
        submitButton5.setBounds(14, 119, 240, 340);
        obj.add(submitButton5);
        
        JLabel submitButton6 = new JLabel("4.Sai Rakesh");
        submitButton6.setBounds(14, 119, 240, 380);
        obj.add(submitButton6);
        
        JLabel submitButton7 = new JLabel("5.Raghavendra Naga Varma");
        submitButton7.setBounds(14, 119, 240, 420);
        obj.add(submitButton7);
        
        JLabel title = new JLabel("OPERATING SYSTEM PROJECT");
        title.setFont(new Font("Tahoma", Font.PLAIN, 30));
        title.setBounds(150, 119, 440, 480);
        obj.add(title);
        
        JLabel eg = new JLabel("eg:@campus.com");
        		eg.setBounds(370,108, 150, 20);
        		obj.add(eg);
      }
  
    JTextField studentNameTextField = new JTextField();

    studentNameTextField.setBounds(200, 80, 150, 20);
    obj.add(studentNameTextField);
    studentNameTextField.setColumns(10);
    
    JTextField domain = new JTextField();

    domain.setBounds(200,110, 150, 20);
    obj.add(domain);
    domain.setColumns(10); 
    
    password = new JPasswordField();
    password.setBounds(200, 140, 150, 20);
    obj.add(password);
    
    JLabel label = new JLabel("<html>"+"It is used in banking system to check whether loan can be sanctioned to a person or not. Suppose there are n number of account holders in a bank and the total sum of their money is S. If a person applies for a loan then the bank first subtracts the loan amount from the total money that bank has and if the remaining amount is greater than S then only the loan is sanctioned. It is done because if all the account holders comes to withdraw their money then the bank can easily do it.\r\n" + 
    		"\r\n" + 
    		"In other words, the bank would never allocate its money in such a way that it can no longer satisfy the needs of all its customers. The bank would try to be in safe state always." +"</html>");
    
    label.setBounds(10,400,1800,100);
    label.setFont(new Font("Tahoma", Font.PLAIN, 20));
    obj.add(label);
  

    
   
int n=studentNameTextField.getText().length();

  JButton button = new JButton("Login");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
    	  

    	  if(domain.getText().equals("@bmu.edu.in"))
    	  {
        if(studentNameTextField.getText().equals("osproject_2020") && password.getText().equals("BANKERS") ) {
        	 
        	
        	JOptionPane.showMessageDialog(null, "Successfull " +
					" Login successfull.", "Successfu", JOptionPane.PLAIN_MESSAGE);
       
        }else
        {
        	JOptionPane.showMessageDialog(null, "Invalid Username or Password " +
					" Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
        	
            
          return;
        }
    	  }
    	  else
    	  {
    		  JOptionPane.showMessageDialog(null, "Enter campus mail " +
  					" Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
    	  }
      }
    });
    button.setBounds(205, 165, 89, 23);
    obj.add(button);
    
    JLabel loginButton = new JLabel("Banker's Algorithm Login");
    
    loginButton.setFont(new Font("Tahoma", Font.PLAIN, 41));
    loginButton.setBounds(700, 0, 700, 50);
    obj.add(loginButton);
  }
}