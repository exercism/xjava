import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bookstore{

	private int bookPrice, maxGroupSize;
	private double discountIncrement;
	private List<Integer> books;
	private static double[] discount_tiers = {0,5,10,20,25};   	

	public Bookstore (List<Integer> books){
		this.books = books;
		this.bookPrice = 8;
		this.maxGroupSize = 5;
	        this.discountIncrement = 0.05;
	}	
	



	public double calculateTotalCost(){
		return calculateTotalCost(this.books,0);
	}

	private double calculateTotalCost (List<Integer> books,double priceSoFar ){
		double minPrice = Double.MAX_VALUE;


		if(books.size() == 0){
			return priceSoFar;
		}

		List<Integer> groups = (ArrayList<Integer>) books.stream().distinct().collect(Collectors.toList());

		
		double price = 0;

		for(int i = 0;i<groups.size();i++){
			books.remove(groups.get(i));	
		}
				
		try {
			price = calculateTotalCost(books,priceSoFar + costPerGroup(groups.size()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		minPrice = Math.min(minPrice, price);
		return minPrice;


	}

	private double costPerGroup(int groupSize) throws Exception{
		if (groupSize < 1 || groupSize > maxGroupSize){
        		throw new Exception("Invalid group size : " + groupSize );
     		}
    		return bookPrice * groupSize * (100 - discount_tiers[groupSize-1])/100;
	}


}
