/**
 * 
 */
package it.univr.order.sorted;

/**
 * @author giovanni kevin alessandro
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prova alessandro
		
		Simbol<Integer> s = new Simbol<Integer>(5);
		System.out.println("Nuovo simbolo " + s);
		
		Simbol<String> s1 = new Simbol<String>("5");
		System.out.println("Nuovo simbolo " + s1);
		
		Simbol<Character> s2 = new Simbol<Character>('5');
		System.out.println("Nuovo simbolo " + s2);
		
		Simbol<Float> s3 = new Simbol<Float>(5.433f);
		System.out.println("Nuovo simbolo " + s3);
	}

}
