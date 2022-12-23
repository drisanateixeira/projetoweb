package utils;

public enum ValidationMessage {

	FAILED("An error has occurred"),
	PASSED("Successfully");
	
	private String validation;
	ValidationMessage(String validation) {
        this.validation = validation;
    }

    public String getValidation() {
        return validation;
    }
}
