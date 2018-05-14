import java.util.Random;
import java.awt.Color;
import java.util.*;

public class Game {
	public int[][] Grid;
	public int[][] RecArray;
	public final int COLUMN;
	public final int ROW;
	boolean canStart;
	Queue<Integer> re1 = new LinkedList<Integer>();
	Stack<Integer> re2 = new Stack<Integer>();

	public Game(final int col, final int row) {
		COLUMN = col;
		ROW = row;
		if (col != row || col < 2 || row < 2) {
			canStart = false;
			System.out.println("The size must larger than 2");
		} else {
			canStart = true;
			Grid = new int[row][col];
		}
	}
	public boolean isFull() {
		for (int x = 0; x < ROW; x++) {
			for (int y = 0; y < COLUMN; y++) {
				if (Grid[x][y] == 0) {
					return false ;
				}
			}
		}
		return true;
	}
	public boolean canMove() {
		for (int x = 0; x < ROW; x++) {
			for (int y = 0; y < COLUMN; y++) {
			while (x == x+1 || y == y+1 ) {
				if (Grid[x][y]== Grid[x+1][y] || Grid[x][y]== Grid[x][y+1]) {
					return true;
				}
			}
		}
	}
	return false;
}
	public boolean Win() {
		for (int x = 0; x< ROW;x++) {
			for (int y = 0;y<COLUMN;y++) {
				if (Grid[x][y]==256) {
					return true;
				}
			}
		}
		return false;
	}
	public String setValue() {
		
		int value;
		String i = new String();
		for (int x = 0; x < ROW; x++) {
			for (int y = 0; y < COLUMN; y++) {
				value = Grid[x][y];
				i += Integer.toString(value)+"\t";
			}
			i+="\n";
		}
		return i;
	}
	public String pointValue(int x,int y) {
		int value;
		String i = new String();
		value = Grid[x][y];
		i = Integer.toString(value);
		if (value==0) {
			i = null;
		}
		return i;
	}
	public void printGrid() {
		for (int x = 0; x < ROW; x++) {
			for (int y = 0; y < COLUMN; y++) {
				System.out.print(Grid[x][y] + " ");
			}
			System.out.println();
		}
	}

	// create random number
	public static int rand(int a, int b) {
		Random rd = new Random();
		int range = b - a;
		int randomNumber = a + rd.nextInt(range);
		return randomNumber;
	}

	public void RandomInitialize() {
		// Point 1
		int y1 = rand(0, COLUMN);
		int x1 = rand(0, ROW);
		int j = Math.random() < 0.1 ? 2 : 4;
		Grid[x1][y1] = j;
		System.out.println(x1+" "+y1);
		// Point 2
		int y2 = rand(0, COLUMN);
		int x2 = rand(0, ROW);
		if (x2 == x1 && y2 == y1) {
			x2 += 1;
		}
		System.out.println(x2+" "+y2);
		int k = Math.random() < 0.1 ? 2 : 4;
		Grid[x2][y2] = k;
	}
	// addNew
		public boolean addNew() {
			int y;
			int x;
			Random random = new Random();
			do {
				y = random.nextInt(ROW) ;
				x = random.nextInt(COLUMN) ;
			} while (Grid[x][y] != 0);
			Grid[x][y] = 2;
			return true;
	 
}
	//Value 
		public int value(int x,int y) {
			return Grid[x][y];
		}
	//Score
		public int Score() {
			int Score = 0 ;
			for (int x = 0 ; x < ROW; x++) {
				 for (int y = 0 ;  y < COLUMN ; y++) {
					 Score += Grid[x][y];
				 }
			}
		return Score;
		}
	// movement
	public void left() {
		int leftCol;
		for (int x = 0; x < ROW; x++) {
			leftCol = 0; 
			for (int y = 0; y < COLUMN; y++) {
				if (leftCol == y || Grid[x][y] == 0 ) {
					continue;		
			} else if (Grid[x][y]==Grid[x][leftCol]) {
				Grid[x][leftCol] = Grid[x][leftCol] * 2; // Also the Sum of 2 equal value 
				Grid[x][y] = 0;
				leftCol++;
		
			} else {
				if (Grid[x][leftCol]!=0)
					leftCol++;
				if (leftCol != y) {
					Grid[x][leftCol] = Grid[x][y];
					Grid[x][y] = 0;
					}
				}
			}
		}
	}
	
	public void right() {
		int rightCol;
		for (int x = 0; x < ROW; x++) {
			rightCol = COLUMN - 1; 
			for (int y = COLUMN-1 ; y >= 0; y--) {
				if (rightCol == y || Grid[x][y] == 0 ) {
					continue;		
			} else if (Grid[x][y]==Grid[x][rightCol]) {
				Grid[x][rightCol] = Grid[x][rightCol] * 2; // Also the Sum of 2 equal value 
				Grid[x][y] = 0;
				rightCol--;
			} else {
				if (Grid[x][rightCol]!=0)
					rightCol--;
				if (rightCol != y) {
					Grid[x][rightCol] = Grid[x][y];
					Grid[x][y] = 0;
					}
				}
			}
		}
	}
	public void up() {
		int topRow;
		for (int y = 0; y < COLUMN; y++) {
			topRow = 0;
			for (int x = 0; x < ROW; x++) {
				if (topRow == x || Grid[x][y] == 0) {
					continue; 
				} else if (Grid[x][y] == Grid[topRow][y]) {
					Grid[topRow][y] = Grid[topRow][y] * 2;
					Grid[x][y] = 0;
					topRow ++;
				} else {
					if (Grid[topRow][y] != 0)
						topRow++;
					if(topRow != x) {
						Grid[topRow][y] = Grid[x][y];
						Grid[x][y] = 0;
					}
				}
			}
		}
	}
	
	public void down() {
		int topRow;
		for (int y = 0; y < COLUMN; y++) {
			topRow = ROW - 1;
			for (int x = ROW - 1; x >= 0; x--) {
				if (topRow == x || Grid[x][y] == 0) {
					continue; 
				} else if (Grid[x][y] == Grid[topRow][y]) {
					Grid[topRow][y] = Grid[topRow][y] * 2;
					Grid[x][y] = 0;
					topRow --;
				} else {
					if (Grid[topRow][y] != 0)
						topRow--;
					if(topRow != x) {
						Grid[topRow][y] = Grid[x][y];
						Grid[x][y] = 0;
					}
				}
			}
		}
	}
	// finish movement
	// color
	public Color setColor(int x,int y) {
		int a = 0, b = 0 , c =0;
		Color col = new Color(a,b,c);
				int point = Grid[x][y];
				//int coef = (int) Math.log(point);
				//int trans = coef * 36 ;
				switch (point) {
				case 0 :
					return new Color (135,206,250);
				case 2 : 
					return new Color (32,178,170);
				case 4 : 
					return new Color (72,61,139);
				case 8 : 
					return new Color (107,42,35);
				case 16 :
					return new Color (0,100,0);
				case 32 : 
					return new Color (255,215,0);
				case 64 :
					return new Color (160,82,45);
				case 128 :
					return new Color (255,165,0);
				case 512 :
					return new Color (255,99,71);
				case 1024 :
					return new Color (165,42,42);
				case 2048 :
					return new Color (255,0,0);
				}
				if (point > 2048) {
					return new Color (128,0,128) ;
				}
				//a += trans; c-=trans;
				
		return new Color(a,b,c);
}
	// additional feature 

	public Queue<Integer> Recovery1() {
		
		for (int x = 0; x < ROW ; x++) {
			for (int y = 0; y < COLUMN; y++) {
				re1.add(Grid[x][y]);
			}
		}
		return re1;
	}
	public void ArrayStack() {
		RecArray = new int[ROW][COLUMN];
		while (!re1.isEmpty()) {
			for (int x = 0; x < ROW ; x ++) {
				for (int y = 0; y < COLUMN ;y++) {
					RecArray[x][y] = re1.remove();
					System.out.print(RecArray[x][y]+" ");
				}
				System.out.println();
			}
		}
	}
	public void Undo() {
		for (int x = 0; x < ROW ; x ++) {
			for (int y = 0; y < COLUMN ;y++) {
				 Grid[x][y] = RecArray[x][y];
				
			}
	}
	}

	public void PrintList2() {
		
		for (int x = 0; x < ROW ; x++) {
			for (int y = 0; y < COLUMN; y++) {
				System.out.print(re2.pop()+" ");
			}
		}
	}
	public void isEqual(Queue<Integer> a, Queue<Integer> b) {
		
	}
	
	public void Undo1() {
		Queue<Integer> re = new LinkedList<Integer>();
	while (!re.isEmpty()) {
			for (int x = 0; x < ROW ; x++) {
				for (int y = 0; y < COLUMN; y++) {
					Grid[x][y] = re.remove();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Game a = new Game(4, 4);
		a.RandomInitialize();
		a.printGrid();
		System.out.println();
		
		
		a.left();
		System.out.println("left:");
		a.printGrid();
		System.out.println("Recover + Array");
		a.Recovery1();
		a.ArrayStack();
		System.out.println("Right");
		a.right();
		a.printGrid();
		System.out.println("Undo");
		a.Undo();
		a.printGrid();
		

		

	}
}