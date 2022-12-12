package test_11_28th_annotation;

import java.lang.annotation.*;

// define annotation
// @Target : select can use annotation
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
// to select class, use TYPE.

@Retention(RetentionPolicy.RUNTIME)
// remain policy, when annotation starts and when it remain??

public @interface PrintAnnotation {
	// 2. add type
	//value type, number type
	String value() default "-"; // was '-' -> '#'
	int number() default 15; // was '15' -> '20'
}
