package c15.demo3;

public class AccessDepartment implements DepartmentDao {

    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 Access 中根据 ID 得到 Department 表一条记录");
        Department department = new Department();
        department.setId(id);
        return department;
    }

}