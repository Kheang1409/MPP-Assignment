package assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business;


import java.util.List;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
