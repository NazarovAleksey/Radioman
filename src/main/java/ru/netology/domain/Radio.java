package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int maxChannels = 10;
    private int minChannels = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxChannels, int currentRadioStation) {
        this.maxChannels = maxChannels;
        this.currentRadioStation = currentRadioStation;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }

    public int getMaxChannels() {
        return maxChannels;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextRadiostation() {
        if (currentRadioStation >= maxChannels) {
            this.currentRadioStation = minChannels;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadiostation() {
        if (currentRadioStation <= minChannels) {
            this.currentRadioStation = maxChannels;
            return;
        }
        currentRadioStation--;
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }
}
