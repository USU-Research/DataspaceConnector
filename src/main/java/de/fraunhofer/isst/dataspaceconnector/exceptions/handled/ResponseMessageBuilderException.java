package de.fraunhofer.isst.dataspaceconnector.exceptions.handled;

import de.fraunhofer.isst.dataspaceconnector.exceptions.MessageResponseException;

/**
 * Thrown to indicate that the message could not be build.
 */
public class ResponseMessageBuilderException extends MessageResponseException {
    /**
     * Default serial version uid.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Construct a ResponseMessageBuilderException with the specified detail message and cause.
     *
     * @param msg   The detail message.
     * @param cause The cause.
     */
    public ResponseMessageBuilderException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
