package com.tutorialspoint.di;

public class TextEditor {
	private SpellChecker spellChecke;
	private String name;

	/*
	 * for the constructor way to di public TextEditor(SpellChecker
	 * spellChecker) { System.out.println("Inside TextEditor constructor." );
	 * this.spellChecker = spellChecker; }
	 */

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecke = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecke;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecke.checkSpelling();
	}
}
