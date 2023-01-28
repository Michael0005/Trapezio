/**
 * Classe Trapezio
 * @author <b>Michael Muia</b>
 * @version <b>1.1</b>
 */
public class Trapezio {
	private float baseMin, baseMax, alt;
	/**
	 * 
	 * @param baseMin <b>Base Minore</b>
	 * @param baseMax <b>Base Maggiore</b>
	 * @param alt <b>Altezza</b>
	 */

	public Trapezio(float baseMin, float baseMax, float alt) {
		super();
		this.baseMin = baseMin;
		this.baseMax = baseMax;
		this.alt = alt;
	}
/**
 * Metodo che calcola l'area del trapezio
 * @return Area
 */
	public float area() {
		return ((baseMax + baseMin) * alt) / 2;
	}
/**
 * Metodo che stampa tutte le informazione del trapezio
 * @return Inforamzioni
 */
	public String toString() {
		String s = "Trapezio\n";
		s += "Base minore: " + baseMin + "\nBase maggiore: " + baseMax + "\nAltezza: " + alt + "\nArea: " + area();
		return s;
	}

	public static void main(String[] args) {
		Trapezio t1= new Trapezio(5F, 10F, 3F);
		System.out.println(t1.area());
		System.out.println(t1);
	}

}
