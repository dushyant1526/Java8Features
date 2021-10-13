package com.java8;

	interface addable{
		
		int add(int a,int b);
	}

	public class LambdaDemo {

		public static void main(String[] args) {
			
			
			
			//without using lambda i.e using inline implementation:
			addable ad=new addable() {
				public int add(int a,int b) {
					return a+b;
				}
			};
			
			System.out.println("Addition using inline implementation:"+ad.add(10,20));

			// using lambda
			addable ad2=(a,b)->(a+b);
			System.out.println("Addition using lambda:"+ad2.add(10, 40));
			};
			
		}

