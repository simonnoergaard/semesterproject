import java.util.Date;
//This class is used to store data from the database in a Java structure
public abstract class Measurement {
	private Date date;
	private Time time;
	
	
	public Measurement (Date date, Time time) {
		this.date=date;
		this.time=time;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date time) {
		this.time = time;
	}
	
	public String toString() {
			return "Measurement [ time=" + time + "]";
		}
	
}
