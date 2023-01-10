public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio(int minStation, int maxStation, int currentStation, int currentVolume, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}