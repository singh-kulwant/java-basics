package com.template.corejava;

public class EqualsAndHashcodeProgram {

	public static void main(String[] args) {

		Station x = new Station("core", 2);
		Station y = new Station("core", 2);
		
		if(x==y) {
			System.out.println("x == y");
		}
		
		if(x.equals(y)) {
			System.out.println(" Deep copy");
		}
	}

}

class Station {
	
	private String name;
	private int num;

	public Station(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Station station = (Station) obj;

		return (station.name == this.name && station.num == this.num);

	}

	@Override
	public int hashCode() {
		return this.num;
	}
}
