package com.adeks.annmobileapp.model;

import java.util.Objects;

public class LogInRequest {

    private String jsonrpc;
    private LogInParam params;

    public LogInRequest(String jsonrpc, LogInParam params) {
        this.jsonrpc = jsonrpc;
        this.params = params;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public LogInParam getParams() {
        return params;
    }

    public void setParams(LogInParam params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogInRequest that = (LogInRequest) o;
        return Objects.equals(getJsonrpc(), that.getJsonrpc()) &&
                Objects.equals(getParams(), that.getParams());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJsonrpc(), getParams());
    }

    @Override
    public String toString() {
        return "LogInRequest{" +
                "jsonrpc='" + jsonrpc + '\'' +
                ", params=" + params +
                '}';
    }
}
