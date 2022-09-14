package org.example.chapter04;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        } else {

            //1 MB = 1024 KB
            int rate = 1024;

            //to calculate the megabytes and remaining kilobytes from the kilobytes parameter
            int megabytes = kiloBytes / rate;
            int remaining = kiloBytes - (megabytes * rate);

            /*
            "XX KB = YY MB and ZZ KB".
            XX represents the original value kiloBytes.
            YY represents the calculated megabytes.
            ZZ represents the calculated remaining kilobytes.
             */
            System.out.println(kiloBytes + "KB = " + megabytes + " MB and " + remaining + " KB");
        }
    }

}
