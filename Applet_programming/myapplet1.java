import java.applet.Applet;
import java.awt.*;
  
//<applet code="myapplet" width="400" height="400"></applet>
  public class myapplet1 extends Applet
{
//create an reference variable 
  Label l1,l2;
  TextField t1,t2;
  Button b1;
  public void init()
  {
    //initialize the reference variable this is init method which is invoked and we are using it to initalize our variables 
    l1=new Label("first_name");
    l2=new Label("last_name");
    t1=new TextField();
    t2=new TextField();
    b1=new Button("Enter");

    //now we created a objects of these component classes 
    //now we have to add these component in the container and applet class have
    //a method add() whic will add the component to the containers 
    //this is a flow layout means the layout is in a sequence as i programmed it
    //to be to change the layout we have to use a method the reason behind that
    //there is by default a flow layout is that when you remove the flow layout 
    //it will not show any of component as there is no layout 
   setLayout(null);
    //now with the help of this function we dont see any of the component in it  
    //now we have to give the layout of the components and with the help of 
    //setbounds method which is in every class of the component like label textfield button is present in it 
    //setBounds(x_coordinate,y_coordinate,width,height) 
   l1.setBounds(20,30,100,80);
   t1.setBounds(250,60,100,20);
   l2.setBounds(20,90,100,80);
   t2.setBounds(250,120,100,20);
   b1.setBounds(125,200,80,20);
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(b1);
   }

}
