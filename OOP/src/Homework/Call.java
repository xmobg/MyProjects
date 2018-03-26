package Homework;

public class Call {
	static double priceForAMinute=0.20;
	private GSM caller;
	private GSM receiver;
	private double duration;
		Call(GSM caller,GSM receiver,double duration){
			this.caller=caller;
			this.receiver=receiver;
			this.duration=duration;
		}
		public void setDuration(double duration){
			duration=duration/60;
			this.duration=duration;
		}
		public double getDuration() {
			if(duration>=120&&duration<=0) {
				return duration/60;
			}else {
				return 0;
			}
		}
		public void setCaller(GSM caller) {
			this.caller=caller;
		}
		public void setReceiver(GSM receiver ) {
			this.receiver=receiver;
		}
		public GSM getCaller() {
			return caller;
		}
		public GSM getReceiver() {
			return receiver;
		}
		public double getSumForCall() {
			return duration=(duration*priceForAMinute)/60;
		}
		
}
