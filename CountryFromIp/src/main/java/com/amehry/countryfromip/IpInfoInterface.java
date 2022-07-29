package com.amehry.countryfromip;

public interface IpInfoInterface {
    void OnConnect(IpResponse ipResponse);
    void OnFailed(String Error);
}
