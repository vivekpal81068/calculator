import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class MyFrame extends JFrame  {

    // private JTextField t1,t2;
    // public Container c;
    JButton Add ,sub,mul ,Div;
    JLabel label1,label2,Result;
    JTextField t1,t2;

    MyFrame(){
        try{
        JFrame frame=new JFrame("Sample Calculator");       
        frame.setBounds(250, 50, 400, 300);

      JLabel label1=new JLabel("First Number:");
      label1.setBounds(50, 30, 100, 30);
      frame.add(label1);

      JLabel label2=new JLabel("Secound Number:");
      label2.setBounds(50, 80, 150, 30);
      frame.add(label2);

        JTextField t1=new JTextField();
        t1.setBounds(190, 30, 100, 30);
        frame.add(t1);
        JTextField t2=new JTextField();
        t2.setBounds(190, 80, 100, 30);
        frame.add(t2);

        JButton Add=new JButton("+");
        Add.setBounds(40, 130, 60, 30);
        frame.add(Add);
        JButton sub=new JButton("-");
        sub.setBounds(120, 130, 60, 30);
        frame.add(sub);
        JButton mul=new JButton("X");
        mul.setBounds(230, 130, 60, 30);
        frame.add(mul);
        JButton Div=new JButton("/");
        Div.setBounds(300, 130, 60, 30);
        frame.add(Div);
        JLabel Result=new JLabel("Result:");
        Result.setBounds(50, 160, 280, 30);
        frame.add(Result);

        

        
        Add.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==Add){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a+b;
                    Result.setText("Result: "+c);
        
                }             
               }

        });
        sub.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==sub){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a-b;
                    Result.setText("Result: "+c);
        
                }
               }

        });
        mul.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==mul){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a*b;
                    Result.setText("Result: "+c);
        
                }
               }

        });
        Div.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==Div){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a/b;
                    Result.setText("Result: "+c);
                }
               }

        });
    
    
     

        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    } 
    catch(NumberFormatException e1){
    Result.setText("Please Input integers Only");
    }
        catch(ArithmeticException e2){
         Result.setText("can not divide by zero");
        }
        // catch(Exception e3){
        //     Result.setText(""+e3);
        // }
    }
      
}
public class simplecalculator{
    public static void main(String[] args) {
        new MyFrame();

    }
}
