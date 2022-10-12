import java.awt.Image;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.*;

class PizzaUI implements ActionListener{

    //Variables:
    static JFrame pizzaselection;
    static JFrame drinkselection;
    static JFrame dessertselection;
    static JPanel panel_left;

    //buttons from first menu
    static JButton meal;
    static JButton drink;
    static JButton dessert;

    //all the pizzas in pizzaselection frame
    static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    
    //all the drinks in drinkselection frame
    static JButton d1;
    static JButton d2;
    static JButton d3;
    static JButton d4;

    //all the desserts in dessertselection frame
    static JButton dessert1,dessert2;



   public PizzaUI(){

        JFrame menu= new JFrame();
        JPanel menupanel= new JPanel();
        JPanel top_panel=new JPanel();

        top_panel.setBackground(Color.lightGray);
        top_panel.setBorder(BorderFactory.createEtchedBorder());
        top_panel.setLayout(new FlowLayout(1,4,2));

        
        menu.setBounds(250, 100, 800, 800);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setTitle("Gaia's Pizzeria");

        menupanel.setLayout(new GridLayout(3,1));
        menupanel.setBorder(BorderFactory.createEtchedBorder());
        menupanel.setBackground(Color.pink);

        JLabel title= new JLabel("Gaia's Pizzeria");
        title.setFont(new Font("Serif", Font. BOLD, 40)); 
        title.setBorder(BorderFactory.createEtchedBorder());
        title.setAlignmentX(30);
        title.setComponentOrientation(ComponentOrientation.UNKNOWN);

        top_panel.add(title);
        menu.getContentPane().add(top_panel, BorderLayout.NORTH);       
       

   
        ImageIcon pizza= new ImageIcon(new ImageIcon("p0.png").getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING));
        meal= new JButton(null, pizza);
        meal.setBorder(BorderFactory.createEtchedBorder());
        meal.addActionListener(this);

        ImageIcon drinks= new ImageIcon(new ImageIcon("drinks.png").getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING));
        drink= new JButton(null, drinks);
        drink.setBorder(BorderFactory.createEtchedBorder());
        drink.addActionListener(this);

        ImageIcon ice= new ImageIcon(new ImageIcon("dessert.png").getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING));
        dessert= new JButton(null, ice);
        dessert.setBorder(BorderFactory.createEtchedBorder());
        dessert.addActionListener(this);

        menupanel.add(meal);
        menupanel.add(drink);
        menupanel.add(dessert);
           
        menu.add(menupanel);
        menu.setVisible(true);
        }
        
    



    

    public static void main(String[] args) {

        PizzaUI start = new PizzaUI();
    }





    /* p0: margherita
     * p1:pepperoni
     * p2: bbq chicken
     * p3: veggie pizza
     * p4:hawaiian 
     * p5: 4 cheese
     * p6: Olive pizza
     * p7:Anchovy
     * p8: mushroom and ham
    */

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource()==meal){
            
            pizzaselection= new JFrame();
            pizzaselection.setBounds(30, 30, 900, 900);
            panel_left= new JPanel();
            panel_left.setLayout(new GridLayout(10,1));
            panel_left.setBorder(BorderFactory.createEtchedBorder());
            Color color= new ColorUIResource(125, 219, 180);
            panel_left.setBackground(color);

          
            ImageIcon p1= new ImageIcon(new ImageIcon("p" +0+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b1= new JButton(null, p1);
            ActionListener listener= new Listener();
            b1.addActionListener(listener);
            panel_left.add(b1);

            ImageIcon p2= new ImageIcon(new ImageIcon("p" + 1+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b2= new JButton(null, p2);
            b2.addActionListener(listener);
            panel_left.add(b2);

            ImageIcon p3= new ImageIcon(new ImageIcon("p" +2+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b3= new JButton(null, p3);
            b3.addActionListener(listener);
            panel_left.add(b3);

            ImageIcon p4= new ImageIcon(new ImageIcon("p" +3+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b4= new JButton(null, p4);
            b4.addActionListener(listener);
            panel_left.add(b4);

            ImageIcon p5= new ImageIcon(new ImageIcon("p" +4+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b5= new JButton(null, p5);
            b5.addActionListener(listener);
            panel_left.add(b5);

            ImageIcon p6= new ImageIcon(new ImageIcon("p" +5+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b6= new JButton(null, p6);
            b6.addActionListener(listener);
            panel_left.add(b1);

            ImageIcon p7= new ImageIcon(new ImageIcon("p" +6+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b7= new JButton(null, p7);
            b7.addActionListener(listener);
            panel_left.add(b7);

            ImageIcon p8= new ImageIcon(new ImageIcon("p" +7+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b8= new JButton(null, p8);
            b8.addActionListener(listener);
            panel_left.add(b8);

            ImageIcon p9= new ImageIcon(new ImageIcon("p" +8+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b9= new JButton(null, p9);
            b9.addActionListener(listener);
            panel_left.add(b9);

            ImageIcon p10= new ImageIcon(new ImageIcon("p" +9+".png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            b10= new JButton(null, p10);
            b10.addActionListener(listener);
            panel_left.add(b10);



                 

          
            panel_left.add(b1);
            panel_left.add(b2);
            panel_left.add(b3);
            panel_left.add(b4);
            panel_left.add(b5);
            panel_left.add(b6);
            panel_left.add(b7);
            panel_left.add(b8);
            panel_left.add(b9);
            panel_left.add(b10);
            
            pizzaselection.getContentPane().add(panel_left, BorderLayout.WEST);   
            pizzaselection.setVisible(true);


        }

        if(e.getSource()==drink){

            drinkselection= new JFrame();
            drinkselection.setBounds(30, 30, 900, 900);
            panel_left= new JPanel();
            panel_left.setLayout(new GridLayout(4,1));
            panel_left.setBorder(BorderFactory.createEtchedBorder());
            Color color= new ColorUIResource(125, 219, 180);
            panel_left.setBackground(color);

            ImageIcon drink1= new ImageIcon(new ImageIcon("drink1.png").getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH));
            d1= new JButton(null, drink1);
            ActionListener listener=new Listener();
            d1.addActionListener(listener);
            panel_left.add(d1);

            ImageIcon drink2= new ImageIcon(new ImageIcon("drink2.png").getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH));
            d2= new JButton(null, drink2);
            
            d2.addActionListener(listener);
            panel_left.add(d2);

            ImageIcon drink3= new ImageIcon(new ImageIcon("drink3.png").getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH));
            d3= new JButton(null, drink3);
            d3.addActionListener(listener);
            panel_left.add(d3);


            ImageIcon drink4= new ImageIcon(new ImageIcon("drink4.png").getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH));
            d4= new JButton(null, drink4);
            d4.addActionListener(listener);
            panel_left.add(d4);

            drinkselection.getContentPane().add(panel_left, BorderLayout.WEST);
            drinkselection.setVisible(true);
        }


        if(e.getSource()==dessert){
System.out.println("AHAHHA");
            dessertselection= new JFrame();
            dessertselection.setBounds(30, 30, 900, 900);
            panel_left= new JPanel();
            panel_left.setLayout(new GridLayout(2,1));
            panel_left.setBorder(BorderFactory.createEtchedBorder());
            Color color= new ColorUIResource(125, 219, 180);
            panel_left.setBackground(color);

            ImageIcon des1= new ImageIcon(new ImageIcon("dessert.png").getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH));
            dessert1= new JButton(null, des1);
            ActionListener listener=new Listener();
            dessert1.addActionListener(listener);
            panel_left.add(dessert1);

            ImageIcon des2= new ImageIcon(new ImageIcon("dessert2.png").getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH));
            dessert2= new JButton(null, des2);
            dessert2.addActionListener(listener);
            panel_left.add(dessert2);


            dessertselection.getContentPane().add(panel_left, BorderLayout.WEST);
            dessertselection.setVisible(true);



        }
        
    }
    





}