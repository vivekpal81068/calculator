import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calculator {

    public void cal(){
        JFrame frame=new JFrame("Calculator");
        frame.setBounds(200, 100, 350, 550);

       JTextField inText = new JTextField("0");
        inText.setBounds(10, 10, 300, 80);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        frame.add(inText);

        JButton palas= new JButton("+/-");
        palas.setBounds(10, 450, 70, 50);
        frame.add(palas);
       

        JButton zero= new JButton("0");
        zero.setBounds(90, 450, 70, 50);
        frame.add(zero);
        JButton dot= new JButton(".");
        dot.setBounds(170, 450, 70, 50);
        frame.add(dot);
        JButton equal= new JButton("=");
        equal.setBounds(250, 450, 70, 50);
        frame.add(equal);

        JButton one= new JButton("1");
        one.setBounds(10, 390, 70, 50);
        frame.add(one);
        JButton two= new JButton("2");
        two.setBounds(90, 390, 70, 50);
        frame.add(two);
        JButton three= new JButton("3");
        three.setBounds(170, 390, 70, 50);
        frame.add(three);
        JButton addi= new JButton("+");
        addi.setBounds(250, 390, 70, 50);
        frame.add(addi);

        JButton four= new JButton("4");
        four.setBounds(10, 330, 70, 50);
        frame.add(four);
        JButton five= new JButton("5");
        five.setBounds(90, 330, 70, 50);
        frame.add(five);
        JButton six= new JButton("6");
        six.setBounds(170, 330, 70, 50);
        frame.add(six);
        JButton sub= new JButton("-");
        sub.setBounds(250, 330, 70, 50);
        frame.add(sub);

        JButton seven= new JButton("7");
         seven.setBounds(10, 270, 70, 50);
        frame.add(seven);
        JButton aet= new JButton("8");
        aet.setBounds(90, 270, 70, 50);
        frame.add(aet);
        JButton nine= new JButton("9");
        nine.setBounds(170, 270, 70, 50);
        frame.add(nine);
        JButton malti= new JButton("X");
        malti.setBounds(250, 270, 70, 50);
        frame.add(malti);

        JButton lable1= new JButton("1/x");
         lable1.setBounds(10, 210, 70, 50);
        frame.add(lable1);
        JButton lable2= new JButton("x2");
        lable2.setBounds(90, 210, 70, 50);
        frame.add(lable2);
        JButton lable3= new JButton("x");
        lable3.setBounds(170, 210, 70, 50);
        frame.add(lable3);
        JButton devi= new JButton("/");
        devi.setBounds(250, 210, 70, 50);
        frame.add(devi);

        JButton perce= new JButton("%");
        perce.setBounds(10, 150, 70, 50);
       frame.add(perce);
       JButton CE= new JButton("CE");
       CE.setBounds(90, 150, 70, 50);
       frame.add(CE);
       JButton C= new JButton("C");
       C.setBounds(170, 150, 70, 50);
       frame.add(C);
       JButton lable4= new JButton("<--");
       lable4.setBounds(250, 150, 70, 50);
       frame.add(lable4);
        
    //    JButton MC= new JButton("MC");
    //    MC.setBounds(10, 110, 40, 30);
    //   frame.add(MC);
    //   JButton MR= new JButton("MR");
    //   MR.setBounds(65, 110, 40, 30);
    //   frame.add(MR);
    //   JButton Madd= new JButton("M+");
    //   Madd.setBounds(120, 110, 40, 30);
    //   frame.add(Madd);
    //   JButton msub= new JButton("M-");
    //   msub.setBounds(170, 110, 40, 30);
    //   frame.add(msub);
    //   JButton mro= new JButton("MR");
    //   mro.setBounds(225,110, 40, 30);
    //   frame.add(mro);
    //   JButton mis= new JButton("M_");
    //   mis.setBounds(280, 110, 40, 30);
    //   frame.add(mis);
    // MC.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
    // MR.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
    // Madd.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
    // msub.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
    // mro.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
    // mis.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

      palas.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      zero.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      dot.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
      equal.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      one.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      two.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      three.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      four.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      five.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      six.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      seven.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      aet.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      nine.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      addi.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      sub.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      malti.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      devi.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      perce.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      C.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));     
      CE.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lable4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
     
        frame.setLayout(null);
        frame.setVisible(true);
    }
   
    public static void main(String[] args) {
        new calculator().cal();
    }
}
