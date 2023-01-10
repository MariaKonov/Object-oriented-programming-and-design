import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void constructorTest() {
        Radio rad = new Radio(0,9,5,60,0,100);
        rad.setCurrentStation(5);
        System.out.println(rad.getCurrentStation());

    }

    @Test
    public void shouldUseRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldUseRadio2() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void StationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void StationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();

        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void StationMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void StationMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextvolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(38);
        radio.nextVolume();

        Assertions.assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    public void nextvolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevvolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(76);
        radio.prevVolume();

        Assertions.assertEquals(75, radio.getCurrentVolume());
    }

    @Test
    public void prevvolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}