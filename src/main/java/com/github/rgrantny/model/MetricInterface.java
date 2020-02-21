package com.github.rgrantny.model;

public interface MetricInterface {
    String getMetricId();
    String getWeight();
    String getHeight();
    String getActivityLevel();
    String getBmi();
    String getUserId();


//    void setMetricId(String metricId);
    void setWeight(String weight);
    void setActivityLevel(String activityLevel);
    void setBmi(String bmi);
    void setUserId(String userid);
}
