package qq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegistService {
	HashMap<String, Regist> H = new HashMap<>();
	
		
	public RegistService() {
		Regist R = new Regist("101", "김지우", "서울시", "silver(일반)", "010-1111-1111");
		H.put("101", R);
		R = new Regist("102", "홍길동", "인천시", "gold(중간)", "010-2222-2222");
		H.put("102", R);
		R = new Regist("103", "율곡", "김포시", "vip(최상)", "010-3333-3333");
		H.put("103", R);
	}
	
	public List<Regist> findAll(){
		return new ArrayList<>(H.values());
	}
	
	public Regist find(String id) {
		return H.get(id);
	}
	

		
	
}
