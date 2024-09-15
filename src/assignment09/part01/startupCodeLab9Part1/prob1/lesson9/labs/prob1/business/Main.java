package assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business;

import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business.Book;
import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business.LibraryMember;
import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.business.Person;
import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.dataaccess.DataAccess;
import assignment09.part01.startupCodeLab9Part1.prob1.lesson9.labs.prob1.dataaccess.DataAccessFacade;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		List<String> strAddress = mems.stream()
				.filter(member -> member.getAddress().getZip().length() == 3)
				.map( member -> member.getMemberId())
				.collect(Collectors.toUnmodifiableList());
		return strAddress;
		
	}
	//Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		List<String> strISBNS = bs.stream()
				.filter(book -> book.getCopies().length >= 2)
				.map( book -> book.getIsbn())
				.collect(Collectors.toList());
		return strISBNS;
		
	}

	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		List<String> strISBNS = bs.stream().
				filter(book -> book.getAuthors().size() >= 2).
				map( book -> book.getIsbn())
				.collect(Collectors.toUnmodifiableList());
		return strISBNS;
		
		}

}
