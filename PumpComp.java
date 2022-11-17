//Shon malka 205519317 + Tzach Ofir 208062943
package AssignmentOne;
import java.util.Scanner;

public class PumpComp{
    public static void main(String[] args) {
        System.out.println("Please enter max height: ");
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        high maxh = new high(max);
        pumpkin One = new pumpkin("One", maxh);
        pumpkin Two = new pumpkin("Two", maxh);
        pumpkin Three = new pumpkin("Three", maxh);
        pumpkin Four = new pumpkin("Four", maxh);
        pumpkin Five = new pumpkin("Five", maxh);
        Thread one = new Thread(One);
        Thread two = new Thread(Two);
        Thread three = new Thread(Three);
        Thread four = new Thread(Four);
        Thread five = new Thread(Five);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        try {
            one.join();
            two.join();
            three.join();
            four.join();
            five.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
