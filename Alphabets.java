class Alphabets{
	public static void main(String args[]){
		englishCharacters();
	}
	public static void englishCharacters(){
		char characters[]={'I','J','K','L','M','N','O','P','Q','R'};
		System.out.println("The total number of CHARACTERS available is "+characters.length);
		for (char character:characters){
			System.out.println(character);
		}
	}
}