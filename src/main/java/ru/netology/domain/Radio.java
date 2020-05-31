package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int maxChannels;
    private int minChannels;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setMaxChannels(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public void setMinChannels(int minChannels) {
        this.minChannels = minChannels;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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
