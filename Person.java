/*
 * Person.java
 * 
 * Copyright 2022 Manan Vij <vijman22@US-CompLabiMac-16.local>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Person {
	private String name;
	private int birthYear;
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName(){
		return name;
	}
	public int getBirthYear(){
		return birthYear;
	}
	public String toString(){
		return ("Name : " + name + ",    Birth Year: " +   birthYear);
	}

}

 class Scholar extends Person {
	private String major;
	public Scholar(String name, int birthYear, String major) {
		super(name, birthYear);
		this.major = major;
	}
	public String toString(){
		return ("Name : " + super.getName() + ",    Birth Year: " + super.getBirthYear() + ",    Major: " + major);
	}
}

 class Instructor extends Person {
	private double salary;
	public Instructor(String name, int birthYear, double salary) {
		super(name, birthYear);
		this.salary = salary;
	}
	public String toString(){
		return ("Name : " + super.getName() + ",    Birth Year: " + super.getBirthYear() + ",    Salary ($): " + salary);
	}
}
