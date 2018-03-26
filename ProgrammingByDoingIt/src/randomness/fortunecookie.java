package randomness;

import java.util.Random;

public class fortunecookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random x =new Random();
		int cookie=1+x.nextInt(10);
		int lotto=1+x.nextInt(54);
		String response="";
		if(cookie==1) {
			response="Hard work pays off in the future, laziness pays off now.";
		}
		else if(cookie==2) {
			response="Today it's up to you to create the peacefulness you long for.";
		}
		else if(cookie==3) {
			response="A friend asks only for your time not your money.";
		}
		else if(cookie==4) {
			response="Today it's up to you to create the peacefulness you long for.";
		}
		else if(cookie==5) {
			response="People are naturally attracted to you.";
		}
		else if(cookie==6) {
			response="A chance meeting opens new doors to success and friendship.";
		}
		else if(cookie==7) {
			response="You learn from your mistakes... You will learn a lot today.";
		}
		else if(cookie==8) {
			response="If you have something good in your life, don't let it go!";
		}
		else if(cookie==9) {
			response="Your shoes will make you happy today.";
		}
		else if(cookie==10) {
			response="You cannot love life until you live the life you love.";
		}
		System.out.println("Fortune cookie says: " +response);
		System.out.println(x.nextInt(54)+"-"+x.nextInt(54)+"-"+x.nextInt(54)+"-"+x.nextInt(54)+"-"+x.nextInt(54)+"-"+x.nextInt(54));
		
	}

}
