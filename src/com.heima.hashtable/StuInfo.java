package com.heima.hashtable;

public class StuInfo {
	private int age;
	private int count;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//ɢ�к���
	public int hashCode() {
		return age;
	}
	public StuInfo(int age, int count) {
		super();
		this.age = age;
		this.count = count;
	}
	public StuInfo(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString() {
		return "StuInfo [age=" + age + ", count=" + count + "]";
	}
	
	
	
}
