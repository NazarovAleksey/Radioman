package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldIncreaseChannel() {
        Radio radio = new Radio();
        radio.setMaxChannels(9);
        radio.setMinChannels(0);
        radio.setCurrentRadioStation(8);
        radio.nextRadiostation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseChannelMoreMax() {
        Radio radio = new Radio();
        radio.setMaxChannels(9);
        radio.setMinChannels(0);
        radio.setCurrentRadioStation(9);
        radio.nextRadiostation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseChannel2() {
        Radio radio = new Radio();
        radio.setMaxChannels(9);
        radio.setMinChannels(0);
        radio.setCurrentRadioStation(5);
        radio.prevRadiostation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseChannelMoreMin() {
        Radio radio = new Radio();
        radio.setMaxChannels(9);
        radio.setMinChannels(0);
        radio.setCurrentRadioStation(0);
        radio.prevRadiostation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}