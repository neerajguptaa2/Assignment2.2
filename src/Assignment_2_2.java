class Assignment_2_2 {
	public static void main(String[] args) {
		int i, j;

		for (i = 0; i <= 5; i++) {
			for (j = 0; j < 5; j++) {

				if (i == j || i + j == 5 - 1) {
					System.out.print("*");
				}else
				{
					System.out.print(" ");		
				}
			}
			System.out.println("");		
			
		}
	}
}