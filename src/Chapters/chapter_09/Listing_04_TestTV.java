package Chapters.chapter_09;

public class Listing_04_TestTV {
    public static void main(String[] args) {
        Listing_03_TV tv1 = new Listing_03_TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);

        Listing_03_TV tv2 = new Listing_03_TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel +
                " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel +
                " and volume level is " + tv2.volumeLevel);
    }
    }
