import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            System.out.println(readString);
    
            if (readString.isEmpty()) {
                System.out.println("Read Enter Key.");
            }
    
            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }
        }
        
        /*
        Scanner input = new Scanner(System.in);
        String s = null;
        while ( true ) {
            s = input.nextLine();
            if( !s.equals("\\n") ) 
                break;
        }
        */
    }
}