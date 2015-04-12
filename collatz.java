
public class collatz {

	public static void main(String[] args) {
		int largest = 0;
		int value = 0;
		int answer = 0;
		for (int i = 500000 ; i < 1000000 ; i++){
			value = collatzer(i);
			if (largest < value){
				largest = value;
				answer = i;
			}
		}
		System.out.print(largest + " " + answer);
	}

	public static int collatzer(long number){
		int count = 0;
		while (number != 1){
			if ( (number % 2) == 0){
				number = number/2;
			}
			else {
				number = number*3 + 1;
			}
			count++;
		}
		return count + 1;
	}
}
