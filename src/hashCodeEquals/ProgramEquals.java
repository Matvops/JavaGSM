package hashCodeEquals;

public class ProgramEquals {

	public static void main(String[] args) {
		Client a = new Client("Matheuzinho pressão", "matheus@gmail.com");
		Client b = new Client("Duduzinho pressão", "dudu@gmail.com");
		Client c = new Client("Matheuzinho pressão", "matheus@gmail.com");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
