package unl.cse;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;

/**
 * Program calculates the users next birthday date and amount of days towards next birthday
 * 
 * @author dpapageorge
 *
 */
public class Birthday {public static void main(String args[]) {
		
String name = "Demetri";

int month = 5;
int date  = 10;
int year  = 2003;

DateTime bday = new DateTime(year, month, date, 0, 0);
DateTime today = new DateTime();

Period age = new Period(bday, today);

int years = age.getYears();
int months = age.getMonths();
int days = age.getWeeks() * 7 + age.getDays();

DateTime next_bday = new DateTime(year + years + 1, month, date, 0, 0);
Interval days_to_next_bday_i = new Interval(today, next_bday);
double days_remaining = days_to_next_bday_i.toDurationMillis() / (1000 * 60 * 60 * 24) + 1;

System.out.println("Hello, "+name+" Today you are "+years+" years"+ months+" months and "+days+" days old");
if (days_remaining == 0)
{
	System.out.println("HAPPY BIRTHDAY");
}
else
{
	System.out.println("Your friends have "+days_remaining+"days to get you a birthday present");
}
}
}
