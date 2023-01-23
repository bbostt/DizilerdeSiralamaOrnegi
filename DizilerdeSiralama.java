import java.util.Scanner;
import java.util.Arrays;
public class DizilerdeSiralama {

	public static void main(String[] args) {
		// Java dilinde, dizideki elemanlarý küçükten büyüðe sýralayan programý yazýnýz.
		// Dizinin boyutunu ve dizinin elemanlarýný kullanýcýdan alýnýz.
		/*
		 * Örnek
		 * Dizinin boyutu n : 5 
		 * Dizinin elemanlarýný giriniz : 
		 * 1. Elemaný : 99 
		 * 2. Elemaný : -2
		 * 3. Elemaný : -2121 
		 * 4. Elemaný : 1 
		 * 5. Elemaný : 0 
		 * Sýralama   : -2121 -2 0 1 99
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin eleman sayýsýný giriniz : ");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Dizinin " +(i+1)+ ". elemanýný giriniz : ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("Girilen dizi :");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // Diziyi küçükten büðüye sýraladý
		System.out.println(Arrays.toString(arr));

	}

}
