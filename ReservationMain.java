
import java.util.Scanner;

class Reservation
{
	private String date; // 예약일
	private String no; // 예약인원
	private String resvName; // 예약자 이름
	private String resvPhone; // 예약자 연락처
	private String condition; // 상태
	
	
	
	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getNo() {
		return no;
	}



	public void setNo(String no) {
		this.no = no;
	}



	public String getResvName() {
		return resvName;
	}



	public void setResvName(String resvName) {
		this.resvName = resvName;
	}



	public String getResvPhone() {
		return resvPhone;
	}



	public void setResvPhone(String resvPhone) {
		this.resvPhone = resvPhone;
	}



	public String getCondition() {
		return condition;
	}



	public void setCondition(String condition) {
		this.condition = condition;
	}



	public void reserve()
	{
		String name;
		String phone;
		String no;
		String date;
		Scanner scan = new Scanner(System.in);
		System.out.println("예약자 성함을 입력하세요.");
		name = scan.nextLine();
		setResvName(name);
		System.out.println("예약자 연락처를 입력하세요.");
		phone = scan.nextLine();
		setResvPhone(phone);
		System.out.println("예약인원을 입력하세요.");
		no = scan.nextLine();
		setNo(no);
		System.out.println("예약일을  입력하세요. YYYY-MM-DD-HH-mm");
		System.out.println("EX: 2019-02-09-18-00");
		date = scan.nextLine();
		setDate(date);
		setCondition("예약완료");
	}
	
	public void reserveChange()
	{
		System.out.println("예약을 변경합니다.");
		reserve();
	}
	
	public void reserveCancel()
	{
		System.out.println("예약을 취소합니다.");
		setCondition("예약취소");
	}
	
	public void reserveCheck()
	{
		System.out.println("예약자: "+ getResvName());
		System.out.println("예약일: "+ getDate());
		System.out.println("예약인원: "+ getNo());
		System.out.println("상태: "+ getCondition());
		System.out.println("연락처: "+ getResvPhone());
		System.out.println("");
	}
}


public class ReservationMain {
	public static void main(String[] args)
	{
		Reservation r1 = new Reservation();
		r1.reserve();
		r1.reserveCancel();
		r1.reserveCheck();
		r1.reserveChange();
		r1.reserveCheck();
	}
}
