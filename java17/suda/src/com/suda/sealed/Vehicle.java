package com.suda.sealed;

public sealed interface Vehicle permits Bus,Aeroplane {
	public void weels();
	public void engine();

}
