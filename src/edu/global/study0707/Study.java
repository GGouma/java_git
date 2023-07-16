package edu.global.study0707;

class TV {
	private int size;

	public TV(int size) { this.size = size; }

	public int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	public int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치" + color + "컬러");
	}
}

public class Study {

	public static void main(String[] args) {

		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}

}
