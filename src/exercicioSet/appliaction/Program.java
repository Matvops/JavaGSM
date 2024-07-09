package exercicioSet.appliaction;

import java.util.Locale;

import exercicioSet.entities.Portal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Portal pt = new Portal();
		pt.interfacePortal();
	}

}
