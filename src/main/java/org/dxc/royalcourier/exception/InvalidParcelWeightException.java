package org.dxc.royalcourier.exception;

public class InvalidParcelWeightException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidParcelWeightException() {
		super();
	}
	public String toString() {
		
		return "Invalid Parcel Weight";
	}
}
