import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;



public class Test {

	public static void  main() {
		
	}
	
	
	public static String encrypt(String password) throws Exception {

		if (password == null) {
			return null;
		} else {
			String key = "";
			for(int i=0; i<6; i++) {
				
			}
			SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
			byte[] encrypted = cipher.doFinal(password.getBytes());
			return byteArrayToHex(encrypted);
		}
	}

	public static String byteArrayToHex(byte[] encrypted) {
		if (encrypted == null || encrypted.length == 0) {
			return null;
		}
		StringBuffer sb = new StringBuffer(encrypted.length * 2);
		String hexNumber;
		for (int x = 0; x < encrypted.length; x++) {
			hexNumber = "0" + Integer.toHexString(0xff & encrypted[x]);
			sb.append(hexNumber.substring(hexNumber.length() - 2));
		}

		return sb.toString();
	}
	
}
