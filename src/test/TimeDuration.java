package test;


class TimeDuration {
	
	int secondsGet;
	
	public TimeDuration(int seconds) {
		try {
			if (seconds < 0) {throw new BadBadValueException();} // if seconds is negative, exception
			} catch (BadBadValueException b) {
			} finally {
			System.out.println("Oh, positve value ! Great");
			}
			
		}
	
	//converts seconds into hours, minutes & seconds
	public String toString() {
		
		String format = null;
		
		final int MINUTES_IN_AN_HOUR = 60;
	    final int SECONDS_IN_A_MINUTE = 60;

	    int seconds = secondsGet % SECONDS_IN_A_MINUTE;
	    int totalMinutes = secondsGet / SECONDS_IN_A_MINUTE;
	    int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
	    int hours = totalMinutes / MINUTES_IN_AN_HOUR;
	    
	    if (secondsGet < 60)  format = seconds + "s";
	    if (secondsGet >= 60 && secondsGet <= 3600) format = minutes + "m " + seconds + "s";
	    if (secondsGet > 3600) format =  hours + "h " + minutes + "m " + seconds + "s";
	    System.out.println(format);
	    
	    return format;
		}
	
	
	public static void main(String[] args) {
		
	int a = 3600;
	String test = null;
	
	test = new TimeDuration(a).toString();
	
	
	}


}


