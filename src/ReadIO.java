import java.io.File;
import java.util.Scanner;

public class ReadIO {
	public static int[] Read(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0 ;
			while (s.hasNextInt()) {
				n++;
				s.nextInt();
			}
			int arr[] = new int[n++];
			Scanner s1 = new Scanner(f);
			for (int i = 0; i <arr.length;i++) {
				arr[i] = s1.nextInt();
			}
			return arr;
		}
		catch (Exception e) {
			return null;
		}
	}
	public int getScore() {
		int read[] = Read("HighScore.txt");
		int highest = read[0];
		return highest;
	}
}
