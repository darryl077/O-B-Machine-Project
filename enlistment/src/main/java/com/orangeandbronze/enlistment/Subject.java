package com.orangeandbronze.enlistment;

public class Subject {
	private final String subjectId;
	private final Courses subjectName;
	
	public Subject(String subjectId, Courses subjectName){ 

		if(!subjectId.matches("[A-Za-z0-9]+")){
			throw new IllegalArgumentException("Subject ID must be alphanumeric. Was: " + subjectId);
		}
		
		
		if(subjectName == null){
			throw new NullPointerException("Subject name cannot be null. Was: " + subjectName);
		}
				
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		return true;
	}
	
}
