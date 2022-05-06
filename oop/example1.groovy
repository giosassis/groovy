/* groovylint-disable-next-line CompileStatic */
package oops

class Student {

    String name
    int sub1Marks
    int sub2Marks

    def calcAvag () {
        if ((sub1Marks + sub2Marks) / 2 > 7) {
            println "$name is proved"
        } else {
            println "$name is reproved"
        }
    }

    def printTotal() {
        println "$name has total marks = " + (sub1Marks + sub2Marks)
    }

    static void main (args) {
        Student student1 = new Student()
        student1.name = 'John'
        student1.sub1Marks = 8
        student1.sub2Marks = 7
        student1.printTotal()
        student1.calcAvag()

        Student student2 = new Student()
        student2.name = 'Sarah'
        student2.sub1Marks = 9
        student2.sub2Marks = 7
        student2.printTotal()
        student2.calcAvag()

        Student student3 = new Student()
        student3.name = 'Bryan'
        student3.sub1Marks = 7
        student3.sub2Marks = 7
        student3.printTotal()
        student3.calcAvag()
    }

}
