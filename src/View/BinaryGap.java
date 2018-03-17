package View;

import Controller.BinaryGapController;

/**
 *
 * @author Sumburane
 */
public class BinaryGap {

    public static void main(String[] args) {

        BinaryGapController controller = new BinaryGapController();
        
        int array[] = {1,0,1,0,1,0,0};   
        
        System.out.println(controller.recebeArray(array));
        
    }
}
