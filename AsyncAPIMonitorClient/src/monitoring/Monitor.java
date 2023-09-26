package monitoring;

public class Monitor {

	public Monitor(Object measureIntruments) {
		// TODO Auto-generated constructor stub
	}

	public void notifyMessageReceived(String clientIDFor, String name, String messageId, long currentTimeMillis) {
		System.out.println("Message received by " + clientIDFor);
		System.out.println("- in channel  " + name);
		System.out.println("- message ID  " + messageId);
		System.out.println("- at time " + currentTimeMillis );		
		System.out.flush();
	}

	public void notifyMessageSent(String clientIDFor, String name, String messageId, long currentTimeMillis) {
		System.out.println("Message sent by " + clientIDFor);
		System.out.println("- in channel  " + name);
		System.out.println("- message ID  " + messageId);
		System.out.println("- at time " + currentTimeMillis );		
		System.out.flush();

	}

}
