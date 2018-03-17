package Controller;

/**
 *
 * @author Sumburane
 */
public class BinaryGapController {

    public int calculaZeros(int array[], int i, int posAtual, int result) {
        if (array.length == i || array.length == 0) {
            
            if (posAtual > result) 
                result = posAtual;
            
            return result;
        } else {
            if (array[i] == 0) {
                posAtual++;
                return this.calculaZeros(array, ++i, posAtual, result);
            } else {
                if (posAtual >= result) {
                    result = posAtual;
                    posAtual = 0;
                }
                return this.calculaZeros(array, ++i, posAtual, result);
            }
        }
    }

    public int recebeArray(int array[]) {

        return this.calculaZeros(array, 0, 0, 0);

    }

}
