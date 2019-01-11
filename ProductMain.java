import java.util.ArrayList;
import java.util.List;


class Product
{
	private int price;
	private String productName;
	private int quantity;
	List<Object> reservedQuantity = new ArrayList<Object>(); // 예약 수량  ; ArrayList를 활용해 동적 배열

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void sell(int quant)
	{
		int pre_quant = getQuantity();
		int after_sell = pre_quant - quant;
		setQuantity(after_sell);
		System.out.println(quant + "개를 팔았습니다.");
		System.out.println("");
	}
	
	public void buy (int quant)
	{
		int pre_quant = getQuantity();
		int after_buy = pre_quant + quant;
		setQuantity(after_buy);
		System.out.println(quant + "개를 입고했습니다.");
		System.out.println("");
	}
	
	public void reserve (int quant)
	{
		reservedQuantity.add(quant); // 예약 수량 추가
		int pre_quant = getQuantity();
		int after_reserve = pre_quant - quant;
		setQuantity(after_reserve);
		
		// 예약 배열 출력
		System.out.println("예약배열출력");
		for (int i=0; i<reservedQuantity.size(); i++)
		{
			System.out.format("[%d] = %s%n", i, reservedQuantity.get(i));
		}
	}
	
	public Product(String name) {
		super();
		this.productName = name;
	}
	
	public void desc()
	{
		System.out.println("상품명:" + getProductName());
		System.out.println("가격:" + getPrice());
		System.out.println("재고:" + getQuantity());
		System.out.println("");
	}
}




public class ProductMain {
	public static void main(String[] args) {
		Product pr1 = new Product("가습기");
		pr1.setPrice(18000);
		pr1.setQuantity(1000);
		pr1.desc();
		
		pr1.sell(100);
		pr1.desc();
		
		pr1.buy(200);
		pr1.desc();
		
		pr1.reserve(500);
		pr1.desc();
		

	}
}
