package com.annotationExample;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)

public @interface MethodInfo {
    String author();

    String comments();

    String date();

    int revision();
}

