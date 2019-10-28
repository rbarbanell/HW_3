import java.awt.Color;
import java.awt.Graphics;

import sun.java2d.loops.DrawRect;

public class FibonacciSquare extends AbstractShape {
	//Instance Vars
	protected int quadrant, n;
	protected Color c;

	/**
	 * 
	 * @param x X coordinate (int)
	 * @param y Y coordinate (int)
	 * @param quadrant Quardrant (1-4)
	 * @param n Fibonacci number > 0 (int)
	 * @param c Color (Java Obj)
	 */
	public FibonacciSquare(int x, int y, int quadrant, int n, Color c){
		super(x, y, 10, c);//whatever we pass for size is the default size. 
		//TODO: add input validation.
		if(quadrant < 1 || quadrant > 4){
			//throw error.
			throw new IllegalArgumentException("Quadrant must be an int between 1 and 4. (Inclusive)");
		}
		this.n = n;
		this.quadrant = quadrant;
		//calculate size depending on n (fib Num)
		this.size = fibSeq(n) * this.size;
	}

	/**
	 * Private Fibonacci sequence
	 */
	private int fibSeq(int num){
		if(num <= 1){
			return num;
		}
		return fibSeq(num-1) + fibSeq(num-2);
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
		int shiftX = 0;
		int  shiftY = 0;
		if(quadrant == 1){
			shiftX = -size;
		}else if(quadrant == 3){
			shiftY = -size;
		}else if(quadrant == 4){
			shiftX = -size;
			shiftY = -size;
		}
		g.drawArc(x + shiftX, y + shiftY, size  * 2, size * 2 , 90 * (quadrant-1), 90);
		//g.drawArc(x, y, size, size, startAngle, arcAngle);
		
		
	}
}