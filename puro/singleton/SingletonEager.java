package singleton:

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	private static SingletonEager getInstancia(){
		return instancia
	}
}