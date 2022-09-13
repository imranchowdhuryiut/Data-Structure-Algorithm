package leetcode;

public class DesignParkingSystem {
	
	int big = 0;
	int medium = 0;
	int small = 0;
    
    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        		if (carType == 1) {
			if (big == 0) {
				return false;
			} else {
				big--;
				return true;
			}
		}
		if (carType == 2) {
			if (medium == 0) {
				return false;
			} else {
				medium--;
				return true;
			}
		}
		if (carType == 3) {
			if (small == 0) {
				return false;
			} else {
				small--;
				return true;
			}
		}
		return false;

    }
	
}
