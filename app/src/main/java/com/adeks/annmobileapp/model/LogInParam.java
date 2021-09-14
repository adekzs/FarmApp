package com.adeks.annmobileapp.model;

import java.util.Objects;

public class LogInParam {
    private String db;
    private String login;
    private String password;


    public LogInParam(String db, String login, String password) {
        this.db = db;
        this.login = login;
        this.password = password;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogInParam param = (LogInParam) o;
        return Objects.equals(getDb(), param.getDb()) &&
                Objects.equals(getLogin(), param.getLogin()) &&
                Objects.equals(getPassword(), param.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDb(), getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "LogInParam{" +
                "db='" + db + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
