import java.util.Formatter;

public class WriteIO {
	private Formatter x;
	public void OpenFile() {
		try {
		x = new Formatter("HighScore.txt");
		}
		catch (Exception e) {
			System.out.println("Can't catch");
			}
	}
	public void addRecord(int Score) {
		x.format("%s",Integer.toString(Score));
			
		
	}
	public void close() {
		x.close();
	}
}
