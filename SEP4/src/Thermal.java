import java.util.Date;
//This class is used to store data from the database in a Java structure
public class Thermal extends Measurement{
	
	private float temperatureIn;
	private float temperatureOut;
	private float ambientAirTemperature;
	private float irradiance;
	private float volume;
	private float timeFrame;
	private int heatflow;
	private float heatcurrent;
	private float efficency;
	private float liquidTemperature;
	private float deltaT;
	
	
	public Thermal (Date time, float temperatureIn, float temperatureOut, float ambientAirTemperature,
			float irradiance, float volume, float timeFrame, int heatflow, float heatcurrent, float efficency,
			float liquidTemperature, float deltaT) {
		super(date,time);
		this.temperatureIn=temperatureIn;
		this.temperatureOut=temperatureOut;
		this.ambientAirTemperature=ambientAirTemperature;
		this.irradiance=irradiance;
		this.volume=volume;
		this.timeFrame=timeFrame;
		this.heatflow=heatflow;
		this.heatcurrent=heatcurrent;
		this.efficency=efficency;
		this.liquidTemperature=liquidTemperature;
		this.deltaT=deltaT;}
	
	public float gettemperatureIn() {
		return temperatureIn;
	}
	
	public void setTemperatureIn(float temperatureIn) {
		this.temperatureIn=temperatureIn;
	}
	
	public float gettemperatureOut() {
		return temperatureOut;
	}
	
	public void setTemperatureOut(float temperatureOut) {
		this.temperatureOut=temperatureOut;
	}
	
	public float getambientAirTemperature() {
		return ambientAirTemperature;
	}
	
	public void setAmbientAirTemperature(float ambientAirTemperature) {
		this.ambientAirTemperature=ambientAirTemperature;
	}
	
	public float getIrradiance() {
		return irradiance;
	}
	
	public void setIrradiance(float irradiance) {
		this.irradiance=irradiance;
	}
	
	public float getVolume() {
		return volume;
	}
	
	public void setVolume (float voltage) {
		this.volume=volume;
	}
	
	public float getTimeFrame() {
		return timeFrame;
	}
	
	public void setTime (float timeFrame) {
		this.timeFrame=timeFrame;
	}
	
	public int getHeatflow() {
		return heatflow;
	}
	
	public void setHeatflow(int heatflow) {
		this.heatflow=heatflow;
	}
	
	public float getHeatcurent() {
		return heatcurrent;
	}
	
	public void setHeatcurrent(float heatcurrent) {
		this.heatcurrent=heatcurrent;
	}

	public float getefficency() {
		return efficency;
	}
	
	public void setEfficency(float efficeny) {
		this.efficency=efficency;
	}
	
	public float getliquidTemperature() {
		return liquidTemperature;
	}
	
	public void setLiquidTemperature(float liquidTemperature) {
		this.liquidTemperature=liquidTemperature;
	}
	
	public float getdeltaT() {
		return deltaT;
	}
	
	public void setDeltaT(float deltaT) {
		this.deltaT=deltaT;
	}
	
	public String toString() {
		return super.toString() + "Thermal [temperatureIn=" + temperatureIn + ", temperatureOut=" + temperatureOut + 
				", ambientAirTemperature=" + ambientAirTemperature + 
				", irradiance=" + irradiance +
				", volume=" + volume +
				", timeFrame=" + timeFrame +
				", heatflow=" + heatflow +
				", heatcurrent=" + heatcurrent +
				", efficency=" + efficency +
				", liquidTemperature=" + liquidTemperature +
				", deltaT=" + deltaT +"]";
	}
}
