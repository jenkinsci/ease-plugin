package com.apperian.eas.application;

import com.apperian.eas.ApperianEndpoint;
import com.apperian.eas.ApperianRequest;

import java.io.IOException;

public class ApplicationListRequest extends ApperianRequest {
    public ApplicationListRequest() {
        super(Type.GET, "/applications");
    }

    @Override
    public ApplicationListResponse call(ApperianEndpoint endpoint) throws IOException {
        return doJsonRpc(endpoint, this, ApplicationListResponse.class);
    }
}
