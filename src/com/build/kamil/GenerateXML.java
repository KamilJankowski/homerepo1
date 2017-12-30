package com.build.kamil;

public class GenerateXML {
	
	public String generateProlog(){
		
		String prolog = "<?xml version='1.0' encoding='UTF-8'?>";
		
		return prolog;
		
	}
	
	public String generateOpenUserTag(){
		String openTag = "<user>";
		
		return openTag;
	}

	public String generateCloseUserTag(){
		String openTag = "</user>";
		
		return openTag;
	}

	public String generateName(String name){
		String tagAndName = "<name>" + name + "</name>";
		
		return tagAndName;
	}
	
	public String generateSurname(String surname){
		String tagAndSurname = "<surname>" + surname + "</surname>";
		
		return tagAndSurname;
	}

	public String generateLogin(String login){
		String tagAndLogin = "<login>" + login + "</login>";
		
		return tagAndLogin;
	}
	
	public String generatePassword(String password){
		String tagAndPassword = "<password>" + password + "</password>";
		
		return tagAndPassword;
	}
	
	public String generateRole(String role){
		String tagAndRole = "<role>" + role + "</role>";
		
		return tagAndRole;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
