package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {
    @Test
    public void testMaxChannels() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxChannels());
    }

    @Test
    public void testAllArgsConstructor() {
        Radio radio = new Radio(9, 10, 0, 0, 100, 0);
        radio.nextRadiostation();
        radio.volumeUp();
        assertEquals(10, radio.getMaxChannels());
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseChannel() {
        Radio radio = new Radio(10, 8);
        radio.nextRadiostation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseChannelMoreMax() {
        Radio radio = new Radio(10, 10);
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseChannel2() {
        Radio radio = new Radio(10,5);
        radio.prevRadiostation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseChannelMoreMin() {
        Radio radio = new Radio(10,0);
        radio.prevRadiostation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(9);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio(1);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        Radio radio = new Radio(100);
        radio.volumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        Radio radio = new Radio(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}