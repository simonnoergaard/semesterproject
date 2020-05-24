import java.util.Date;
//This class is used to store data from the database in a Java structure
public class Photovoltaic extends Measurement{

	private float current;
	private float voltage;
	private float irradiance;
	private float resistance;
	private float power;
	private float efficency;
	
	public Photovoltaic (Date time, float current, float voltage, float irradiance,
			float resistance, float power, float efficency) {
		super(time);
		this.current=current;
		this.voltage=voltage;
		this.irradiance=irradiance;
		this.resistance=resistance;
		this.power=power;
		this.efficency=efficency;
	}
	
	public float getCurrent()  {
		return current;
	}
	
	public void setCurrent(float current) {
		this.current=current;
	}
	
	public float getVoltage() {
		return voltage;
	}
	
	public void setVoltage (float voltage) {
		this.voltage=voltage;
	}
	
	public float getIrradiance() {
		return irradiance;
	}
	
	public void setIrradiance(float irradiance) {
		this.irradiance=irradiance;
	}
	
	public float getresistance()  {
		return resistance;
	}
	
	public void setResistance(float resistance) {
		this.resistance=resistance;
	}
	
	public float getPower()  {
		return power;
	}
	
	public void setPower(float power) {
		this.power=power;
	}
	
	public float getEfficency()  {
		return current;
	}
	
	public void setEfficency(float efficency) {
		this.efficency=efficency;
	}
	
	public String toString() {
		return super.toString() + "Photovoltaic [current=" +  current + 
				", voltage=" + voltage +
				", irradiance=" + irradiance +
				", resistance=" + resistance +
				", power=" + power +
				", efficency=" + efficency +"]";
	}
	
	
	
}
