package com.zq.restructure.demo1;

public class Performance {
	private String playId;
	private int audience;

	public Performance(String playId, int audience) {
		this.playId = playId;
		this.audience = audience;
	}

	public String getPlayId() {
		return playId;
	}

	public void setPlayId(String playId) {
		this.playId = playId;
	}

	public int getAudience() {
		return audience;
	}

	public void setAudience(int audience) {
		this.audience = audience;
	}
}
