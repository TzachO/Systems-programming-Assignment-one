//Shon malka 205519317 + Tzach Ofir 208062943
package AssignmentOne;
import java.io.*;
import java.util.ArrayList;

public class part_1 {
    public static void main(String[] args) {
        //we use file reader and file writer for i/o on files
        PrintWriter outNew;
        ArrayList<String> league1;
        ArrayList<String> league2;
        ArrayList<String> league3;
        ArrayList<String> league4;
        try {
            FileReader in = new FileReader("teams.txt");
            BufferedReader inNew = new BufferedReader(in);
            FileWriter out = new FileWriter("rank.txt");
            outNew = new PrintWriter(out);
            //here we allocate a new array for each league to simplify handling and segmentation
            league1 = new ArrayList<String>();
            league2 = new ArrayList<String>();
            league3 = new ArrayList<String>();
            league4 = new ArrayList<String>();
            String read_line = " ";
            //exit condition is null new line, here we read each line and allocate league according to rank number
            while (true) {
                read_line = inNew.readLine();
                if (read_line == null)
                    break;
                else {
                    //we also remove last char since it is the rank number,we only need it in the beginning,so we insert it as a standalone char per league
                    if (read_line.charAt(read_line.length() - 1) == '1') {
                        read_line = read_line.substring(0, read_line.length() - 1);
                        league1.add(read_line);
                    }
                    if (read_line.charAt(read_line.length() - 1) == '2') {
                        read_line = read_line.substring(0, read_line.length() - 1);
                        league2.add(read_line);
                    }
                    if (read_line.charAt(read_line.length() - 1) == '3') {
                        read_line = read_line.substring(0, read_line.length() - 1);
                        league3.add(read_line);
                    }
                    if (read_line.charAt(read_line.length() - 1) == '4') {
                        read_line = read_line.substring(0, read_line.length() - 1);
                        league4.add(read_line);
                    }
                }
            }
            //here we insert to rank according to entries in each league array
        outNew.print("1 ");
            for (String s : league1) {
                outNew.print(s);
            }
        outNew.println();
        outNew.print("2 ");
            for (String s : league2) {
                outNew.print(s);
            }
        outNew.println();
        outNew.print("3 ");
            for (String s : league3) {
                outNew.print(s);
            }
        outNew.println();
        outNew.print("4 ");
            for (String s : league4) {
                outNew.print(s);
            }
        outNew.println();
        outNew.close();
        out.close();
        in.close();
        inNew.close();
    }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
