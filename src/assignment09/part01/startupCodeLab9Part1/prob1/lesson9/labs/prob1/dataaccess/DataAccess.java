package assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.dataaccess;

import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business.Book;
import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business.LibraryMember;

import java.util.HashMap;


public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
