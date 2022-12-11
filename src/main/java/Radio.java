public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    public int maxVolume = 100;
    public int minVolume = 0;


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
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = minVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void prevVolumeOverMin() {
        if (currentVolume < maxVolume) {
            currentVolume = minVolume;
        }
    }

    public void nextVolumeOverMax() {
        if (currentVolume > minVolume) {
            currentVolume = maxVolume;
        }
    }
}