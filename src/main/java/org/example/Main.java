package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class HelloWorld {
            private String name = "";
            private String surname;
            private int age;
            private int phone;
            private String Email;
            private int Mark1;
            private int Mark2;
            private int assignmentMark;
            private int ExamMark;
            private double DpMark;
            private double FinalMark;
            private int AssignmentMark;
            private int mark1;


            private HelloWorld(String name, String surname, int age, int phone, String Email, int Mark1, int Mark2,
                               int assignmentMark, int ExamMark,double DpMark,double FinalMark) {
                this.name = name;
                this.surname = surname;
                this.age = age;
                this.phone = phone;
                this.Email = Email;
                this.Mark1 = Mark1;
                this.Mark2 = Mark2;
                this.assignmentMark = assignmentMark;
                this.ExamMark = ExamMark;
                this.DpMark = DpMark;

            }

            private String getName() {
                return name;
            }
            private void setName (String name){
                this.name = name;
            }
            private String getSurname() {
                return surname;
            }
            private void setSurname (String Surname){
                this.surname= surname;
            }
            private int getAge() {
                return age;
            }
            private void setAge(){
                this.age= age;
            }
            private int getPhone() {
                return phone;
            }
            private void setPhone (int Phone){
                this.phone=phone;
            }
            private String getEmail() {
                return Email;
            }
            private void setEmail (String Email){
                this.Email=Email;
            }
            private int getMark1() {
                return Mark1;
            }
            private void setMark1(int mark1){
                this.mark1= mark1;
            }

            private int getMark2() {
                return Mark2;
            }
            private void setMark2 (int Mark2){
                this.Mark2 = Mark2;

            }
            private int getAssignmentMark () {
                return assignmentMark;
            }
            private void setAssignmentMark (int AssignmentMark){
                this.AssignmentMark= AssignmentMark;
            }
            private int getExamMark () {
                return ExamMark;
            }
            private void setExamMark(int ExamMark){
                this.ExamMark= ExamMark;
            }
            private double getDpmark(){
                return DpMark;
            }
            private void setDpMark(int DpMark){
                this.DpMark=DpMark;
            }
        }
    }
    }

