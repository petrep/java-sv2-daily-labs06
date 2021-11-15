package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumberContainer {
	private List<Double> myList = new ArrayList<>();

	public List<Double> getMyList() {
		return myList;
	}

	public void addNumberToList(double number){
		myList.add(number);
	}
}
