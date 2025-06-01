package com.Interface;

interface Notifier{
	void send(String message);
}


public class NotificationApp {

	public static void main(String[] args) {
 
		Notifier emailNotifier = (message) -> {
			
			System.out.println("Sending email with message :" + message);
		};
		
		emailNotifier.send("Welcome to Kodewala");
		
		Notifier    smsNotifier =(message) -> {
			System.out.println("Sending sms with message : " + message);
		};
		
		
		smsNotifier.send("Your OTP 564687");
		
	}

}
