package callout.anonymous;

import javax.swing.JFrame;

/**
 * Program koji prikazuje slučajno odabrano ime polaznika kojeg treba prozvati.
 * 
 * Ova implementacija koristi anonimne klase za listener objekte, te time
 * pokazuje zašto je ovakav način pisanja kôda praktičan za jako jednostavne
 * akcije.
 * 
 * @author damir
 *
 */
public class Callout {

	/**
	 * Ulazna tačka programa.
	 * 
	 * Ovdje pravimo objekat klase Students,te glavni prozor aplikacije koji
	 * odmah prikazujemo.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Students students = new Students();

		JFrame mainWindow = new MainFrame(students);
		mainWindow.setVisible(true);
	}

}
