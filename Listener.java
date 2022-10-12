import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;
import java.awt.event.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;

class Listener implements ActionListener{

    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==PizzaUI.b1){
            JPanel rightpanel= new JPanel();
            PizzaUI.pizzaselection.getContentPane().add(rightpanel, BorderLayout.EAST);
            rightpanel.setBorder(BorderFactory.createEtchedBorder());
            Color color= new ColorUIResource(Color.lightGray);
            rightpanel.setBackground(color);
            rightpanel.setLayout(new GridLayout(5,4));

            

                JLabel a1= new JLabel("TYPE: Margherita");
                JLabel a2= new JLabel("INGREDIENTS: Tomato Sauce, Mozzerella");
                JLabel a3= new JLabel("Price: 2.8 €");
                JLabel a4= new JLabel("This Pizza is vegetarian");
               
                JButton buy= new JButton("purchase");
                buy.setBorder(BorderFactory.createEtchedBorder());

                rightpanel.add(a1);
                rightpanel.add(a2);
                rightpanel.add(a3);
                rightpanel.add(a4);
                rightpanel.add(buy);
        }
        
    }



}
