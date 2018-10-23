/*
**  John G
**  CIS 131
**  Lab 6
*/

// To Do:
//
// Get updated pdf
// Create and use getters and setters for constructor

public class ClassSection {

    // Fields
    private int crn;
    private String departmentCode;
    private int courseNumber;
    private String instructionalMode;
    private String campus;
    private String meetingDays;
    private String meetingTimes;
    private int capacity;
    private int enrollment;
    private int instructorID;

    // No-arg constructor
    ClassSection() {
        crn = 0;
        departmentCode = "";
        courseNumber = 0;
        instructionalMode = "";
        campus = "";
        meetingDays = "";
        meetingTimes = "";
        capacity = 0;
        enrollment = 0;
        instructorID = 0;
    }

    // Constructor with args
    ClassSection(int c, String dC, int cN, String iM,
                 String camp, String mDays, String mTimes,
                 int capac, int enroll, int insID) {

        // Assign fields with args
        crn = c;
        departmentCode = dC;
        courseNumber = cN;
        instructionalMode = iM;
        campus = camp;
        meetingDays = mDays;
        meetingTimes = mTimes;
        capacity = capac;
        enrollment = enroll;
        instructorID = insID;
    }

}