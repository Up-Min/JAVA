package ch08;

import java.util.*;

public class ProductService {
	// 데이터 샘플을 제공해주는 클래스
	
	// 해쉬맵!
	Map<String, Product> products = new HashMap<>();

	public ProductService() {
		// 각 파일들을 해쉬맵에 넣어줌. 이 값들을 불러오고 싶다면 put할 때 ㅅ용했던 키값을 뺴면 됨. 
		
		Product p = new Product("101", "애플사과폰12", "애플", 1230000, "2020.12.12");
		products.put("101", p);
		p = new Product("102", "삼성사과폰12", "삼성", 430000, "2021.12.12");
		products.put("102", p);
		p = new Product("103", "엘지사과폰12", "엘지", 4300000, "2022.12.12");
		products.put("103", p);
		
		
	}
	
	// 모든 상품 데이터를 가져오는 메소드 (select*from)
	public List<Product> findAll(){
		return new ArrayList<>(products.values());
	}
	
	// 해쉬맵에서 원하는 애들만 가져오는 메소드 (id를 사용해서!)
	public Product find(String id) {
		return products.get(id);
	}
	
}
