public class PrimeFactors {

	public static void main(String args[]) {
	
		new PrimeFactors().primeFactor(21);
	}
	
	private void primeFactor(int num) {
		int limitToFind = num/2;
		
		for(int i=2; i<=limitToFind; i++) {
			if(isPrime(i) && (num%i) == 0) {
				System.out.println("PrimeFactor :: "+i);
			}
		}
		
	}
	
	private boolean isPrime(int num) {
		int limitToCheck = (int) Math.ceil(Math.sqrt(num));
		boolean isPrime = true;
		for(int i=2; i<=limitToCheck;i++) {
			if(num/i == 0) {
				isPrime = false;
				break;
			}				
		}
		
		return isPrime;
	}
}
