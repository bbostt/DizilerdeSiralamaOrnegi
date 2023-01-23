import java.util.Scanner;
import java.util.Arrays;
public class DizilerdeSiralama {

	public static void main(String[] args) {
		// Java dilinde, dizideki elemanlar� k���kten b�y��e s�ralayan program� yaz�n�z.
		// Dizinin boyutunu ve dizinin elemanlar�n� kullan�c�dan al�n�z.
		/*
		 * �rnek
		 * Dizinin boyutu n : 5 
		 * Dizinin elemanlar�n� giriniz : 
		 * 1. Eleman� : 99 
		 * 2. Eleman� : -2
		 * 3. Eleman� : -2121 
		 * 4. Eleman� : 1 
		 * 5. Eleman� : 0 
		 * S�ralama   : -2121 -2 0 1 99
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin eleman say�s�n� giriniz : ");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Dizinin " +(i+1)+ ". eleman�n� giriniz : ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("Girilen dizi :");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // Diziyi k���kten b���ye s�ralad�
		System.out.println(Arrays.toString(arr));

	}

}
