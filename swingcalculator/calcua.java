import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calcua {
    private char opt = ' '; // Save the operator
    private boolean go = true; // For calculate with Opt != (=)
    private boolean addWrite = true; // Connect numbers in display
    private double val = 0; // Save the value typed for calculation
    public void calcu(){
        JFrame frame=new JFrame("Calculator");
        frame.setBounds(200, 100, 350, 550);

       JTextField inText= getTextField(frame,"",10, 10, 300, 80);
       inText.setBounds(10, 10, 300, 80);
       inText.setEditable(false);
       inText.setBackground(Color.white);
    //    inText.setText("");
       inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));

       JButton palas=getbtn(frame, "+/-", 10, 450, 70, 50);
       JButton zero=getbtn(frame, "0", 90, 450, 70, 50);
       JButton dot=getbtn(frame, ".", 170, 450, 70, 50);
       JButton equal=getbtn(frame, "=", 250, 450, 70, 50);
       JButton one=getbtn(frame, "1", 10, 390, 70, 50);
       JButton two=getbtn(frame, "2", 90, 390, 70, 50);
       JButton three=getbtn(frame, "3", 170, 390, 70, 50);
       JButton addi=getbtn(frame, "+", 250, 390, 70, 50);
       JButton four=getbtn(frame, "4", 10, 330, 70, 50);
       JButton five=getbtn(frame, "5", 90, 330, 70, 50);
       JButton six=getbtn(frame, "6", 170, 330, 70, 50);
       JButton sub=getbtn(frame, "-", 250, 330, 70, 50);
       JButton seven=getbtn(frame, "7", 10, 270, 70, 50);
       JButton eiat=getbtn(frame, "8", 90, 270, 70, 50);
       JButton nine=getbtn(frame, "9", 170, 270, 70, 50);
       JButton malti=getbtn(frame, "X", 250, 270, 70, 50);
       JButton lable1=getbtn(frame, "1/x", 10, 210, 70, 50);
       JButton lable2=getbtn(frame, "x2", 90, 210, 70, 50);
       JButton lable3=getbtn(frame, "x", 170, 210, 70, 50);
       JButton devi=getbtn(frame, "/", 250, 210, 70, 50);
       JButton persent=getbtn(frame, "%", 10, 150, 70, 50);
       JButton CE=getbtn(frame, "CE", 90, 150, 70, 50);
       JButton C=getbtn(frame, "C", 170, 150, 70, 50);
       JButton back=getbtn(frame, "<--", 250, 150, 70, 50);

       palas.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      zero.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      zero.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("0");
                } else {
                    inText.setText(inText.getText() + "0");
                }
            } else {
                inText.setText("0");
                addWrite = true;
            }
            go = true;
          
        }

      });
      dot.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
      equal.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      equal.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
            if (go) {
                val = calc(val, inText.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    inText.setText(String.valueOf((int) val));
                } else {
                    inText.setText(String.valueOf(val));
                }
                opt = '=';
                addWrite = false;
            }
          
        }

      });
      one.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      one.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            if (Pattern.matches("[0]*", inText.getText())) {
                inText.setText("1");
            } else {
                inText.setText(inText.getText() + "1");
            }
           
                // inText.setText("0");
                
          
        }

      });
      two.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      two.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("2");
                } else {
                    inText.setText(inText.getText() + "2");
                }
            } else {
                inText.setText("2");
                addWrite = true;
            }
            go = true;
        }

      });
      three.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      four.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      five.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      six.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      seven.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      eiat.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      nine.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      addi.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      addi.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            inText.setText("+");
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
            if (go) {
                val = calc(val, inText.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    inText.setText(String.valueOf((int) val));
                } else {
                    inText.setText(String.valueOf(val));
                }
                opt = '+';
                go = false;
                addWrite = false;
            } else {
                opt = '+';
            }
          
        }

      });
      sub.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      malti.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      devi.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      persent.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      C.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));     
      CE.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      back.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));


       
       

        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new calcua().calcu();
    }
 // Show Lable
    public void getLabel(JFrame frame, String title,int x, int y, int width, int height) {
    JLabel label = new JLabel(title);
    label.setBounds(x, y, width, height);
    frame.add(label);
    }  
   
    
      // Show text Field
      public static JTextField getTextField(JFrame frame, String title,int x, int y, int width, int height) {
        JTextField field = new JTextField();  
        field.setBounds(x, y, width, height);
        frame.add(field);

        return field;
    }
     // Show button
     public static JButton getbtn(JFrame frame, String title,int x, int y, int width, int height) {
    JButton btn = new JButton(title);
    btn.setBounds(x, y, width, height);
    frame.add(btn);
    return btn;
    }
    
    public double calc(double x, String input, char opt) {
        // inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        double y = Double.parseDouble(input);
        switch (opt) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            case '%':
                return x % y;
            case '^':
                return Math.pow(x, y);
            default:
                // inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
                return y;
        }
    }

}
