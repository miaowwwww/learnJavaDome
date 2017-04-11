package imooc.test.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public List<Object> coursesToSelect;
	
	public ListTest() {
		this.coursesToSelect = new ArrayList<Object>();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("添加了课程:" + temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程" + temp2.id + ":" + temp2.name);
		
		coursesToSelect.add(new Course("1", "大学英语"));
		
		Course[] courses1 = {new Course("3", "汇编语言"), new Course("4", "软件工程")};
		coursesToSelect.addAll(Arrays.asList(courses1));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println("添加了两个课程" + temp3.id + ":" + 
				temp3.name + ";" + temp4.id + ":" + temp4.name);
		
		Course[] courses2 = {new Course("5", "数据结构"), new Course("6", "算法基础")};
		coursesToSelect.addAll(2, Arrays.asList(courses2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println("添加了两个课程" + temp5.id + ":" + 
				temp5.name + ";" + temp6.id + ":" + temp6.name);
		
	}
	
	public void testGet() {
		int size = coursesToSelect.size();
		for(int i = 0; i < size; i++ ) {
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("课程:" + cr.id + ":" + cr.name);
		}
	}
	
	public void testIterator() {
		Iterator it = coursesToSelect.iterator();
		System.out.println("有以下课程待选：");
		while(it.hasNext()){
			Course cr = (Course)it.next();
			System.out.println("课程:" + cr.id + ":" + cr.name);
		}
	}
	
	public void testModify() {
		coursesToSelect.set(4, new Course("7", "java编程"));
	}
	
	public void testRemove() {
		Course cr = new Course("2", "C语言");
		Course temp = (Course)coursesToSelect.get(0);
		coursesToSelect.remove(temp);
	}
	
	public static void main(String[] args) {
		ListTest It = new ListTest();
		It.testAdd();
		It.testGet();
		It.testModify();
		It.testRemove();
		It.testIterator();
		
		
	}
}
