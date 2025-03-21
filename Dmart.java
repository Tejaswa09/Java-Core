class Dmart{
	public static void main(String args[]){
		grocery();
		perfume();
		biscuit();
		utensil();
		vegetables();
	}
	public static void grocery(){
		 String groceryItems[] = {"Rice", "Wheat", "Sugar", "Salt", "Tea", "Coffee", "Oil", "Lentils", "Flour", "Spices"};
		 System.out.println("The total number of Grocery items available is "+groceryItems.length);
		//System.out.println(groceryItems[0]+" \n"+groceryItems[1]+" \n"+groceryItems[2]+" \n"+groceryItems[3]+" \n"+groceryItems[4]+" \n"+groceryItems[5]+" \n"+groceryItems[6]+" \n"+groceryItems[7]+" \n"+groceryItems[8]+" \n"+groceryItems[9]);
		for (String groceryItem:groceryItems){
			System.out.println(groceryItem);
		}
		System.out.println("");
	}
	public static void perfume(){	
        String perfumeItems[] = {"Chanel", "Dior", "Gucci", "Armani", "Versace", "Hugo Boss", "Burberry", "Calvin Klein", "Tom Ford", "Paco Rabanne"};
		System.out.println("The total number of perfumes available is "+perfumeItems.length);
		//System.out.println(perfumeItems[0]+" \n"+perfumeItems[1]+" \n"+perfumeItems[2]+" \n"+perfumeItems[3]+" \n"+perfumeItems[4]+" \n"+perfumeItems[5]+" \n"+perfumeItems[6]+" \n"+perfumeItems[7]+" \n"+perfumeItems[8]+" \n"+perfumeItems[9]);
		for (String perfumeItem:perfumeItems){
			System.out.println(perfumeItem);
		}
		System.out.println("");
	}
	public static void biscuit(){
        String[] biscuitItems = {"Oreo", "Bourbon", "Hide & Seek Fab", "Good Day", "Jim Jam", "Marie Gold", "KrackJack", "Milk Bikis", "Little Debbie", "Digestive"};
		System.out.println("The total number of biscuits available is "+biscuitItems.length);
		//System.out.println(biscuitItems[0]+" \n"+biscuitItems[1]+" \n"+biscuitItems[2]+" \n"+biscuitItems[3]+" \n"+biscuitItems[4]+" \n"+biscuitItems[5]+" \n"+biscuitItems[6]+" \n"+biscuitItems[7]+" \n"+biscuitItems[8]+" \n"+biscuitItems[9]);
		for(String biscuitItem:biscuitItems){
			System.out.println(biscuitItem);
		}
		System.out.println("");
	}
	public static void utensil(){
        String[] utensilItems = {"Spoon", "Fork", "Knife", "Plate", "Bowl", "Cup", "Saucepan", "Kettle", "Ladle", "Tongs"};
		System.out.println("The total number of utensils available is "+utensilItems.length);
		//System.out.println(utensilItems[0]+" \n"+utensilItems[1]+" \n"+utensilItems[2]+" \n"+utensilItems[3]+" \n"+utensilItems[4]+" \n"+utensilItems[5]+" \n"+utensilItems[6]+" \n"+utensilItems[7]+" \n"+utensilItems[8]+" \n"+utensilItems[9]);
		for (String utensilItem:utensilItems){
			System.out.println(utensilItem);
		}
		System.out.println("");
	}
	public static void vegetables(){	
        String[] vegetableItems = {"Carrot", "Potato", "Tomato", "Onion", "Cabbage", "Cauliflower", "Spinach", "Broccoli", "Peas", "Brinjal"};
		System.out.println("The total number of vegetables available is "+vegetableItems.length);
		//System.out.println(vegetableItems[0]+" \n"+vegetableItems[1]+" \n"+vegetableItems[2]+" \n"+vegetableItems[3]+" \n"+vegetableItems[4]+" \n"+vegetableItems[5]+" \n"+vegetableItems[6]+" \n"+vegetableItems[7]+" \n"+vegetableItems[8]+" \n"+vegetableItems[9]);
		for (String vegetableItem:vegetableItems){
			System.out.println(vegetableItem);
		}
	}
}