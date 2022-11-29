package studio9;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

import assignment7.Student;

public class UniversityDatabase {
	private final Map<String, Student> studentMap;

	public UniversityDatabase() {
		studentMap = new HashMap<>();
		//Map<String, Student> studentMap = new HashMap<>();
	}
	
	public void addStudent(String accountName, Student student) {
		studentMap.put(accountName, student);
	}

	public int getStudentCount() {
		return studentMap.size();
	}

	public String lookupFullName(String accountName) {
		if(studentMap.get(accountName) == null) {
			return null;
		}
		Student toGetName = studentMap.get(accountName);
		return toGetName.getFullName();
	}

	public double getTotalBearBucks() {
		Set<String> toIterate = studentMap.keySet();
		Student toBearBuck;
		double total = 0;
		for(String key: toIterate) {
			toBearBuck = studentMap.get(key);
			total += toBearBuck.getBearBucksBalance();
		}
		return total;
	}
}
