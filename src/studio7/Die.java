package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public int randomInt() {
		return (int) (Math.random() * n) + 1; 
	}
	
	public String toString() {
		return n + "-sided die";
	}
	
	public static void main(String[] args) {
		Die d = new Die(5);
		System.out.println(d.toString());
		
		System.out.println(d.randomInt());
		System.out.println(d.randomInt());
		System.out.println(d.randomInt());
		System.out.println(d.randomInt());
		System.out.println(d.randomInt());

		

	}
}
