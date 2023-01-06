public class MainProgram
{
  public static void main(String[] args) {
		Lazada Lazada_item1, Lazada_item2;
		Item_1 iteminfo1=new Item_1("zaratops",150,"This product is sold out");
		Item_2 iteminfo2=new Item_2("zaratops",100,"This product is sold out");

		shopee_item1=iteminfo1;
		System.out.println(Lazada_item1.item_info());
		System.out.println("\nProduct name: "+ Lazada_item1.getProductName());
		System.out.println("Item price: "+Lazada_item1.getPrice());
		System.out.println("item info: "+iteminfo1.getItemInfo());	

		shopee_item2=iteminfo2;
		System.out.println(Lazada_item2.item_info());
		System.out.println("\nProduct name: "+ Lazada_item2.getProductName());
		System.out.println("Item price: "+Lazada_item2.getPrice());
		System.out.println("item info: "+iteminfo2.getItemInfo());	
	}
}
