class Person
{
	private String name;
	private int age;
	private double weight;
	private double bp; // blood pressure
	private double bh; // body heat
	private double bs; // blood sugar
	private double pulse; // 맥박
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBp() {
		return bp;
	}

	public void setBp(double bp) {
		this.bp = bp;
	}

	public double getBh() {
		return bh;
	}

	public void setBh(double bh) {
		this.bh = bh;
	}

	public double getBs() {
		return bs;
	}

	public void setBs(double bs) {
		this.bs = bs;
	}

	public double getPulse() {
		return pulse;
	}

	public void setPulse(double pulse) {
		this.pulse = pulse;
	}

	public void eat()
	{
		System.out.println("식사: 체중증가, 혈당증가, 혈압증가");
		setWeight(getWeight() + 0.1);
		setBs(getBs() + 20);
		setBp(getBp() + 10);
	}
	
	public void exercise()
	{
		System.out.println("운동: 체중감소, 체온증가, 혈당감소, 맥박증가");
		setWeight(getWeight() - 0.1);
		setBh(getBh() + 0.1);
		setBs(getBs() - 0.1);
		setPulse(getPulse() + 10);
	}
	
	public void birthday()
	{
		setAge(getAge() + 1);
	}
	
	public void desc()
	{
		System.out.println("성명: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("몸무게: " + getWeight());
		System.out.println("혈압: " + getBp());
		System.out.println("체온: " + getBh());
		System.out.println("혈당: " + getBs());
		System.out.println("맥박: " + getPulse());
		System.out.println("");
	}
}

public class PersonMain {
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setName("황어준");
		p1.setAge(25);
		p1.setWeight(65.0);
		p1.setBp(90);
		p1.setBh(37.0);
		p1.setBs(100);
		p1.setPulse(65);
		p1.desc();
		
		p1.exercise();
		p1.desc();
		
		p1.eat();
		p1.desc();
		
	}
}
