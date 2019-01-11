class Typhoon
{
	private String name;
	static int noOfTyphoon = 1;
	private int no;
	private double[] loc = new double[2]; // 위도, 경도
	private double speed; 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	public void setNo() {
		this.no = noOfTyphoon++;
	}
	
	public double[] getLoc() {
		return loc;
	}
	public void setLoc(double lat, double lon) {
		this.loc[0] = lat;
		this.loc[1] = lon;
	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	public void move(double lat, double lon)
	{
		loc[0] = lat;
		loc[1] = lon;
		System.out.println("위도:"+ lat + " 경도:"+ lon +"로 이동");
	}	
	
	public Typhoon(String name) {
		super();
		this.name = name;
	}
	
	public void desc()
	{
		System.out.println("태풍명:" + getName());
		System.out.println("태풍번호:" + getNo());
		System.out.println("태풍위치:" + getLoc()[0] + "," + getLoc()[1]);
		System.out.println("태풍속도:" + getSpeed());
		System.out.println("");
	}
}


public class TyphoonMain {
	public static void main(String[] args){
		Typhoon tp1 = new Typhoon("매미");
		tp1.setNo();
		tp1.setLoc(12.0, 13.0);
		tp1.setSpeed(200);
		tp1.desc();
		
		tp1.move(12.1, 13.1);
		tp1.desc();
		
		Typhoon tp2 = new Typhoon("볼라벤");
		tp2.setNo();
		tp2.desc();
		
	}
}
