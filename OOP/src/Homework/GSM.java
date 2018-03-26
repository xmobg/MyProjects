package Homework;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
		GSM(String model){
			this.model=model;
		}
		public void insertSimCard(String simMobileNumber) {
			simMobileNumber="0894567892";
			if (this.simMobileNumber.startsWith("08") && simMobileNumber.length() == 10) {
				this.simMobileNumber=simMobileNumber;
				this.hasSimCard=true;
			}else {
			System.out.println("Incorrect number");
		}
			
}
		public void removeSimCard() {
			hasSimCard=false;
		}
		public void call(GSM receiver,double duration) {
			if(this.lastIncomingCall.getCaller() != receiver && duration>=120 && duration<0 ) {
				if(hasSimCard==true) {
					System.out.println("Calling,duration" +duration);
					this.outgoingCallsDuration+=duration;
				}
			}
		}
		public void printInfoForTheLastOutgoingCall() {
			System.out.println(outgoingCallsDuration);
		}
		public void printInfoForTheLastIncomingCall() {
			System.out.println(this.lastIncomingCall.getDuration());
		}
		
		
		
}