/*
 * InheritanceTester.java
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

import java.util.ArrayList;

public class InheritanceTester {
	
	public static void main (String[] args) {
		Person p1 = new Person("Manan", 2004);
		Person p2 = new Person("Bob", 1999);
		
		Scholar s1 = new Scholar("Manan", 2004, "Neuroscience");
		Scholar s2 = new Scholar("Bob", 1998, "Engineering");
		
		Instructor i1 = new Instructor("Manan", 2004, 10000000.1);
		Instructor i2 = new Instructor("Bob", 1343, 1);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString() + "\n");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString()+ "\n");
		
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		
		ArrayList<Person> arrL = new ArrayList<Person>();
		arrL.add(p1);
		arrL.add(p2);
		arrL.add(s1);
		arrL.add(s2);
		arrL.add(i1);
		arrL.add(i2);
		
		System.out.println("\n\n\nPrinting state of every object using for-each loop in Array List\n");
		
		int counter = 0;
		for (Person obj : arrL) {
			System.out.println(obj.toString());
			if (counter % 2 == 1) {
				System.out.println();
			}
		}
	}
}

