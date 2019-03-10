package com.soft1841.jpt.day1;
/**
 * 圆形类
 *
 * @author Yue Tang
 * 2019.3.10
 */
public class Circle extends Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
