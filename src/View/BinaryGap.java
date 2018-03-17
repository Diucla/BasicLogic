package View;

import Controller.BinaryGapController;
import static jdk.nashorn.internal.runtime.GlobalFunctions.parseInt;

/**
 *
 * @author Sumburane
 */
public class BinaryGap {

    public static void main(String[] args) {

        BinaryGapController controller = new BinaryGapController();

        
        int array[] = {1,0,1,0,1,0,0};   
        
        System.out.println(controller.recebeArray(array));
        
        System.out.println(parseInt(1000, 10));
    }
}
