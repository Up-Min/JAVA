package expand_q;

public class FindGoods {
	Gucci b = new Gucci();
	Channel c = new Channel();
	Louisvitton d = new Louisvitton();
	Bvlgari e = new Bvlgari();
	String ss;
	
	
	public FindGoods(String s) {
		this.ss = s;
		b.find(ss); c.find(ss); d.find(ss); e.find(ss);
		if(b.find(ss) == true) {
			Class clz = b.getClass();
			System.out.println("제품이 있는 매장은 "+clz.getSimpleName() + "입니다! \n");				
		}else if (c.find(ss) == true) {
			Class clz = c.getClass();
			System.out.println("제품이 있는 매장은 "+clz.getSimpleName() + "입니다! \n");			
		}else if (d.find(ss) == true) {
			Class clz = d.getClass();
			System.out.println("제품이 있는 매장은 "+clz.getSimpleName() + "입니다! \n");			
		}else if (e.find(ss) == true) {
			Class clz = e.getClass();
			System.out.println("제품이 있는 매장은 "+clz.getSimpleName() + "입니다! \n");			
		}else {
			System.out.println("찾으시는 제품이 없습니다! 다시 확인해주세요!");
		}
	}
	}

	

