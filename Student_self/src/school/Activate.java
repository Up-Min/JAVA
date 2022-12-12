package school;

import java.util.ArrayList;
import java.util.Arrays;

public class Activate {

	public static ArrayList<Student> arr = new ArrayList<Student>();
	
	public static void main(String[] args) {

		Student st1 = new Student("박지은", 181213, "국어국문과", "국어", 95, 96);
		Student st2 = new Student("차슬기", 181518, "컴퓨터공학과", "수학", 95, 98);
		Student st3 = new Student("이현욱", 171230, "국어국문과", "국어", 100, 88);
		Student st4 = new Student("임지연", 171255, "국어국문과", "국어", 89, 95);
		Student st5 = new Student("김재현", 171590, "컴퓨터공학과", "수학", 83, 56);
		
		arr.add(st1); arr.add(st2); arr.add(st3); arr.add(st4); arr.add(st5);
		
				
		PointGrade c = new PointGrade(st1.M_num, CheckPoint.Majorkorea_m(st1.M_num));
		
		System.out.println("수학점수 : "  + c.getPoint());
		System.out.println("수학등급 : " +c.getGrade());
	}
	
	static void PrintKorean(){
		for(Student stu : arr) {
			if(stu.Smajor.equals("국어국문과")) {
				new PointGrade(stu.M_num, CheckPoint.Majorkorea_m(stu.M_num));
				new PointGrade(stu.K_num, CheckPoint.Majorkorea_k(stu.K_num));
			}else if(stu.Smajor.equals("컴퓨터공학과")) {
				new PointGrade(stu.M_num, CheckPoint.Majorcomputer_m(stu.M_num));
				new PointGrade(stu.K_num, CheckPoint.Majorcomputer_k(stu.K_num));
			}
		}
	}
}
