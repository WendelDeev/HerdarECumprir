
package aplication.HerdarECumprir;

import model.HerdarECumprir.AbstractShape;
import model.HerdarECumprir.Circle;
import model.HerdarECumprir.Rectangle;
import model.HerdarECumprir.Shape;
import modelEnum.HerdarECumprir.Color;


public class Program {

    
    public static void main(String[] args) {
        
        AbstractShape s1 = new Circle(2.0, Color.BLACK);
        AbstractShape s2 = new Rectangle(3.0, 4.0, Color.WHITE);
        
        System.out.println("Circle color: "+s1.getColor());
        System.out.println("Circle area: "+ String.format("%.3f", s1.area()));
        System.out.println("Circle color: "+s2.getColor());
        System.out.println("Circle area: "+ String.format("%.3f", s2.area()));
        
    }
    
}
