
public class TooHot {

	public static String isTooHot (int temperature, boolean isSummer) {

		String outputMessage = "";
		boolean tooHot = false; 

		if (isSummer == true) {
			if (temperature >= 60 && temperature <= 100) {
				tooHot = true; 
				outputMessage = "Too hot is: " + tooHot + " and temperature is: " + temperature;
			}
			else {
				outputMessage = "Too hot is: " + tooHot + " and temperature is: " + temperature;
			}
		}
		else {
			if (temperature >= 60 && temperature <= 90) {
				tooHot = true; 
				outputMessage = "Too hot is: " + tooHot + " and temperature is: " + temperature;
			}
			else {
				outputMessage = "Too hot is: " + tooHot + " and temperature is: " + temperature;
			}
		}	

		return outputMessage; 
	}

}
