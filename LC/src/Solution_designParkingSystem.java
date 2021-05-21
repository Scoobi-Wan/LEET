
public class Solution_designParkingSystem {
	int bigSpots;
    int medSpots;
    int smallSpots;

    public Solution_designParkingSystem(int big, int medium, int small) {
        this.bigSpots = big;
        this.medSpots = medium;
        this.smallSpots = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && bigSpots > 0) {
            bigSpots--;
            return true;
        } else if (carType == 2 && medSpots > 0) {
            medSpots--;
            return true;
        } else if (carType == 3 && smallSpots > 0) {
            smallSpots--;
            return true;
        } else {
            return false;
        }
    }
}
