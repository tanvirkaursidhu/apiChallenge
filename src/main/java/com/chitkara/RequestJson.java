package com.chitkara;

import java.util.List;

public class RequestJson {
	private List<String> data;

	public RequestJson() {

	}

	public RequestJson(List<String> data) {
		super();
		this.data = data;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}
}