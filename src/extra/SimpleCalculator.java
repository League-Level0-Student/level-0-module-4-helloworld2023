package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	
	//public static void addition(...int, ...int);
	public static void main(String[] args) 
	{

		// 1. Get 2 numbers from the user and convert them to integer.
			String num = JOptionPane.showInputDialog("Input a number: ");
			String num2 = JOptionPane.showInputDialog("Input a number: ");
			
			int a = Integer.parseInt(num);
			int b = Integer.parseInt(num2);
			
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		
		int operation = JOptionPane.showOptionDialog(null, "Pick an operation.", "Pop-up Title", 0,
			 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplication", "division" },
				null);
		System.out.println(operation);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
				
			if(operation == 3)
				{ 
					division(a, b);
				}
				
			if(operation == 2)
				{ 
					multiplication(a, b);
				}
				 
			if(operation == 1)
				{ 
					subtraction(a, b);
				}
				
			if(operation == 0)
				{ 
					addition(a, b);
				}
				 
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	
	
	// 4. Create similar methods for subtraction, multiplication and division.


public static void addition(int a, int b)
	{
		int c;
		c = a + b;

		JOptionPane.showMessageDialog(null, a + " + " + b + " = " + c );	
		
		return;
	}

public static void subtraction(int a, int b)

	{
		int d;
		d = a - b;
		JOptionPane.showMessageDialog(null, a + " - " + b + " = " + d );
	}

public static void multiplication(int a, int b)
	{
		int e;
		e = a * b;
		JOptionPane.showMessageDialog(null, a + " * " + b + " = " + e );
	}

public static void division (int a, int b)
	{
		int f;
		f = a/b;
		JOptionPane.showMessageDialog(null, a + "/" + b + " = " + f );
	}

}



