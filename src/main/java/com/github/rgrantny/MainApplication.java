package com.github.rgrantny;

import com.github.rgrantny.model.Metric;
import com.github.rgrantny.model.MetricBuilder;
import com.github.rgrantny.utils.JdbcConfigurator;

public class MainApplication {
    public static void main(String[] args) {
        Metric metric = new MetricBuilder()
                .setActivityLevel("skdfmds")
                .setBmi("dsfsd")
                .setWeight("2345")
                .build();
        JdbcConfigurator.initialize();
    }
}
