package com.test.camel;

import java.util.Date;

public class Student {

			  int id ;
			  String first_name;
			  String last_name ;
			  String career ;
			  Date admissionDate;
			  
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getFirst_name() {
				return first_name;
			}
			public void setFirst_name(String first_name) {
				this.first_name = first_name;
			}
			public String getLast_name() {
				return last_name;
			}
			public void setLast_name(String last_name) {
				this.last_name = last_name;
			}
			public String getCareer() {
				return career;
			}
			public void setCareer(String career) {
				this.career = career;
			}
			
			public Date getAdmissionDate() {
				return admissionDate;
			}
			public void setAdmissionDate(Date admissionDate) {
				this.admissionDate = admissionDate;
			}
			@Override
			public String toString() {
				return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", career="
						+ career + ", admissionDate=" + admissionDate + "]";
			}
			
}
