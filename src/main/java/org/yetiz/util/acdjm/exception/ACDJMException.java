package org.yetiz.util.acdjm.exception;

/**
 * Created by yeti on 2016/4/1.
 */
public class ACDJMException extends RuntimeException {
    public ACDJMException() {
    }

    public ACDJMException(String message) {
        super(message);
    }

    public ACDJMException(Throwable cause) {
        super(cause);
    }
}
