package ch07;

public class GenericPrinter<T extends Material> { 
	// T에 대한 제한으로 extends Material 
	
	
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
