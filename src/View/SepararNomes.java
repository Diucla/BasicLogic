package View;

/**
 *
 * @author Sumburane
 */
public class SepararNomes {

    public static void teste(String nome, int limite) {
        String arrayNome[];
        int sobreNomes,soma = 0;
        
        arrayNome = nome.split(" ");
                      
        if (nome.length() <= limite) 
            System.out.println(nome);
        else         
        {
            if(arrayNome[0].length() > limite){
                System.out.println(arrayNome[0].charAt(0)+".");
            }else{          
                for (int i = 0; i < arrayNome.length; i++) {
                    
                    soma += arrayNome[i].length();
                    
                    
                }                
                System.out.println(soma);
                System.out.println(nome.length());
            }
        }
    }

    public static void main(String[] args) {
        teste("Jose Eugenio Seie Cossa Sumbus", 12);
    }
}
