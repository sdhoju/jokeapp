/**
 * 
 */
package com.sfja.norris.chuck.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public ChuckNorrisServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}




	@Override
	public String getJoke() {
		return   chuckNorrisQuotes.getRandomQuote();
	}
	
	

}
