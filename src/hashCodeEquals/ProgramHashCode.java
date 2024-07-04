package hashCodeEquals;

public class ProgramHashCode {

	public static void main(String[] args) {
		Client a = new Client("Matheuzinho pressão", "matheus@gmail.com");
		Client b = new Client("Duduzinho pressão", "dudu@gmail.com");
		Client c = new Client("Matheuzinho pressão", "matheus@gmail.com");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}

}
