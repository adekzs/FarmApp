package com.adeks.annmobileapp.model;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    @SerializedName("message")
    @Expose
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(getStatus(), result.getStatus()) &&
                Objects.equals(getResponse(), result.getResponse()) &&
                Objects.equals(getMessage(), result.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(), getResponse(), getMessage());
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", response=" + response +
                ", message='" + message + '\'' +
                '}';
    }
}
