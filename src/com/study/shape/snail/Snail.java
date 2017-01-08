/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.study.shape.snail;

/**
 * @author SuJi, Lee
 *
 */
public class Snail {
	private int[][] arr;
	private int size;

	public Snail(int size) {
		this.arr = new int[size][size];
		this.size = size;
		init();
	}

	public void init() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = (size * i) + j + 1;
			}
		}
	}

	public void print() {
		int dataSize = size / 2;

		if (size % 2 != 0) {
			dataSize = size / 2 + 1;
		}

		for (int i = 0; i < dataSize; i++) {
			for (int j = i; j < size - i; j++) {
				System.out.print(arr[j][i] + " ");
			}

			for (int j = i + 1; j < size - i; j++) {
				System.out.print(arr[size - i - 1][j] + " ");
			}

			for (int j = size - i - 2; j >= i; j--) {
				System.out.print(arr[j][size - i - 1] + " ");
			}

			for (int j = size - i - 2; j > i; j--) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
