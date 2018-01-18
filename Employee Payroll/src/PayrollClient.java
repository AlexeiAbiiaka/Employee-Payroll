import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

//**********************************************************************
//Programmer:	Alexei Abiiaka
//Class:		CS30S
//
//Assignment:	aX qy
//
//Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//Output:		describe the result of your program
//***********************************************************************

public class PayrollClient
{  // begin class
	private static NumberFormat format = new DecimalFormat("$#,##0.00");
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
		String strin; // input string
		List<Payroll> payrolls = new ArrayList(); // all payrolls
	
	// ***** create objects *****
		
		
	// ***** create input stream *****
		InputStream is = PayrollClient.class.getResourceAsStream("payrollData.txt");
	
		ConsoleReader console = new ConsoleReader(is);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Your Name Here");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Ax Qy");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
		while ((strin = console.readLine()) != null) {
			if (strin.length()>0) {
				Payroll payroll = new Payroll(strin);
				payrolls.add(payroll);
			}
		}
	
	// ***** processing *****
		System.out.println("Id\t\tHours\t\tRate\t\tRegular Pay\tOvertime Pay\tGross Pay");
	for (Payroll payroll: payrolls) {
		System.out.print(payroll.getId() + "\t\t");
		System.out.print(payroll.getHours() + "\t\t");
		System.out.print(format(payroll.getRate()) + "\t\t");
		System.out.print(format(payroll.getRegularPay()) + "\t\t");
		System.out.print(format(payroll.getOvertimePay()) + "\t\t");
		System.out.println(format(payroll.getGrossPay()));
		
	}
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
	



	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
	
	private static String format(double num) {
		return format.format(num);
	}
}  // end class 
 
 
 
 
 
 
 