package demo;

public class DesiDog extends Dog {
	
	private String placeString;

	DesiDog(String breed, String place) {
		super(breed);
		this.placeString = place;
	}
	
	public void run() {
		category  = "mamal";
	}
	
	public String getBreed() {
		return super.breed;
	}

}
