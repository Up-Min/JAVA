package test_11_15th;

public class Earth {
	// 상수 (!!!! 변수명 대문자 + snake 타입 !!!!)
	
	static final double EARTH_RADIUS = 6400; // 지구 둘레
	// final이기 때문에 변경 못하고, static이기 때문에 어디서든 쓸 수 있다.
	
	static final double EARTH_SURFACE_AREA;
	
	// static 필드 초기화
	static {
	EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
