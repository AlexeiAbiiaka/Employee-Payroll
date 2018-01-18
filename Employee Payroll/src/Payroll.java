
/* **********************************************************
 * Programmer:	Alexei Abiiaka
 * Class:		CS30S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Payroll
 {  // begin class
	//******** class variables and constants **********
	 
	private static int nextID = 1000; 
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
	 
	final int MAXHOUR = 40; // maximum hours before overtime
	final double OTRATE = 1.5; // overtime is time and a half
	private int id = nextID++;     
	double rate; // hourly pay rate
	private int hours = 0;
	 
 	
 	// ********** constructors ***********
	 
    //*****************************************************
    // Purpose: create an object, form string value
    // Interface: 
    // IN: string from file
    // Returns: none
    // *****************************************************
	 public Payroll(String line) {
		 String[] arr = line.split(" ");
		 if (arr.length==2) {
			 rate = Double.parseDouble(arr[0]);
			 hours = Integer.parseInt(arr[1]);
		 }
		 
	 }
 	
 	// ********** accessors **********
	 
    //*****************************************************
    // Purpose: get the id of the employee
    // Interface: 
    // IN: none
    // Returns: id: int
    // ***************************************************** 
       public int getId() {
        return id;
        }
       
   //*****************************************************
   // Purpose: get the rate of employee
   // Interface: 
   // IN: none
   // Returns: id: int
   // *****************************************************       
		public double getRate() {
			return rate;
		}

    //*****************************************************
    // Purpose: get hours of employee
    // Interface: 
    // IN: none
    // Returns: id: int
    // *****************************************************
		public int getHours() {
			return hours;
		}
 
   //*****************************************************
   // Purpose: get the regular pay of employee
   // Interface: 
   // IN: none
   // Returns: id: int
   // ***************************************************** 
      public double getRegularPay() {
    	  	if (hours > MAXHOUR) {
    	  		return MAXHOUR * rate; // calculate regular pay
	    } else {
	    		return hours * rate;
	    }
      }
	  //*****************************************************
	  // Purpose: get the overtime pay of employee
	  // Interface: 
	  // IN: none
	  // Returns: id: int
	  // ***************************************************** 
	     public double getOvertimePay() {
	    	  	if (hours > MAXHOUR) {
	    	  		return (hours - MAXHOUR) * rate * OTRATE; // calculate regular pay
		    } else {
		    		return 0;
		    }
	       }
	     
     //*****************************************************
     // Purpose: get the gross pay of the employee
     // Interface: 
     // IN: none
     // Returns: id: int
     // ***************************************************** 
        public double getGrossPay() {
      	  	return getRegularPay() + getOvertimePay();
  	       }
 	// ********** mutators **********

 }  // end class