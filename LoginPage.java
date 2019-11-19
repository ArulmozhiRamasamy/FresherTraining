import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPageMain {
	static boolean emailverification(String email) {
		String expression = "^[\\w.+\\-]+@gmail\\.com$";
		CharSequence inputStr = email;
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();

	}

	public static void main(String[] args) {
		UserDetails ud = new UserDetails();
		LinkedHashMap<String, UserDetails> map = new LinkedHashMap<String, UserDetails>();
		int ch = 1 - 1;
		int flag = 1 - 1;
		while (ch != 5) {
			System.out
					.println("1)Create User\n2)Login\n3)Forget Password\n4)Show user\n5)Exit");
			Scanner input = new Scanner(System.in);
			ch = input.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter name");
				String name = input.next();
				System.out.println("Enter Email Id");
				String Emailid = input.next();
				emailcheck: if (!(LoginPageMain.emailverification(Emailid))) {
					System.out.println("Enter Valid Email id");
					Emailid = input.next();
					break emailcheck;
				}
				System.out.println("Enter Password");
				String password = input.next();
				System.out.println("Enter conform password");
				String cpassword = input.next();
				in: if (!(password.equals(cpassword))) {
					System.out.println("password doesn't match ");
					System.out.println("Enter Password");
					password = input.next();
					System.out.println("Enter conform password");
					cpassword = input.next();
					break in;
				}

				ud.setName(name);
				ud.setEmail(Emailid);
				ud.setPassword(password);
				map.put(Emailid, ud);
				break;
			case 2:
				
				System.out.println("Enter Emailid");
				String Email = input.next();
				main:for (Entry<String, UserDetails> entry : map.entrySet()) {
					if (!(Email.equals(entry.getKey()))) {
						System.out.println("You have not account..!");
                        	break main ;
                        	
					}

				
				System.out.println("Enter Password");
				String psw1 = input.next();
				out: while (!(map.get(Email).getPassword().equals(psw1))) {
					System.out.println("Enter correct password");
					psw1 = input.next();
					continue out;
				}System.out.println("Succesfully loged in");
				}
				
				break;

			case 3:
				System.out.println("Enter Your email id");
				String formailid = input.next();
				forget: for (Entry<String, UserDetails> entry : map.entrySet()) {
					if (!(formailid.equals(entry.getKey()))) {
						System.out.println("Invalid emailid...!Re-Enter ");
						formailid = input.next();
						continue forget;
					}
				}
				System.out.println("Enter new password");
				String npass = input.next();
				System.out.println("Enter conform password");
				String cpass = input.next();
				map.get(formailid).setPassword(npass);
				infor: while (!(npass.equals(cpass))) {
					System.out.println("password doesn't match\n");
					System.out.println("Enter Password");
					npass = input.next();
					System.out.println("Enter conform password");
					cpass = input.next();
					continue infor;
				}
				System.out.println("Password Successfully changed");
				break;
			case 4:
				System.out.println("EmailID                 Name");
				map.forEach((k, v) -> System.out.println(k + "   \t  "
						+ v.toString()));
				break;
			case 5:
				System.exit(1 - 1);
				break;

			}
		}

	}
}
