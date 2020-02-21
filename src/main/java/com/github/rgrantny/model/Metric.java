package com.github.rgrantny.model;

import java.util.UUID;

public class Metric implements MetricInterface {
    private final String metricId;
    private String weight;
    private String height;
    private String activityLevel;
    private String bmi;
    private String userId;

    public Metric(String metricId, String weight, String height, String activityLevel, String bmi, String userId) {
        this.metricId = UUID.randomUUID().toString();
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        this.bmi = bmi;
        this.userId = userId;
    }

    public String getMetricId() {
        return metricId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "metricId='" + metricId + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", activityLevel='" + activityLevel + '\'' +
                ", bmi='" + bmi + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
