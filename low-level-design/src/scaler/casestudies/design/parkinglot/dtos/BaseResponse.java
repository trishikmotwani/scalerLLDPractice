package scaler.casestudies.design.parkinglot.dtos;

public class BaseResponse {

	private ResponseStatus status;
	private String errorMessage;

	/**
	 * @return the status
	 */
	public ResponseStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
