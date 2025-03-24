class Levis{

		static String materialType= "cotton";
		static  id = 18;
		static String length ="Long Length";
		static  style="classic";
	public static void main(String args[]){

		System.out.println("Material Type "+materialType);
		System.out.println("id "+id);
		System.out.println("length "+length);
		System.out.println("style "+style);

		 materialType= "Lather";
		 id = 20;
		 length ="Short Length";
		 style="classic";

		 updateLevis();
		
		 System.out.println("Material Type "+materialType);
		System.out.println("id "+id);
		System.out.println("length "+length);
		System.out.println("style "+style);
		
		
	}
	public static void updateLevis(){
		materialType= "Lather";
		 id = 20;
		 length ="Short Length";
		 style="classic";
	}
}