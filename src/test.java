import java.awt.Color;

import java.util.Random;
import java.io.*;
import java.util.*;
import java.lang.*;

public class test {
	public static int rand(int a,int b) {
		Random rd = new Random();
		int range = b - a ;
		int randomNumber = a + rd.nextInt(range);
		return randomNumber;
	}
	public int setColor(int x,int y) {
		int a = 0,b=128,c=255;
		int[][] arr = new int[2][2];
		arr[0][0] = 512 ; arr[0][1]= 255 ;
		arr[1][0] = 200102; arr[1][1] = 1048576;
		
		
		
		int point = arr[x][y];
		int coef = (int) Math.log(point);
		int trans = coef * 20;	
				a += trans; c-=trans;
		System.out.println(point + " New Color: ("+ a+", "+b+", "+c+")");
		return a + b + c ;
		}
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
	public static void main(String[] args) {
		test g = new test(); 
		g.OpenFile();
		g.addRecord(4048);
		g.close();
		
		
		
	}
}