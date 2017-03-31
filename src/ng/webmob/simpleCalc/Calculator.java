package ng.webmob.simpleCalc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,ops;
		double numOne,numTwo,result;
		
		
		System.out.println("Enter your username(Press <enter> after each input):");
		name = sc.nextLine();
		System.out.println("Welcome,"+name.toUpperCase()+".Enter the 1st number:");
		numOne = sc.nextDouble();
		
		System.out.println("Enter the 2nd number:");
		numTwo = sc.nextDouble();
		
		System.out.println("Choose the operation to perform('mult','add','div','sub'):");
		ops = sc.next();
		
		try {
		switch(ops) {
		case "mult":
			result = numOne * numTwo;
			System.out.println(numOne+" X "+numTwo+" = "+result);
			break;
		case "div":
			result = numOne / numTwo;
			System.out.println(numOne+" Divided by "+numTwo+" = "+result);
			break;
		case "add":
			result = numOne + numTwo;
			System.out.println(numOne+" Plus "+numTwo+" = "+result);
			break;
		case "sub":
			result = numOne - numTwo;
			System.out.println(numOne+" Minus "+numTwo+" = "+result);
			break;
		default:
			System.out.println("Ooops!Something's not right..");
		
		}
		}catch(Exception e){
			if(ops==null){
				System.out.println("Enter a number!");
				System.out.println("Error: "+e.getMessage());
			}
		}finally{
			System.out.println("So..what next?");
		}
		/*try{
			if(ops.equals("mult")){
				result = numOne * numTwo;
				System.out.println("Answer: "+result);
			}else if(ops.equals("add")){
				result = numOne + numTwo;
				System.out.println("Answer: "+result);

		}else if(ops.equals("div")){
			result = numOne / numTwo;
			System.out.println("Answer: "+result);
		}else if(ops.equals("sub")){
			result = numOne - numTwo;
			System.out.println("Answer: "+result);
		}
		    }catch(Exception e){
			System.out.println("Enter a numeral");
		}finally{
			System.out.println("Go again?");
		}
		/* *************************************************
		//try -catch needs work
	try	{
		if(ops.equals("mult")){
			result = numOne * numTwo;
			System.out.println("Answer: "+result);
		}else if(ops.equals("add")){
			result = numOne + numTwo;
			System.out.println("Answer: "+result);

	}else if(ops.equals("div")){
		result = numOne / numTwo;
		System.out.println("Answer: "+result);
	}else if(ops.equals("sub")){
		result = numOne - numTwo;
		System.out.println("Answer: "+result);
	}
	     }catch(Exception e){
	    	 System.out.println("Please,enter a numeral..");
	    	 System.out.println("Error:"+e.getMessage());
	     } **************************************************    */
		sc.close();
}
}