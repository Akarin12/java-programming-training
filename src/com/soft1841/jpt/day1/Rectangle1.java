package com.soft1841.jpt.day1;
/**
 * 矩形类
 *
 * @author Yue Tang
 * 2019.3.10
 */
public class Rectangle1 extends Shape {
	double length;
	double width;

	public Rectangle1(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}
}
