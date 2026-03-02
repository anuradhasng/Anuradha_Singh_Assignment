package TrainingCoforge.Project;
import java.util.function.*;
 
public class DemoOnBuiltFI {
 
	public static void main(String[] args) {
		//Supplier
		Supplier<String> strSupplier=()->"Hello World".toUpperCase();
		System.out.println(strSupplier.get());
		Supplier<Double> randomSupplier=()->{
			double randomValue=Math.random();
			return randomValue;
		};
		System.out.println(randomSupplier.get());
		Supplier<Integer> otpSupplier=()->{
			Integer otp=(int)(Math.random()*10000);
			return otp;
		};
		System.out.println(otpSupplier.get());
		
//		
//		Supplier<Integer[]> evenSupplier=()->{
//		  
//		};
		//Consumer
		Consumer<String> strConsumer=(str1)->System.out.println(str1.toUpperCase());
				strConsumer.accept("ABC");
		Consumer<Integer>squareConsumer=(num)->System.out.println(num*num);
		for(int i=1;i<=10;i++) {
			squareConsumer.accept(i);
		}
		Consumer<Integer> factorialConsumer=(num)->{
			int fact=1;
			for(int i=1;i<=num;i++)
				fact=fact*i;
				System.out.println(fact);
		};
		factorialConsumer.accept(5);
		
		//Function
		
		Function<Integer, String> isEven=(num)->{
			if(num % 2==0)
				return "even";
			else
				return "odd";
		};
		System.out.println(isEven.apply(54));
		Function<String, String> greet=(name)->"Hello "+name;
		System.out.println(greet.apply("Amit"));
		//Predicate
        Predicate<Integer> checkNum=(num)->num % 2==0;
        if(checkNum.test(56))
        	System.out.println("even number");
        else
        	System.out.println("odd num");
         Predicate<String> chkLength=(str)->str.length()>5;
         System.out.println(chkLength.test("Swapna"));
         Predicate<String>authenticateUsername=(uname)->uname.equals("swapna");
         Predicate<String>authenticatePassword=(pwd)->pwd.equals("swapna123");
         String result= authenticateUsername.test("swapna") &&
        		 authenticatePassword.test("swapna123")? "Authentication Successful":"Inavalid credentilas";
         System.out.println(result);
         Predicate<String> validateUsername=(uname)->uname.length()>3 && uname != null && !(uname.isBlank());
         System.out.println(validateUsername.test("Pragya"));
	}
	//validation rules
	//username length must be more than 3 chars
	//not null
	//not blank
 
 
 
}
 
 