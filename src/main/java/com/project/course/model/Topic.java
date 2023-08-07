
package com.project.course.model;

import com.project.course.CourseApplication;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// import com.project.course.Course;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Topic {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column (name = "id")
    private Long idCourse;
    
    @Column
    private String name;
    
    @Column
    private String description;
    
    /*
    @ManyToOne
    @JoinColumn (name = "id_course")
    private Course course;
    */
}
