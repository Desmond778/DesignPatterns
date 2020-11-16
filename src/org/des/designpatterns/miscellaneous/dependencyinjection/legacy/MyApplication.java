package org.des.designpatterns.miscellaneous.dependencyinjection.legacy;

public class MyApplication {
    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }

//    private EmailService email = null;
//
//    public MyApplication(EmailService svc){
//        this.email=svc;
//    }
}
