/**
 * 
 */
package com.myfamily.clan.model;

/**
 * @author gaurav_amritkar
 *
 */
public class Myself {
	
	private String name;
	private int age;
	private Myself father;
	private Myself mother;
	
	public Myself() {
		this.setName("default_name");
		//this.setFather("default_father");
		//this.setMother("default_mother");
		this.setAge(0);
	}
	
	public Myself(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public Myself (String name, int age, Myself father, Myself mother) {
		this.setName(name);
		this.setAge(age);
		this.setFather(father);
		this.setMother(mother);		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the father
	 */
	public Myself getFather() {
		return father;
	}

	/**
	 * @param father the father to set
	 */
	public void setFather(Myself father) {
		this.father = father;
	}

	/**
	 * @return the mother
	 */
	public Myself getMother() {
		return mother;
	}

	/**
	 * @param mother the mother to set
	 */
	public void setMother(Myself mother) {
		this.mother = mother;
	}
	
	@Override
	public String toString() {
		return "Myself[name = "+this.getName()+", age = "+this.getAge()+
				", father = "+this.getFather().getName()+"("+this.getFather().getAge()+
				"), mother = "+this.getMother().getName()+"("+this.getMother().getAge()+")]";
	}

}
