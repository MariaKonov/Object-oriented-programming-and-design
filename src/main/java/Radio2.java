public class Radio2 {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 10;

    public Radio2(int minStation, int maxStation, int currentStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}
