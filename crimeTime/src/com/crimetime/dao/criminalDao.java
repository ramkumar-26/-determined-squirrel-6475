package com.crimetime.dao;

import java.util.List;

import com.crimetime.exception.CrimeException;
import com.crimetime.exception.CriminalException;
import com.crimetime.model.Crime;
import com.crimetime.model.Criminal;

public interface criminalDao {
	
	//add a new criminal
	public int addNewCriminal(Criminal c) throws CriminalException; 
	
	public List<Criminal> displayAllCriminalDetails() throws CriminalException;

	
	public List<Crime> CrimesLinkedWithCriminal(int criminalID);

	Criminal displayCriminalDetailsWithCriminalID(int criminalID) throws CriminalException;
	
	
	
}
