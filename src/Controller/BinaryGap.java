package Controller;

/**
 *
 * @author Sumburane
 */
public class BinaryGap {

    public int calculaZeros(int array[], int i, int posAtual, int result) {

        if (array.length - 1 == i || array.length == 0) {
            return result;
        } else {
            if (array[i] == 0) {
                posAtual++;
                return this.calculaZeros(array, i++, posAtual, result);
            } else if (posAtual > result) {
                result = posAtual;
                return this.calculaZeros(array, i++, posAtual, result);
            }
        }

        return 0;

    }

    public int  recebeArray(int array[]) {

        return this.calculaZeros(array, 0, 0, 0);

    }

}
