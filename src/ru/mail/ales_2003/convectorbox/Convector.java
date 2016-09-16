
package ru.mail.ales_2003.convectorbox;


import java.util.Objects;

/**
 *
 * @author admin
 */
public class Convector implements Comparable <Convector>
{

    public Convector(Integer width, Integer depth, Integer length, Integer price, Integer power) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.price = price;
        this.power = power;
    }

    

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
      // длина
    private Integer length;
    // ширина
    private Integer width;
    // глубина
    private Integer depth;
    // цена
    private Integer price;
    //мощность
    private Integer power;

    @Override
    public String toString() {
        
        return "Convector{" + "length=" + length + ", width=" + width + ", depth=" + depth + ", price=" + price + ", power=" + power + '}';
    }
    
    
    
    
    @Override
    public int compareTo(Convector c) {
        return width.compareTo(c.getWidth());
    }

   /* @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.length);
        hash = 37 * hash + Objects.hashCode(this.width);
        hash = 37 * hash + Objects.hashCode(this.depth);
        hash = 37 * hash + Objects.hashCode(this.price);
        hash = 37 * hash + Objects.hashCode(this.power);
        return hash;
    }

    /* @Override
    public boolean equals(Object obj) {
    if (this == obj) {
    return true;
    }
    if (obj == null) {
    return false;
    }
    if (getClass() != obj.getClass()) {
    return false;
    }
    final Convector other = (Convector) obj;
    if (!Objects.equals(this.length, other.length)) {
    return false;
    }
    if (!Objects.equals(this.width, other.width)) {
    return false;
    }
    if (!Objects.equals(this.depth, other.depth)) {
    return false;
    }
    if (!Objects.equals(this.price, other.price)) {
    return false;
    }
    if (!Objects.equals(this.power, other.power)) {
    return false;
    }
    return true;
    }*/
    
    
    
}
