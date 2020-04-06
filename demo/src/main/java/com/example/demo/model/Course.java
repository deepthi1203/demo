package com.example.demo.model;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Course {

	@Id
	@SequenceGenerator(name="course",initialValue = 1010,allocationSize = 1,sequenceName = "course")
	private int cid;
	private String courseName;
	private int duration;
	private double fee;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee + "]";
	}
		
}
