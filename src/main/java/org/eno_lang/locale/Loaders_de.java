/* 1 is the package ; 2 is version comment ; 3 is class name
	caller supplies body and closes the three braces */

package org.eno_lang.locale;

/*
	Generated v3.0 at 2018-11-10T20:21:59.830626
	Using eno-locale messages.json v0.8.0 buillt 2018-07-21T07:50:30.125Z
*/

import java.util.ListResourceBundle;

public class Loaders_de extends ListResourceBundle
{
	protected Object[][] getContents()
	{
		return new Object[][] {

			// Loaders
			{"Invalid Email", "''{0}'' muss eine valide Email Adresse enthalten, zum Beispiel ''jane.doe@eno-lang.org''."},
			{"Invalid Color", "''{0}'' muss eine Farbe enthalten, zum Beispiel ''#B6D918'', ''#fff'' oder ''#01b''."},
			{"Invalid Float", "''{0}'' muss eine Dezimalzahl enthalten, zum Beispiel ''13.0'', ''-9.159'' oder ''42''."},
			{"Invalid Datetime", "''{0}'' muss ein valides Datum oder Datum und Zeit enhalten, zum Beispiel ''1961-01-22'' oder ''1989-11-09T19:17Z'' (siehe https://www.w3.org/TR/NOTE-datetime)."},
			{"Invalid Url", "''{0}'' muss eine valide URL enhalten, zum Beispiel ''https://eno-lang.org''."},
			{"Invalid Integer", "''{0}'' muss eine Ganzzahl enthalten, zum Beispiel ''42'' oder ''-21''."},
			{"Invalid Lat Lng", "''{0}'' muss ein valides Breiten-/Längengrad Koordinatenpaar enthalten, zum Beispiel ''48.2093723, 16.356099''."},
			{"Invalid Json", "''{0}'' muss valides JSON enthalten - die Meldung des Parsers war: ''[ERROR]''."},
			{"Invalid Boolean", "''{0}'' muss einen Boolean Wert enthalten - erlaubte Werte sind ''true'', ''false'', ''yes'' und ''no''."},
			{"Invalid Date", "''{0}'' muss ein valides Datum enhalten, zum Beispiel ''1993-11-18''."},
			{"IMPROVE","b.e.g. should handle better"}
		};
	}
}


