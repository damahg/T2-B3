
public class Pete {

	public static void main(String[] args) {
		int[] pete = new int[(Integer.MAX_VALUE/5)];
		llenar(pete);
		llenar2(pete);
	}
	
	public static void llenar(int[] pete) {
		for (int i = 0; i < pete.length; i++) {
			pete[i] = Integer.MAX_VALUE;
		}
	}
	
	public static void llenar2(int[] pete) {
		for (int i = 0; i < pete.length; i++) {
			System.out.println(pete[i]);
		}
	}
}
