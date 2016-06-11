package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("file no found");
		} catch (IOException e) {
			System.out.println("io");
		} catch (Exception e) {
			System.out.println("exception");
		}
	}
}
