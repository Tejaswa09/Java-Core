class Characters{
	public static void main(String args[]){
		char characters[]={'A','B','C','D','E','F','G','H','I','J'};
		System.out.println("The total number of CHARACTERS available is "+characters.length);
		//System.out.println(characters[0]+" "+characters[1]+" "+characters[2]+" "+characters[3]+" "+characters[4]+" "+characters[5]+" "+characters[6]+" "+characters[7]+" "+characters[8]+" "+characters[9]);
		for (char character:characters){
			System.out.println(character);
		}
	}
}