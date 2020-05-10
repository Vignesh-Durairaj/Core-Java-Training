package cg.javaflp.practice;

import java.lang.annotation.*;

@Documented
public @interface MyfirstAnnotation {
	String name();
	String dob();
	String emailId();
}
