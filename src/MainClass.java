import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class MainClass {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			buildGUI();
		});
	}

	private static void buildGUI() {
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingView panel = new DrawingView();
		frame.add(panel);

		frame.setVisible(true);
		for(int i = 0; i < 10 ; i++){
			//draw the first 10 squares of fib
			
		}
		DrawingModel model = new DrawingModel();
		Shape s = new FibonacciSquare(100,100,1,6,Color.RED);
		Shape t = new FibonacciSquare(300,100,2,6,Color.RED);
		Shape u = new FibonacciSquare(400,100,3,6,Color.RED);
		Shape v = new FibonacciSquare(500,100,4,6,Color.RED);
		model.addShape(s);
		model.addShape(t);
		model.addShape(u);
		model.addShape(v);
		model.addView(panel);
	}
}