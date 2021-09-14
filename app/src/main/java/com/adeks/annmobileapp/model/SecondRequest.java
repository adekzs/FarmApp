package com.adeks.annmobileapp.model;

import java.util.Objects;

public class SecondRequest {
    private String jsonrpc;
    private Param params;

    public SecondRequest(String jsonrpc, Param params) {
        this.jsonrpc = jsonrpc;
        this.params = params;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Param getParams() {
        return params;
    }

    public void setParams(Param params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondRequest that = (SecondRequest) o;
        return Objects.equals(getJsonrpc(), that.getJsonrpc()) &&
                Objects.equals(getParams(), that.getParams());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJsonrpc(), getParams());
    }

    @Override
    public String toString() {
        return "SecondRequest{" +
                "jsonrpc='" + jsonrpc + '\'' +
                ", params=" + params +
                '}';
    }

    public static class Param {
        private String ex_worker_id;

        public Param(String ex_worker_id) {
            this.ex_worker_id = ex_worker_id;
        }

        public String getEx_worker_id() {
            return ex_worker_id;
        }

        public void setEx_worker_id(String ex_worker_id) {
            this.ex_worker_id = ex_worker_id;
        }

        @Override
        public String toString() {
            return "Param{" +
                    "ex_worker_id='" + ex_worker_id + '\'' +
                    '}';
        }
    }
}
