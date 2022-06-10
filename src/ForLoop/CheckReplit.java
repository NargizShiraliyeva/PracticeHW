package ForLoop;

public class CheckReplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
				};
		
				int sum=0;
				    for (int i=0; i<a.length; i++){
				for (int j=0; j<a[i].length; j++){
				  if (i%2==0 || j%2==0){
				    sum=sum+a[i][j];
				    
				  }
				}System.out.println(sum);
				    }
	}
}
		/*int count = 0;
		while (count++ < 10) {
		System.out.println("Welcome to Java");
		}

		
		
		/*int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		
		
		
		
		
		
		/*int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum = sum + array_variable[i][j];

		   }

		}

		System.out.print(sum / 5);
		
		
		
		
		
		

		/*int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);*/
	


