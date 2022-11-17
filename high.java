//Shon malka 205519317 + Tzach Ofir 208062943
package AssignmentOne;
import java.io.*;
import java.util.Scanner;

public class high {
    private int maxHeight;

    public int getMaxHeight() {
        return maxHeight;
    }
    public high(int h){
        this.maxHeight=h;
    }
    int spot=1;
    public synchronized void TheBigPumpkin(pumpkin p){
        if (spot==1) {
            System.out.println(p.GetpumpID() + " is the Winner: Max height");
            spot++;
        }
        else {
            System.out.println(p.GetpumpID() + " is on " + spot + " place.");
            spot++;
        }
    }
}
