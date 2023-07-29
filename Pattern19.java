package com.patterns.level5;

public class Pattern19 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>0;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			int j;
			for(j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			for(int k=j-2;k>0;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
