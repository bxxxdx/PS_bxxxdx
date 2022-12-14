package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stk = new Stack<>();
		int ret = 0;
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if(c == '(') {
				stk.push(c);
			}
			else if (c == ')') {
				stk.pop();
				if(input.charAt(i-1) == '(') {
					ret += stk.size();
				}				
				else {
					ret++;
				}
			}
		}
		System.out.println(ret);	
	}
}
