package Sort;// Sortowanie przez scalanie (mergesort)
// Tomasz Lubinski
// (c)2006 www.algorytm.org

public class Mergesort {

	private static final int N = 30;
	private static int tab[] = {30,29,28,27,26,25,1,2,3,4,5,6,7,24,23,22,21,20,19,18,8,9,10,11,17,16,15,13,14,12};
	private static int t[] = new int[N];  // Tablica pomocnicza

	/**
	 * Sortowanie liczb calkowitych metoda scalania(Merge sort)
	 */
	public static void main(String[] args) {
		int i;

		System.out.println("Zbior przed sortowaniem:");
		for (i=0; i<N; i++)
			System.out.print(tab[i] + " ");

		mergesort(0,N-1);

		System.out.println("\nZbior po sortowaniu:");
		for (i=0; i<N; i++)
			System.out.print(tab[i] + " ");

	}

	/* Procedura sortowania tab[pocz...kon] */
	private static void mergesort(int p, int r)
	{
		int q;
		if (p<r) {
			q=(p+r)/2;
			mergesort(p, q);    // Dzielenie lewej czesci
			mergesort(q+1, r);   // Dzielenie prawej czesci
			merge(p, q, r);   // Scalanie obu czesci
		}
	}

	/* Scalanie dwoch posortowanych ciagow
	   tab[pocz...sr] i tab[sr+1...kon] i
	   wynik zapisuje w tab[pocz...kon] */
	private static void merge(int pocz, int sr, int kon)
	{
	  int i,j,q;
	  for (i=pocz; i<=kon; i++) t[i]=tab[i];  // Skopiowanie danych do tablicy pomocniczej
	  i=pocz; j=sr+1; q=pocz;                 // Ustawienie wska�nik�w tablic
	  while (i<=sr && j<=kon) {		  // Przenoszenie danych z sortowaniem ze zbior�w pomocniczych do tablicy g��wnej
	    if (t[i]<t[j])
	        tab[q++]=t[i++];
	    else
	        tab[q++]=t[j++];
	  }
	  while (i<=sr) {
	  	tab[q++]=t[i++];	// Przeniesienie nie skopiowanych danych ze zbioru pierwszego w przypadku, gdy drugi zbi�r si� sko�czy�
	  }
	}


}
