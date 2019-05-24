package com.chainsys.air.model;

import java.sql.Time;
import java.time.LocalDate;

/**
 * Flight Details class
 * @author hari2124
 *
 */
public class FlightDetails {
	private long flightId;
	private String flightName;
	private String source;
	private String destination;
	private LocalDate dateOfJourney;
	private Time departureTime;
	private Time arrivalTime;
	private int avaliableTicket;
	private double childTicketRate;
	private double adultTicketRate;
	private double babyTicketRate;
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	public Time getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getAvaliableTicket() {
		return avaliableTicket;
	}
	public void setAvaliableTicket(int avaliableTicket) {
		this.avaliableTicket = avaliableTicket;
	}
	public double getChildTicketRate() {
		return childTicketRate;
	}
	public void setChildTicketRate(double childTicketRate) {
		this.childTicketRate = childTicketRate;
	}
	public double getAdultTicketRate() {
		return adultTicketRate;
	}
	public void setAdultTicketRate(double adultTicketRate) {
		this.adultTicketRate = adultTicketRate;
	}
	public double getBabyTicketRate() {
		return babyTicketRate;
	}
	public void setBabyTicketRate(double babyTicketRate) {
		this.babyTicketRate = babyTicketRate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(adultTicketRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + avaliableTicket;
		temp = Double.doubleToLongBits(babyTicketRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(childTicketRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dateOfJourney == null) ? 0 : dateOfJourney.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + (int) (flightId ^ (flightId >>> 32));
		result = prime * result + ((flightName == null) ? 0 : flightName.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
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
		FlightDetails other = (FlightDetails) obj;
		if (Double.doubleToLongBits(adultTicketRate) != Double.doubleToLongBits(other.adultTicketRate))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (avaliableTicket != other.avaliableTicket)
			return false;
		if (Double.doubleToLongBits(babyTicketRate) != Double.doubleToLongBits(other.babyTicketRate))
			return false;
		if (Double.doubleToLongBits(childTicketRate) != Double.doubleToLongBits(other.childTicketRate))
			return false;
		if (dateOfJourney == null) {
			if (other.dateOfJourney != null)
				return false;
		} else if (!dateOfJourney.equals(other.dateOfJourney))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightId != other.flightId)
			return false;
		if (flightName == null) {
			if (other.flightName != null)
				return false;
		} else if (!flightName.equals(other.flightName))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", dateOfJourney=" + dateOfJourney + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", avaliableTicket=" + avaliableTicket
				+ ", childTicketRate=" + childTicketRate + ", adultTicketRate=" + adultTicketRate + ", babyTicketRate="
				+ babyTicketRate + "]";
	}
}