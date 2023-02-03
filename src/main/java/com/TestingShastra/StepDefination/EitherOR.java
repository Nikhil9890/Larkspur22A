package com.TestingShastra.StepDefination;

import io.cucumber.java.StepDefinitionAnnotations;
import io.cucumber.java.StepDefinitionAnnotation;

import org.apiguardian.api.API;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)                    //target means where annotation may apper
@StepDefinitionAnnotation
@Documented
@Repeatable(EitherOR.EitherORs.class)
@API(status = API.Status.STABLE)
public @interface EitherOR {

	String value();

	 /**
     * Allows the use of multiple 'EitherOR's on a single method.
     */
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@StepDefinitionAnnotations
	@Documented
	@interface EitherORs {

		EitherOR[] value();
	}

}
