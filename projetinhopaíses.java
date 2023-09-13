import java.util.Arrays;

public class teste2 {

	public static void main(String[] args) {
		
		String [] países = {"Brasil","Japão", "França", "Inglaterra"};
	   
	    países [0] = "Alemanha";
	    
	    System.out.println("O indice é :" + países[0]);
	    int [] ímpares = new int [5];
	    
	    ímpares [0] = 1;
	    ímpares [2] = 3;
	    ímpares [3] = 5;
	    ímpares [4] = 7;
	    ímpares [5] = 9;

	System.out.println(" o valor da posição é :" + ímpares[1]);
	
	//descobrindo quantas posições o array tem
	
	System.out.println("o tamanho do array :" + ímpares.length);
	
    System.out.println("o tamanho do array :" + Arrays.toString(países));
	
	//pesquisa dentro de um arrays
	
    //Arrays.binarySearch(países, "Russia")
    
    System.out.println(Arrays.binarySearch(países, "Russia"));
    
    //ordenação de arrays 
    
    //Arrays.sort(países, 0, paises.lenght);
    //System.out.println(""+Arrays.sort(países, 0, paises.lenght());
    
	
