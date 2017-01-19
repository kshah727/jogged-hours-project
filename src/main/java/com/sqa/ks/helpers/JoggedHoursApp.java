/**
 * File Name: JoggedHoursApp.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 18, 2017
 */
package com.sqa.ks.helpers;

public class JoggedHoursApp {

	private static int averageJoggedHours;

	private static int total7;

	public static void main(String[] args) {
		String appName = "Hello Jogger";
		String userName = AppBasics.greetUserandGetName(appName);
		calcHoursJogged();
		AppBasics.farewellUser(userName, appName);
	}

	private static void calcHoursJogged() {
		// TODO Auto-generated method stub
		int totalJoggedHours = 0;
		int day1NumHours;
		int day2NumHours;
		int day3NumHours;
		int day4NumHours;
		int day5NumHours;
		int day6NumHours;
		int day7NumHours;
		String hours = AppBasics.requestInfoFromUser("How many hours did you jog on Day 1");
		day1NumHours = Integer.parseInt(hours);
		int total1 = day1NumHours;
		String hoursday1 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 2");
		day2NumHours = Integer.parseInt(hoursday1);
		int total2 = day2NumHours + day1NumHours;
		String hoursday3 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 3");
		day3NumHours = Integer.parseInt(hoursday3);
		int total3 = day3NumHours + total2;
		String hoursday4 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 4");
		day4NumHours = Integer.parseInt(hoursday4);
		int total4 = day4NumHours + total3;
		String hoursday5 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 5");
		day5NumHours = Integer.parseInt(hoursday5);
		int total5 = day5NumHours + total4;
		String hoursday6 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 6");
		day6NumHours = Integer.parseInt(hoursday6);
		int total6 = day6NumHours + total5;
		String hoursday7 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 7");
		day7NumHours = Integer.parseInt(hoursday7);
		int total7 = day7NumHours + total6;
		System.out.println("You ran a total of " + total7 + " hours this week");
		System.out.println("You ran an average of " + (total7 / 7) + " hours this week");
		if (total7 < 10) {
			System.out.println("You are an Amateur Jogger");
		} else if (total7 < 20) {
			System.out.println("You are an Dedicated Jogger");
		} else if (total7 < 30) {
			System.out.println(" You are an Advanced Jogger ");
		} else {
			System.out.println(" You are a Premium Jogger Jogger ");
		}
	}
}
