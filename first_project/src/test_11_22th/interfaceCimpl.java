package test_11_22th;

public class interfaceCimpl implements interfaceC{
	// A,B의 상속을 받은 C를 받음.
	// 메소드 추가했더니 ABC가 다 들어와있음.
	
	@Override
	public void methodA() {
		System.out.println("interfaceCimpl - methodA");
	}
	@Override
	public void methodB() {
		System.out.println("interfaceCimpl - methodB");
	}
	@Override
	public void methodC() {
		System.out.println("interfaceCimpl - methodC");
	}

	
}
