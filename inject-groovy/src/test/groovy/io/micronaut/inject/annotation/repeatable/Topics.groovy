package io.micronaut.inject.annotation.repeatable

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Retention(RetentionPolicy.RUNTIME)
@interface Topics {

    String connectionName() default "default"

    Topic[] value()
}
