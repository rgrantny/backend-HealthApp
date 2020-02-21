package com.github.rgrantny.model;

public class MetricBuilder {
    private String metricId;
    private String weight;
    private String height;
    private String activityLevel;
    private String bmi;
    private String userId;

    public MetricBuilder setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }

    public MetricBuilder setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public MetricBuilder setHeight(String height) {
        this.height = height;
        return this;
    }

    public MetricBuilder setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
        return this;
    }

    public MetricBuilder setBmi(String bmi) {
        this.bmi = bmi;
        return this;
    }

    public MetricBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Metric build() {
        return new Metric(metricId, weight, height, activityLevel, bmi, userId);
    }
}