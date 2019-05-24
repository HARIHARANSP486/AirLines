package com.chainsys.air.model;

public class Flight {
	private String flight_name;
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	@Override
	public String toString() {
		return "Flight [flight_name=" + flight_name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flight_name == null) ? 0 : flight_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (flight_name == null) {
			if (other.flight_name != null)
				return false;
		} else if (!flight_name.equals(other.flight_name))
			return false;
		return true;
	}
}
