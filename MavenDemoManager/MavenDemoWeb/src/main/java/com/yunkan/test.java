package com.yunkan;

import org.apache.shiro.crypto.hash.Md5Hash;


public class test {
    public static void main(String[] args) {
        Md5Hash m = new Md5Hash("123456","OMGG",1024);
        System.out.println(m.toString());
    }
}
