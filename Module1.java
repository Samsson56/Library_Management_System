/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.library_management_system;

public class Module1 {

    String name,fname,uni_id,uid;
    int sem;

    public void getdata( String name,String fname, String uni_id, String uid,int sem ){

        this.name=name;
        this.fname=fname;
        this.uni_id=uni_id;
        this.uid=uid;
        this.sem=sem;

    }

    public void setdata(){
       
        System.out.println("");
        System.out.println("Student's name: "+name);
        System.out.println("Student's father name: "+fname);
        System.out.println("University id: "+uni_id);
        System.out.println("User id: "+ uid);
        System.out.println("Semester: "+sem);
        System.out.println("");
    }

}
