package ranky;

public enum tunum {
	ranky("nice","27"),
	jeniffer("cutie","12"),
	chidinma("mistake","9"),
	chioma("uturu", "2018"),
	favour("abuja", "2018"),
	abjchioma("Abuja","2018");
	
	private final String desc;
	private final String year;
	tunum (String description, String birthday){
		desc = description;
		year = birthday;
	}
	public String getDesc() {
		return desc;
	}
	public String getYear() {
		return year;
	}
}
