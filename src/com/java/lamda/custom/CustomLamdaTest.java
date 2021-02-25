package com.java.lamda.custom;

public class CustomLamdaTest {

	public static void main(String[] args) {

		CustomLamda lamda = new CustomLamda() {
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		CustomLamda lamda2 = (int a, int b) -> a+b;
		CustomLamda lamda3 = ( a,  b) -> a-b;

		
		System.out.println(lamda.add(10, 20));
		System.out.println(lamda2.add(13, 12));
		System.out.println(lamda3.add(4, 5));

	}
}
