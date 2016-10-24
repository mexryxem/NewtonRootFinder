import javax.swing.JOptionPane;

public class RootFinder {
	public static void main(String[] args){
		String guess = JOptionPane.showInputDialog(null, "What's your guess? (You can change the function in the method 'f') ");
		double c = Double.parseDouble(guess);
		
		System.out.println("root: " + findRootofF(c, 100));
	}
	
	public static double findRootofF(double x, int times){
		for(int i = 0; i < times; i ++){	
			// equation to find linearization of f at c
			x = x - ( f(x) / df(x) );
		}	
		return x;
	}
	
	public static double f(double x){		
		return Math.pow(2, x) - (3*x);
	}
	
	public static double df(double x){
		// crude method of finding df/dx using limit definition
			// df/dx = lim (h --> 0) f(x + h) - f(x) / h
			// evalauated where h = 0.0001 then rounded
		
		double df = ( f(x + 0.0001) - f(x) ) / 0.0001;
		
		return Math.floor(df * 1000)/1000;
		
	}
	

}
