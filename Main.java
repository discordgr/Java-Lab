
class MainFileR
{

	public static void main(String[] args)
	{
		StoreFileR Product = new StoreFileR();
		Product.loadFile("products.txt");
		for (int i = 0; i<Product.size(); i++)
		{
			Product.get(i).print();
			System.out.println();   // Gia enallagi grammis
		}
		


	}
}
