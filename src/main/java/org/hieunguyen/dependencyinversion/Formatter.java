package org.hieunguyen.dependencyinversion;

//Common interface for classes formatting Message object
public interface Formatter {
	
	String format(Message message) throws FormatException;
	
}
