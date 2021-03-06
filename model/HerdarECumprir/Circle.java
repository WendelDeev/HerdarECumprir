
package model.HerdarECumprir;

import modelEnum.HerdarECumprir.Color;


public class Circle extends AbstractShape{

    private Double radius;

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
}
