package com.emmanuelhmar.dagger2sample;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();
}
