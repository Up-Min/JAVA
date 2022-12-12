package test_11_29th;

//type Parameter
public class Product <K , M> {

	// field
	private K kind; // K -> unavailable 
	private M model;
	
	//make getter, setter
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	} 
	
	
}
