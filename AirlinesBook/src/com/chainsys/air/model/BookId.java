package com.chainsys.air.model;

public class BookId {
	private long bookingId;
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
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
		BookId other = (BookId) obj;
		if (bookingId != other.bookingId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookId [bookingId=" + bookingId + "]";
	}
}
