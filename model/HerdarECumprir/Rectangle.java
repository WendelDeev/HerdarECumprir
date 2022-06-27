
package model.HerdarECumprir;

import modelEnum.HerdarECumprir.Color;


public class Rectangle extends AbstractShape  {
    
    private Double widht;
    private Double height;

    public Rectangle(Double widht, Double height, Color color) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    
    @Override
    public double area() {
        return widht * height;
    }
    
    
}
