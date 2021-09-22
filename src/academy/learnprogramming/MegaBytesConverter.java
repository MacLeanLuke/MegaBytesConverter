package academy.learnprogramming;

public class MegaBytesConverter {
    // write a method called printMegaBytesAndKilBytes that has 1 parameter of type int with the name kiloBytes
    // the method should not return anything(void)
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter
        int remainingKiloBytes = kiloBytes % 1024;
        int megaBytes = kiloBytes / 1024;
        // then it needs to print a message in the format "xx KB = MB and ZZ KB".
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = "+ megaBytes +" MB and "+ remainingKiloBytes +" KB");
        }
    }
}