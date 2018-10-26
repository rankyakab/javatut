package ranky;

public class tuna {

	private String girlName;
	private int hour;
	private int minute;
	private int seconds;
	private String name;
	private Potpie birthday;
	
	public tuna (String theName, Potpie theDate) { 
		name = theName;
		birthday = theDate;
	}
	public String toString() {
		return String.format("my name is %s, my birthday is %s", name, birthday);
	}
	/*public tuna() {
		this(0,0,0);
	}
	public tuna(int h) {
		this(h,0,0);
	}
	public tuna(int h , int m) {
		this(h,m,0);
	}
	public tuna(int h , int m, int s) {
		setTime(h,m,s);
	}*/
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSeconds(s);
	}
	public void setHour(int h) {
		hour = ((h>=0 && h < 24 )? h : 0);
		
	}
	public void setMinute(int m) {
		minute = ((m>=0 && m < 24 )? m : 0);
		
	}
	public void setSeconds(int s) {
		seconds= ((s>=0 && s < 60 )? s : 0);
		
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSeconds() {
		return seconds;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	/*public void setTime(int h, int m, int s) {
		hour = (h >= 0 && h <= 24)? h : 0;
		minute =(m >= 0 && h <= 60)? m : 0;
		seconds = (s >= 0 && s <= 60)? s : 0;
		
	}*/
	public String toMillitary() {
		
		return String.format("%02d:%02d:%02d", hour,minute, seconds);
	}
	public String toring() {
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12),minute,seconds,(hour<12?"AM":"PM"));
		
	}
	public void simpleMessage(String name) {
		System.out.println("hello " + name);
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("your first girlfriends name was %s", getName());
	}

	
}
