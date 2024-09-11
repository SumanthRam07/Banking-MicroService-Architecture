package org.training.fundtransfer.exception;

public class ForbiddenAccessException extends  RuntimeException {


    public ForbiddenAccessException(String message) {
        super(message);
    }
}
