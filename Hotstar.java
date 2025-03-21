class Hotstar{
	public static void main(String args[]){
		System.out.println("Starting main");
		hindi();
		english();
		kannada();
		malyalam();
		System.out.println("end of main");
	}
	public static void hindi(){
		System.out.println("start of hindi");
		String hindiSeries[]={"Sacred Games","Mirzapur","Scam 1992: The Harshad Mehta Story","The Family Man","Aspirants","Criminal Justice"," Breathe","Panchayat","Paatal Lok","Special OPS"};
		System.out.println("The total number of Hindi series available is "+hindiSeries.length);
		for (String hindiSerie:hindiSeries){
			System.out.println(hindiSerie);
		}
		System.out.println("end of hindi");
		System.out.println("");
	}
	public static void english(){
		System.out.println("start of english");
		String englishSeries[]={"Game of Thrones","Breaking Bad","Stranger Things","Friends","The Walking Dead","Sherlock"," The Big Bang Theory","Dexter","The Office","The Boys"};
		System.out.println("The total number of english series available is "+englishSeries.length);
		for(String englishSerie:englishSeries){
			System.out.println(englishSerie);
		}
		System.out.println("end of english");
		System.out.println("");
	}
	public static void kannada(){
		System.out.println("start of kannada");
		String kannadaSeries[]={"Suzhal - The Vortex","Unlock- The Haunted App","Love Under Construction","The 'Other' Love Story","The Hunt for Veerappan","Crime Stories: India Detectives"," Nandhini","Bigg Boss Kannada"," Honeymoon","Game"};
		System.out.println("The total number of kannada series available is "+kannadaSeries.length);
		for (String kannadaSerie:kannadaSeries){
			System.out.println(kannadaSerie);
		}
		System.out.println("end of kannada");
		System.out.println("");
	}
	public static void malyalam(){
		System.out.println("start of malyalam");
		String malyalamSeries[]={"Suzhal - The Vortex","Unmadham","1000 Babies","Kaalkoot"," Poacher","Perilloor Premier League"," Soul Stories","Love Under Construction","Selinte Tuition Class","Idiyappam"};
		System.out.println("The total number of malyalam series available is "+malyalamSeries.length);
		for(String malyalamSerie:malyalamSeries){
			System.out.println(malyalamSerie);
		}
		System.out.println("end of malyalam");
		
	}
}