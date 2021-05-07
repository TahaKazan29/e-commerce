package eCommerce.business.constants;

public class Messages {

	public static void userRegister(String userName) {
		System.out.println("Kayýt baþarýlý hoþgeldin " + userName);
	}
	
	public static void userLogin(String userName) {
		System.out.println("Giriþ Baþarýlý hoþgeldin " + userName);
	}
	
	public static void registerWithGoogle(String userName) {
		System.out.println("Google ile Kayýt olundu hoþgeldin " + userName);
	}
	
	public static void loginWithGoogle(String userName) {
		System.out.println("Google ile Giriþ yapýldý hoþgeldin " + userName);
	}
	
	public static void userNotFound() {
		System.out.println("Kullanýcý bulunamadý");
	}
	
	public static void wrongPassword() {
		System.out.println("Yanlýþ þifre");
	}
	
	public static void userAlreadyExists() {
		System.out.println("Kullanýcý zaten mevcut");
	}
	
	public static void checkPassword() {
		System.out.println("Þifre en az 6 karekterden oluþmalý");
	}
	
	public static void checkName() {
		System.out.println("Ad en az 2 karekterden oluþmalý");
	}
	
	public static void checkLastName() {
		System.out.println("Soyad en az 2 karekterden oluþmalý");
	}
	
	public static void checkEmailRegex() {
		System.out.println("Geçersiz email");
	}
	
	public static void sendEmail(String email) {
		System.out.println(email + " mailinize kod gönderildi");
	}
	
	public static void sendEmailCode(String uuid) {
		System.out.println("Email Kodunuz: " + uuid);
	}
	
	public static void verificationFailed() {
		System.out.println("Doðrulama baþarýsýz kayýt olunamadý");
	}
	
	public static void clickOnTheLink() {
		System.out.println("Linke týklamak için Y tuþuna basýn: ");
	}
	
}
