//This class is used to store data from the database in a Java structure
public class WeatherCondition {
	
	private float temperature;
	private float cloudLevel;
	private float windLevel;
	private float rainLevel;
	
	public WeatherCondition (float temperature, float cloudLevel, float windLecvel, float rainLevel) {
		this.temperature=temperature;
		this.cloudLevel=cloudLevel;
		this.windLevel=windLevel;
		this.rainLevel=rainLevel;
	}
	
	public float getTemperature()
	{
		return temperature;
	}
	
	public void setTemperature(float temperature) 
	{
		this.temperature=temperature;
	}
	
	public float getCloudLevel()
	{
		return cloudLevel;
	}
	
	public void setCloudLevel(float cloudLevel)
	{
		this.cloudLevel=cloudLevel;
	}
	public float getWindLevel()
	{
		return windLevel;
	}
	
	public void setWindLevel(float windLevel)
	{
		this.windLevel=windLevel;
	}
	public float getRainLevel()
	{
		return rainLevel;
	}
	
	public void setRainLevel(float rainLevel)
	{
		this.rainLevel=rainLevel;
	}
	
	public String toString() {
		return  "WeatherCondition [temperature=" +  temperature + 
				", cloudLevel=" + cloudLevel +
				", windLevel=" + windLevel +
				", rainLevel=" + rainLevel +"]";
	}
	
	

}
