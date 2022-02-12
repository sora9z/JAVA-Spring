package ch06;

public class GenericPrinter<T> { // 나중에 사용할 때 T 자리에 자료형 쓴다  
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	
	

}
