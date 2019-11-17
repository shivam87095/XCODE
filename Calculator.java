import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

//MyCalculator class inherits JFrame class and it also implements the interface ActionListener
class RunCalculator extends JFrame implements ActionListener
{
    double c, n;
    double q;
    String s1,s2,s3,s4,s5;

     // create a frame 
    static JFrame f; 

    // create number buttons and some operators 
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;

    // create a panel 
    JPanel p;

    //create a textfield
    static JTextField tf; 

    // default constrcutor 
    RunCalculator()
    {   
        // create a frame 
        f = new JFrame("My calculator");

        // create a textfield of 16 bit size
        tf = new JTextField(16);

        // set the textfield to non editable it can't be edited
        tf.setEditable(false); 

        // create number buttons and some operators 
        b1 = new JButton("0");
        b2 = new JButton("1");
        b3 = new JButton("2");
        b4 = new JButton("3");
        b5 = new JButton("4");
        b6 = new JButton("5");  
        b7 = new JButton("6");  
        b8 = new JButton("7");  
        b9 = new JButton("8");     
        b10 = new JButton("9");  
        b11 = new JButton("+");  
        b12 = new JButton("-");   
        b13 = new JButton("*");   
        b14 = new JButton("/");   
        b15 = new JButton("%");   
        b16 = new JButton("=");   
        b17 = new JButton("C");
        b18 = new JButton("sqrt");      
        b19 = new JButton("X^2"); 
        b20 = new JButton("1/X");  
        b21 = new JButton("."); 
        b22 = new JButton("X^3");  
        b23 = new JButton("cbrt");
        
        // create a panel 
        p = new JPanel();

        // add action listeners 
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
    
    
        // add elements to panel that we created
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
        p.add(b21);
        p.add(b22);
        p.add(b23);
        
        //exit the programme on closing the calculator
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel to frame 
        f.add(p);
        
        // set Background of panel 
        p.setBackground(Color.white); 

        // setting the size 
        f.setSize(200,290);

        //making the frame visible
        f.setVisible(true);


    }

     
     //implementing the action performed method of the interface Actionlistener
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==b1)
        {
            s3 = tf.getText(); // get the value of string
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);   // set the value of string 
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string 
        }
        if(e.getSource()==b3)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string  
        }if(e.getSource()==b4)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string
        }
        if(e.getSource()==b5)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string 
        }
        if(e.getSource()==b6)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string 
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string 
        }
        if(e.getSource()==b9)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string 
        }
        if(e.getSource()==b10)
        {
            s3 = tf.getText();  // get the value of string
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);  // set the value of string 
        }
        if(e.getSource()==b11)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=1;
 
        }
        if(e.getSource()==b12)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=2;
 
        }
        if(e.getSource()==b13)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=3;
 
        }
        if(e.getSource()==b14)
        {
            s1 = tf.getText();// get the value of string
            tf.setText("");  // set the value of string 
            c=4;
 
        }
        if(e.getSource()==b15)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=5;
 
        }

        if(e.getSource()==b18)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=6;
 
        }

        if(e.getSource()==b19)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=7;
 
        }

        if(e.getSource()==b20)
        {
            s1 = tf.getText(); // get the value of string
            tf.setText("");   // set the value of string
            c=8;
 
        }

        if(e.getSource()==b21)
        {  
            
            tf.setText(tf.getText()+"." );  // set the value of string

        }

        if(e.getSource()==b22)
        {
            s1 = tf.getText();  // get the value of string
            tf.setText("");   // set the value of string
            c=9;
 
        }

        if(e.getSource()==b23)
        {
            s1 = tf.getText();  // get the value of string
            tf.setText("");   // set the value of string
            c=10;
 
        }

        if(e.getSource()==b16)
        {
            s2 = tf.getText();  // getting the value of the 
            if(c==1)
            {   
                     
                       n = Double.parseDouble(s1)+Double.parseDouble(s2); //converting string to  double and performing operation
                       tf.setText(String.valueOf(n));    // set the value of string
            }         
            if(c==2)
            {
                n =  Double.parseDouble(s1)- Double.parseDouble(s2); //converting string to  double and performing operation
                tf.setText(String.valueOf(n));    // set the value of string 
            }
            if(c==3)
            {
                n =  Double.parseDouble(s1)* Double.parseDouble(s2); //converting string to  double and performing operation
                tf.setText(String.valueOf(n));    // set the value of string
            }
            if(c==4)
            {   
                //using exception handling to handle the exception if generated	
                try
                {   
                    //converting the string type value to double type
                    double p= Double.parseDouble(s2);
                    if(p!=0)
                    {
                     n =  Double.parseDouble(s1)/ Double.parseDouble(s2);  //converting string to  double and performing operation
                    tf.setText(String.valueOf(n));    // set the value of string
                     }
                     else
                        tf.setText("notDefined");     // set the value of string
 
                }
                catch(Exception i){}
            }
            if(c==5)
            {
                n =  Double.parseDouble(s1)% Double.parseDouble(s2); //converting string to  double and performing operation
                tf.setText(String.valueOf(n));   // set the value of string
            }
            if(c==6)
            {
            
                q=Math.sqrt(Double.parseDouble(s1));  //converting string to  double and performing operation
                tf.setText(String.valueOf(q));   // set the value of string
                   
            
            }

            if(c==7)
            {
            
            
                q=Math.pow(Double.parseDouble(s1), 2);   //converting string to  double and performing operation
                tf.setText(String.valueOf(q));   // set the value of string

    
            
            }

            if(c==8)
            {   
                //using exception handling to handle the exception if generated	
                try  
                {   
                    //converting the string type value to double type
                    double p=Double.parseDouble(s1);
                    if(p!=0)
                    {
                       n =  1/ p;
                    tf.setText(String.valueOf(n));   // set the value of string
                     }
                     else
                        tf.setText("notDefined");    // set the value of string
                    
                } catch(ArithmeticException i){}
              
            }

            if(c==9)
            {
               
                q= Math.pow(Double.parseDouble(s1), 3);  //converting string to  double and performing operation
                tf.setText(String.valueOf(q));     // set the value of string
            }
            
            if(c==10)
            {
                  q=(Math.cbrt(Double.parseDouble(s1)));  //converting string to  double and performing operation
                  tf.setText(String.valueOf(q));   // set the value of string
            }

        
        }

        if(e.getSource()==b17)
        {
            tf.setText("");     // set the value of string
        }
    
    
    }

}

//using the concept of Multithreading 
class ThreadedCalculator extends Thread
{
    public void run()
    {   
        //using exception handling to handle the exception if generated	
        try
        {   
            System.out.println("Calculator is running....");
            RunCalculator v = new RunCalculator();
        }catch(Exception e)
        {
            System.out.println("An Error Occured !");
        }
    }
}


public class Calculator
{
    public static void main(String args[])
    {   
        // create the object of class
        ThreadedCalculator Calc = new ThreadedCalculator();
        Calc.start();
    }
}