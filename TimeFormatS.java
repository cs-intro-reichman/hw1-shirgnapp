public class TimeFormat {
    public static void main (String [] args) 
    {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        if (hours > 12) {
            if (minutes<10) {
                System.out.println(hours-12+":0"+minutes+"PM");
            }
            else
            System.out.println(hours-12+":"+minutes+"PM");
        }
        else
        {
            if (minutes<10) {
                System.out.println("0"+hours+":0"+minutes+"AM");
            }
            else
            System.out.println("0"+hours+":"+minutes+"AM");
        }

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        if (hours >  12)
        {
            if (hours==13) {
                System.out.print("01:");
            }
            if (hours==14) {
                System.out.print("02:");  
            }
            if (hours==15) {
                System.out.print("03:");
            }
            if (hours==16) {
                System.out.print("04:");
            }
            if ((hours==17)) {
                System.out.print("05:");
            }
            if (hours==18) {
                System.out.print("06:");
            }
            if (hours==19) {
                System.out.print("07:");
            }
            if (hours==20) {
                System.out.print("08:");
            }
           if (hours==21) {
                System.out.print("09:");
           }
           if (hours==22) {
                System.out.print("10:");
           }
           if (hours==23) {
                System.out.print("11:");
           }
           if (hours==24) {
               System.out.print("12:");
           }
		   if (minutes<10) {
			System.out.print("0"+minutes+"PM");
		   }
		   else
		   {
           System.out.println(minutes+ "PM");
		   }
        }
        else
           {
			if (minutes<10) {
				System.out.print("0"+hours+":0"+minutes+"AM");
				
			}
			else
               System.out.print("0"+hours+":" + minutes+ "AM");
           }

        
    }
}
    

