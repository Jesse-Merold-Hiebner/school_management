/*
StudentFactory.java
Author: Monehi Tuoane (219350744)
Date: 18 June 2022
*/

package factory;

import domain.Name;
import domain.Student;

public class StudentFactory {

    public static Student build(String studentId, String email, Name name) {
        //Inform caller of the missing studentId
        if (studentId == null || studentId.isEmpty())
            throw new IllegalArgumentException("Student ID is required!");

        //Inform caller of the missing email
        if (email == null || email.isEmpty())
            throw new IllegalArgumentException("Student email is required!");

        //Inform caller of the missing name
        if (name == null )
            throw new IllegalArgumentException("Student name is required!");

        return new Student.Builder().studentId(studentId)
                .name(name)
                .email(email)
                .build();
    }
}
