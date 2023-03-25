package stack;

public class StackInt {
	
	NoInt topo;

	public StackInt() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int e) {
		NoInt elemento = new NoInt();
		elemento.dado = e;
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não tem elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não tem elementos na pilha");
		}
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoInt auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
	
	public void killAndShow() {
		StackInt pilhaClone = this;
	
		if (!isEmpty()) {
			NoInt auxiliar = pilhaClone.topo;
			while (auxiliar.proximo != null) {
				System.out.println(auxiliar.dado);
				auxiliar = auxiliar.proximo;
			}	
		}
	}

}
