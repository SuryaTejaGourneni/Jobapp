package com.example.jobapp.models;

public @interface GenerationType {
    GenerationType IDENTITY = null;

    String value() default "AUTO";
}