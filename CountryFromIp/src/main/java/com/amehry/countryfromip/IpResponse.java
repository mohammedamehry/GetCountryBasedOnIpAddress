package com.amehry.countryfromip;

import com.google.gson.annotations.SerializedName;

public class IpResponse{

	@SerializedName("registry")
	private String registry;
	@SerializedName("tor")
	private boolean tor;
	@SerializedName("ip")
	private String ip;
	@SerializedName("countrycode")
	private String countrycode;
	@SerializedName("countryname")
	private String countryname;
	@SerializedName("detail")
	private String detail;
	@SerializedName("spam")
	private boolean spam;
	@SerializedName("asn")
	private Asn asn;
	public String getRegistry(){
		return registry;
	}
	public boolean isTor(){
		return tor;
	}

	public String getIp(){
		return ip;
	}

	public String getCountrycode(){
		return countrycode;
	}

	public String getCountryname(){
		return countryname;
	}

	public String getDetail(){
		return detail;
	}

	public boolean isSpam(){
		return spam;
	}

	public Asn getAsn(){
		return asn;
	}
}