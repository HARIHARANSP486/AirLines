package com.chainsys.air.model;

import java.time.LocalDate;

/**
 * This class is for journey details of passegers
 * @author hari2124
 *
 */
public class JourneyDetails {
	private String source;
	private String destination;
	private LocalDate journeyDate;
	private int adultNumber;
	private int childNumber;
	private int babyNumber;
	private int totalPassengers;
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
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public int getAdultNumber() {
		return adultNumber;
	}
	public void setAdultNumber(int adultNumber) {
		this.adultNumber = adultNumber;
	}
	public int getChildNumber() {
		return childNumber;
	}
	public void setChildNumber(int childNumber) {
		this.childNumber = childNumber;
	}
	public int getBabyNumber() {
		return babyNumber;
	}
	public void setBabyNumber(int babyNumber) {
		this.babyNumber = babyNumber;
	}
	public int getTotalPassengers() {
		return totalPassengers;
	}
	public void setTotalPassengers(int totalPassengers) {
		this.totalPassengers = totalPassengers;
	}
	@Override
	public String toString() {
		return "JourneyDetails [source=" + source + ", destination=" + destination + ", journeyDate=" + journeyDate
				+ ", adultNumber=" + adultNumber + ", childNumber=" + childNumber + ", babyNumber=" + babyNumber
				+ ", totalPassengers=" + totalPassengers + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adultNumber;
		result = prime * result + babyNumber;
		result = prime * result + childNumber;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + totalPassengers;
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
		JourneyDetails other = (JourneyDetails) obj;
		if (adultNumber != other.adultNumber)
			return false;
		if (babyNumber != other.babyNumber)
			return false;
		if (childNumber != other.childNumber)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (totalPassengers != other.totalPassengers)
			return false;
		return true;
	}
}
