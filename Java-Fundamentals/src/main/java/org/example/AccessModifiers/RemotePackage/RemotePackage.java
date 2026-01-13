package org.example.AccessModifiers.RemotePackage;

import org.example.AccessModifiers.MyPackage.ParentPackage;

/*
This is an external/ Remote Package that i will try to connect with classes inside the MyPackage
due to different access modifiers, there will be different outputs.
 */
public class RemotePackage extends ParentPackage {
    static void main() {
        RemotePackage r = new RemotePackage();
        System.out.println("Public Value "+r.PublicVar);
//        System.out.println("Private Value "+r.PrivateVar);
        System.out.println("Protected Value "+r.protectedVar);
//        System.out.println("Default Value "+r.defaultvar);
    }
    /*
    -> Public will work.
    -> private will not work as we are trying to access the variable from another package.
    -> protectedVar will work only if we make RemotePackage a subclass of ParentPackage.
    -> Default also will not work.
     */
}
