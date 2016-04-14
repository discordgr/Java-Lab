import java.io.*;
import java.util.*;

public class StoreFileR {

	private ArrayList <Item> StoreProducts = new ArrayList<Item>();

	public void loadFile(String data){

		int counter = 0;

		File f = null;
		BufferedReader reader = null;
		Item product = null;
		String line;

		try{
			f = new File(data);
		}
		catch (NullPointerException e){
			System.err.println ("File not found.");
		}

		try{
			reader = new BufferedReader(new FileReader(f));
		}
		catch (FileNotFoundException e ){
			System.err.println("Error opening file!");
		}

		try	
		{
			while ( (line = reader.readLine()) != null )
			{
				StringTokenizer st = new StringTokenizer(line,"#");
				String token = st.nextToken();
				if ( token.equals("CD") )
				{
					product = new CD();
					product.setTitle(st.nextToken());
					((CD) product).setArtist(st.nextToken());
					((CD) product).setNumberOfTracks(Integer.parseInt(st.nextToken()));
					product.setplayingTime(Integer.parseInt(st.nextToken()));
					product.setPrice(Float.parseFloat(st.nextToken()));
					StoreProducts.add(product);
				}
				else
				{
					product = new DVD();
					product.setTitle(st.nextToken());
					((DVD) product).setDirector(st.nextToken());
					((DVD) product).setStar(st.nextToken());
					product.setplayingTime(Integer.parseInt(st.nextToken()));
					product.setPrice(Float.parseFloat(st.nextToken()));
					StoreProducts.add(product);
				}
				counter++;
				
			}
			

		}
		catch (IOException e)
		{
			System.err.println("Error reading line " + counter + ".");
		}

		try 
		{
			reader.close();
		}
		catch (IOException e)
		{
			System.err.println("Error closing file.");
		}
	}


	public Item get(int i)
	{
		return StoreProducts.get(i);
	}


	public int size()	
	{
		return StoreProducts.size();
	}



}

