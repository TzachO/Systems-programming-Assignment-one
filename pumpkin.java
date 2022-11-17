//Shon malka 205519317 + Tzach Ofir 208062943
package AssignmentOne;
import java.util.Random;

public class pumpkin implements Runnable {
    private final String pumpID;
    private int height;
    private high high;
    public void setHeight(int height) {
        this.height = height;
    }
    public pumpkin(String pumpID, high h){
        this.pumpID=pumpID;
        this.height=0;
        this.high=h;
    }
    public String GetpumpID() {
        return pumpID;
    }
    @Override
    public void run()  {
        while (this.height<this.high.getMaxHeight())
            try {
                Thread.sleep(2000);
                Random rn = new Random();
                setHeight(this.height + rn.nextInt(10));
                if (this.high.getMaxHeight()-this.height>0)
                System.out.println(this.GetpumpID()+" has "+(this.high.getMaxHeight()-this.height)+" centimeters to max height");
                else
                    System.out.println(this.GetpumpID()+" has reached max height!");
            }
        catch (InterruptedException ex) {
                throw new RuntimeException(ex);
        }
        this.high.TheBigPumpkin(this);
    }
}
