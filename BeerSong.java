package assignment2;

public class BeerSong{

	public static void Ninety_Nine_Bottles_of_Beer(){
		int beerNum = 99;
		String word = "bottles";

		while(beerNum > 0){
			System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
			System.out.println("take one down, pass it around, ");

			beerNum = beerNum - 1;

			if(beerNum == 1){
				word = "bottle";
			}
			if(beerNum > 0){
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			}
			else{
				System.out.println("No more bottles of beer on the wall.");
			}
		}
	}
	
	public static void main(String[] args){
		Ninety_Nine_Bottles_of_Beer();
	}
}
