package Exception;

//1. Try
//2. Catch
//3. Finally
//4. Throw
//5. Throws

public class ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("12/2");
		System.out.println(15/5);
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("error");
		}
		finally {
			System.out.println("final");
		}
		
		
		String f=null;
		try {
			char c=f.charAt(7);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	

}
