package com.suda.sealed;

public sealed interface Two extends One permits ClassTwo {
	public void methodTwo();
}
