package Practica;

public class AudioBook extends Book {
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public AudioBook(int minutes) {
		super("AudioBook Bosque", "Bosque");
		this.minutes = minutes;
	}

	

	

	
}
