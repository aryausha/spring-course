package com.aryausha.courseapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="courses")
public class Courses {
    @Id
    private String Id;
    private String courseTitle;
    private String courseDescription;
    private String courseDate;
    private String courseDuration;
    private String courseVenue;

    public Courses(String courseTitle, String courseDescription, String courseDate, String courseDuration, String courseVenue) {

        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseDate = courseDate;
        this.courseDuration = courseDuration;
        this.courseVenue = courseVenue;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseVenue() {
        return courseVenue;
    }

    public void setCourseVenue(String courseVenue) {
        this.courseVenue = courseVenue;
    }
}
