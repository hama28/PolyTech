import java.util.*;

public class BingoMachine {

    public void bingomahine() {

        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i < 76; i++) {
            num.add(i);
        }

        for (int i = 1; i < 76; i++) {
            int set = (int)(Math.random() * num.size());
            int binNo = num.get(set);
            System.out.println(i + "‚Â–Ú‚Ì”Žš‚Í " + binNo + " ‚Å‚·");
            num.remove(set);
        }
    }

}