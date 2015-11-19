package com.apperian.eas.users;

import com.apperian.eas.AperianResponse;

public class AuthenticateUserResponse extends AperianResponse {
    String token;
    // User user;
    // Organization organization;

    public String getToken() {
        return token;
    }

    @Override
    public String getErrorMessage() {
        if (token == null) {
            return "No access";
        }
        return super.getErrorMessage();
    }

    @Override
    public String toString() {
        return "AuthenticateUserResponse{" +
                "token='" + token + '\'' +
                (hasError() ? ", error='" + getError() + '\'' : "") +
                '}';
    }
}
