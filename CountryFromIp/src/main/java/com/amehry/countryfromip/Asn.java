package com.amehry.countryfromip;

import com.google.gson.annotations.SerializedName;

public class Asn{

	@SerializedName("code")
	private String code;

	@SerializedName("route")
	private String route;

	@SerializedName("name")
	private String name;

	@SerializedName("start")
	private String start;

	@SerializedName("count")
	private String count;

	@SerializedName("end")
	private String end;

	public String getCode(){
		return code;
	}

	public String getRoute(){
		return route;
	}

	public String getName(){
		return name;
	}

	public String getStart(){
		return start;
	}

	public String getCount(){
		return count;
	}

	public String getEnd(){
		return end;
	}
}