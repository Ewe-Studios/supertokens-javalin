package io.supertokens.javalin.core.Exception;

public class GeneralException extends SuperTokensException {

    public GeneralException(Exception e) throws GeneralException {
        super(e);
        if (e instanceof GeneralException) {
            throw (GeneralException) e;
        }
    }

    public GeneralException(String msg) {
        super(msg);
    }
}
