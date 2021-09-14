package com.adeks.annmobileapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Response {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("state_resident")
    @Expose
    private String stateResident;
    @SerializedName("lga_resident")
    @Expose
    private String lgaResident;
    @SerializedName("create_date")
    @Expose
    private String createDate;
    @SerializedName("registration_status")
    @Expose
    private String registrationStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStateResident() {
        return stateResident;
    }

    public void setStateResident(String stateResident) {
        this.stateResident = stateResident;
    }

    public String getLgaResident() {
        return lgaResident;
    }

    public void setLgaResident(String lgaResident) {
        this.lgaResident = lgaResident;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return Objects.equals(getId(), response.getId()) &&
                Objects.equals(getName(), response.getName()) &&
                Objects.equals(getEmail(), response.getEmail()) &&
                Objects.equals(getPhone(), response.getPhone()) &&
                Objects.equals(getStateResident(), response.getStateResident()) &&
                Objects.equals(getLgaResident(), response.getLgaResident()) &&
                Objects.equals(getCreateDate(), response.getCreateDate()) &&
                Objects.equals(getRegistrationStatus(), response.getRegistrationStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getPhone(), getStateResident(), getLgaResident(), getCreateDate(), getRegistrationStatus());
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", stateResident='" + stateResident + '\'' +
                ", lgaResident='" + lgaResident + '\'' +
                ", createDate='" + createDate + '\'' +
                ", registrationStatus='" + registrationStatus + '\'' +
                '}';
    }
}
