public class Melon {

	public static void main(String[] args) {
		System.out.println("melon defined");
	}

    MelonType melonType;
    int shapeRating;
    int colorRating;
    int field;
    String harvester;

	public Melon (MelonType melonType,
		   int shapeRating,
		   int colorRating,
		   int field,
		   String harvester) {
		this.melonType = melonType;
		this.shapeRating = shapeRating;
		this.colorRating = colorRating;
		this.field = field;
		this.harvester = harvester;
	}


	public boolean isSellable(int shapeRating, int colorRating, int field){
		this.shapeRating = shapeRating;
		this.colorRating = colorRating;
		this.field = field;

		if(field != 3 && colorRating > 5 && shapeRating > 5){
				return true;	
			}
		else {
			return false;
		}
	}
}	

