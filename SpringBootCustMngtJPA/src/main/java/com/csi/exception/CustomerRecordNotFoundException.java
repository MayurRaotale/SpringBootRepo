package com.csi.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class CustomerRecordNotFoundException extends Exception {
    public CustomerRecordNotFoundException (String msg){
        super(msg);
    }
}
