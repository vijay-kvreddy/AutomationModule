package com.automation.gruyere.AutomationModule.Exception;

public class AutomationFrameworkException extends Exception{

	private static final long serialVersionUID = -3950324459135914105L;

    public AutomationFrameworkException() {
        super();
    }

    public AutomationFrameworkException(String message) {
        super(message);
    }

    public AutomationFrameworkException(Throwable cause) {
        super(cause);
    }

    public AutomationFrameworkException(String message, Throwable cause) {
        super(message, cause);
    }
}
