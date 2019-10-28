import java.awt.Color;
import java.awt.Graphics;
public abstract class AbstractShape implements Shape{
    
    protected int x, y, size;
    protected Color c;
    public AbstractShape(int x, int y, int size, Color c){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c;
    }
    /**
     * Draws the object
     */
    public void draw(Graphics g) {
        // draw a square
        g.setColor(c);
        g.drawRect(x, y, size, size);
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getSize(){
        return this.size;
    }

}