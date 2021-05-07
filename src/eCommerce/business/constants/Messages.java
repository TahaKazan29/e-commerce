package eCommerce.business.constants;

public class Messages {

	public static void userRegister(String userName) {
		System.out.println("Kay�t ba�ar�l� ho�geldin " + userName);
	}
	
	public static void userLogin(String userName) {
		System.out.println("Giri� Ba�ar�l� ho�geldin " + userName);
	}
	
	public static void registerWithGoogle(String userName) {
		System.out.println("Google ile Kay�t olundu ho�geldin " + userName);
	}
	
	public static void loginWithGoogle(String userName) {
		System.out.println("Google ile Giri� yap�ld� ho�geldin " + userName);
	}
	
	public static void userNotFound() {
		System.out.println("Kullan�c� bulunamad�");
	}
	
	public static void wrongPassword() {
		System.out.println("Yanl�� �ifre");
	}
	
	public static void userAlreadyExists() {
		System.out.println("Kullan�c� zaten mevcut");
	}
	
	public static void checkPassword() {
		System.out.println("�ifre en az 6 karekterden olu�mal�");
	}
	
	public static void checkName() {
		System.out.println("Ad en az 2 karekterden olu�mal�");
	}
	
	public static void checkLastName() {
		System.out.println("Soyad en az 2 karekterden olu�mal�");
	}
	
	public static void checkEmailRegex() {
		System.out.println("Ge�ersiz email");
	}
	
	public static void sendEmail(String email) {
		System.out.println(email + " mailinize kod g�nderildi");
	}
	
	public static void sendEmailCode(String uuid) {
		System.out.println("Email Kodunuz: " + uuid);
	}
	
	public static void verificationFailed() {
		System.out.println("Do�rulama ba�ar�s�z kay�t olunamad�");
	}
	
	public static void clickOnTheLink() {
		System.out.println("Linke t�klamak i�in Y tu�una bas�n: ");
	}
	
}
