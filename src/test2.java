import java.io.File;
import java.util.*;

public class test2 {
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
		int hihi[] = Read("HighScore.txt");
		int highest = hihi[0];
		return highest;
	}
	public String ShowScore() {
		int haha[] = Read("HighScore.txt");
		Arrays.sort(haha);
		String x = "" ;
		for(int i = haha.length - 1;i>=0;i--) {
			 x +="\n"+Integer.toString(haha[i]);
		}
		System.out.println(x);
		return x;
		
	}
	public static void main(String[] args) {
		int haha[] = Read("HighScore.txt");
		test2 abc = new test2();
		System.out.println(abc.getScore());
			
		}
	}

