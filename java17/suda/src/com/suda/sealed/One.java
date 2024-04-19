package com.suda.sealed;

public sealed interface One permits ClassOne,Two {
public void methodOne();
}
