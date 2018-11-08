package com.tests.helpers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum PersonalData {
	ARTHAS_MENETHIL("Arthas Menethil", "EP432234", "31"),
	JAINA_PROUDMOORE("Jaina Proudmoore", "EP123321", "30"),
	VARIAN_WRYNN("Varian Wrynn", "EP765567", "33");

	final String name;
	final String passport;
	final String age;

	PersonalData(String name, String passport, String age) {
		this.name = name;
		this.passport = passport;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String getPassport() {
		return this.passport;
	}

	public String getAge() {
		return this.age;
	}


	public static PersonalData randomPersonalData() {
		return PersonalData.values()[new Random().nextInt(PersonalData.values().length)];
	}
}
