
public class University
{
   private String schoolName;
    private Department[] departments;

    public University(String schoolName, String[] departmentNames) {
        this.schoolName = schoolName;
        this.departments = new Department[departmentNames.length];
        for (int i = 0; i < departmentNames.length; i++) {
            departments[i] = new Department(departmentNames[i]);
        }
    }

    public void printSchoolDetails() {
        System.out.println("Surguuliin ner: " + schoolName);
        System.out.println("Tenhimuud:");
        for (Department department : departments) {
            department.printDepartmentDetails();
        }
    }
}

