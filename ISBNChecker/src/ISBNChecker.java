
public class ISBNChecker {
	
	public static boolean isISBN (String isbn){
		int sum = 0;
		for (int i = 0; i < isbn.length() - 1; i++){
			sum += (i + 1) * Character.getNumericValue(isbn.charAt(i));
		}
		int remainder = sum % 11;
		if (remainder == 10 && isbn.charAt(9) == 'X'){
			return true;
		} else if (remainder == Character.getNumericValue(isbn.charAt(9))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String isbn1 = "0205080057";
		String isbn2 = "0136091812";
		String isbn3 = "123456789X";
		
		System.out.println(isISBN(isbn1));
		System.out.println(isISBN(isbn2));
		System.out.println(isISBN(isbn3));

	}

}
