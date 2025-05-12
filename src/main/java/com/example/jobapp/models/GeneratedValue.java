package com.example.jobapp.models;

public @interface GeneratedValue {

    GenerationType strategy() default @GenerationType("AUTO");

    String generator() default "";
}
