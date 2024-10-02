package com.example.designpatterns.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    //if no getter methods of parent private attribute then call copy constr of parent from child
    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        iq = student.iq;
    }

    public IntelligentStudent() {}

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.setName(this.getName());
//        intelligentStudent.setAge(this.getAge());
//        intelligentStudent.setBatch(this.getBatch());
//        intelligentStudent.setPsp(this.getPsp());
//        intelligentStudent.setAverageBatchPsp(this.getAverageBatchPsp());
//
//        intelligentStudent.iq = this.iq;
//        return intelligentStudent;

          return new IntelligentStudent(this);

    }
}
