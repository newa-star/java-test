package person;

public class Faculty extends Employee {
	private float worktime;
	private String tier;
	
	public Faculty() {
		
	}
	public float getWorktime() {
		return worktime;
	}
	public void setWorktime(float worktime) {
		this.worktime = worktime;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String toString() {
		String str = "Faculty"+" "+ super.getName();
		return str;
	}
}
