package singleton:

public class SingletonLazyHolder {
	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	private static SingletonLazyHolder getInstancia(){
		return InstanceHolder.instancia;
	}
}