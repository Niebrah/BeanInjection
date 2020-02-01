package com.tutorialspoint;

public class TextEditor {

	
	private SpellChecker spellChecker;
	
	public void setSpellChecker (SpellChecker spellChecker) {
		System.out.print("inside setspellchecker");
		this.spellChecker = spellChecker;
	}
	//this is a setter to inject dependency
	//i.e. to connect the two classes but keep but as separate as possible
	
	public SpellChecker getSpellChecker () {
		return spellChecker;
	}
	
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
