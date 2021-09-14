package com.adeks.annmobileapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class SecondResponseBody {


    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("result")
    @Expose
    private Result result;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondResponseBody that = (SecondResponseBody) o;
        return Objects.equals(getJsonrpc(), that.getJsonrpc()) &&
                Objects.equals(getId(), that.getId()) &&
                Objects.equals(getResult(), that.getResult());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJsonrpc(), getId(), getResult());
    }

    @Override
    public String toString() {
        return "SecondResponseBody{" +
                "jsonrpc='" + jsonrpc + '\'' +
                ", id=" + id +
                ", result=" + result +
                '}';
    }
}
