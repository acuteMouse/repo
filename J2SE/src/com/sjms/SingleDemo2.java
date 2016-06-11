package com.sjms;
/*
 * 懒汉式单例  ,适用于单线程
 * 懒汉式,初始化时,没有实例,要用才产生一个实例, 用的是时才做,是谓懒
 */
public class SingleDemo2 {
		private static SingleDemo2 singleDemo2=null;
		private SingleDemo2() {
		}
		public static SingleDemo2 getsingledemo2Demo2(){
			if (singleDemo2==null) {
				singleDemo2=new SingleDemo2();
			}
			return singleDemo2;
		}
		public static void main(String[] args) {
			SingleDemo2 s1=SingleDemo2.getsingledemo2Demo2();
			SingleDemo2 s2=SingleDemo2.getsingledemo2Demo2();
			System.out.println(s1==s2);
			
		}
}
