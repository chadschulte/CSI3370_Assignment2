package assignment2;

public class BeerSong{

	public static void Ninety_Nine_Bottles_of_Beer(){
		int beerNum = 99;
		String word = "bottles";

		while(beerNum > 0){
			System.out.println(beerNum + " " + word + " of 
beer on the wall, " + beerNum + " " + word + " of beer");
			System.out.println("take one down, pass it 
around, ");

			beerNum = beerNum - 1;
		}
	}
	
	public static void main(String[] args){

	}
}
