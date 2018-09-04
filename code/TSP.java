import java.util.Random;
class Point{
	private double x,y;
	public Point(double x, double y) { this.x = x; this.y = y;}
	public static double distance(Point a, Point b){
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
}
public class TSP{
	static boolean tspCertf(Point[] pts, double k, Integer[] sol) { }
	public static void main(String[] args){
		Point[] points = new Point[100];  // Vetor com a cidades
		Integer[] sol = new Integer[100]; // Vetor com a solução
		Random rg = new Random();
		Double x,y;
		for(int i = 0; i < points.length; i++){
			x = 100.0 * rg.nextDouble();
			y = 100.0 * rg.nextDouble();
			points[i] = new Point(x, y); // Cria/insere um Point no array
			sol[i] = i;  // sol é inicializado com valores de 0 até 99 
		}
		sol.shuffleArray(); // Embaralha aleatoriamente os elementos de sol
		boolean ans = tspCertf(points, 1000.0, sol);
		System.out.println(ans);
	}
}