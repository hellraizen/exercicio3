package ati;

public class ArrayGenerico {
	public ArrayGenerico() {

	}

	public <E> void mudarPosicao(E[] arrayElemento, E elementoProcurar, E elementoTroca) {
		for (int i = 0; i < arrayElemento.length; i++) {
			E aux1 = elementoProcurar;

			if (arrayElemento[i] == elementoProcurar) {

				arrayElemento[i] = elementoTroca;
			} else if (arrayElemento[i] == elementoTroca) {

				arrayElemento[i] = aux1;
			}

		}

	}

	public <E> void exibirArray(E[] arrayElemento) {
		for (E e : arrayElemento) {
			System.out.println(e);
		}
	}

}
