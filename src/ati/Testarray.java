package ati;

public class Testarray {

	public static void main(String[] args) {
		
		ArrayGenerico gener =  new ArrayGenerico();

		
		String[] arrayString={"fulana","joao","danilo","fernando","maria"};
		Integer[] arrayInteger={1,2,3,4,5,6,7,8,9,10};
	
		gener.exibirArray(arrayString);
		gener.exibirArray(arrayInteger);
		
		System.out.println("------------------------------------------------------------------------------------");
		gener.mudarPosicao(arrayString, "fulana", "fernando");
		gener.exibirArray(arrayString);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		gener.mudarPosicao(arrayInteger, 2, 9);
		gener.exibirArray(arrayInteger);
	}

}
