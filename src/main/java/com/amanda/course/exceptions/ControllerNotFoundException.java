package com.amanda.course.exceptions;

public class ControllerNotFoundException extends RuntimeException {

    public ControllerNotFoundException(Object id) {
        super("Controller not found. Id " + id);
    }

}
