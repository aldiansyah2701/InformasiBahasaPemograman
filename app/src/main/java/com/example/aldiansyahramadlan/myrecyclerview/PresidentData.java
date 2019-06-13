package com.example.aldiansyahramadlan.myrecyclerview;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Java", "Java Programming Language", "https://cdn-images-1.medium.com/max/600/1*Wi8cul1GTDJIcmSENrYxUQ.png","Java is a popular general-purpose programming language and computing platform. It is fast, reliable, and secure. According to Oracle, the company that owns Java, Java runs on 3 billion devices worldwide.","James Gosling","1996"},
            {"C++", "C++ Programming Language", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/ISO_C%2B%2B_Logo.svg/1200px-ISO_C%2B%2B_Logo.svg.png","C++ ranks 4th in popularity according to 2016 IEEE spectrum Top Programming Language ranking. Learning C++ is a wise investment for all programmers.","Bjarne Stroustrup","1979"},
            {"HTML", "HTML 5 Programming Language", "http://ronnyf.it.student.pens.ac.id/foto/HTML5_logo.png","Hypertext Markup Language (HTML) is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript.","Tim Berners-Lee","1995"},
            {"Node JS", "Node JS Programming Language", "https://devstickers.com/assets/img/pro/zrue.png","Node.js is an open-source, cross-platform JavaScript run-time environment that executes JavaScript code outside of a browser. Node.js lets developers use JavaScript to write command line tools and for server-side scripting—running scripts server-side to produce dynamic web page content before the page is sent to the user's web browser. Consequently, Node.js represents a JavaScript everywhere paradigm,unifying web application development around a single programming language, rather than different languages for server- and client-side scripts.","Ryan Dahl","2009"},
            {"Python", "Python Programming Language", "https://cdn.auth0.com/blog/python-restful/logo.png","Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aims to help programmers write clear, logical code for small and large-scale projects.","Guido van Rossum","1989"},
            {"Swift", "Swift Programming Language", "https://developer.apple.com/swift/images/swift-og.png","Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. for iOS, macOS, watchOS, tvOS, Linux, and z/OS. Swift is designed to work with Apple's Cocoa and Cocoa Touch frameworks and the large body of existing Objective-C code written for Apple products. It is built with the open source LLVM compiler framework and has been included in Xcode since version 6, released in 2014. On Apple platforms, it uses the Objective-C runtime library which allows C, Objective-C, C++ and Swift code to run within one program.","Chris Lattner","2014"},
            {"Ruby", "Ruby Programming Language", "https://www.georgeyoung.pro/assets/images/shields/ruby.png","Ruby is an interpreted, high-level, general-purpose programming language. It was designed and developed in the mid-1990s by Yukihiro Matz Matsumoto in Japan","Yukihiro Matsumoto","1995"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new President();
            president.setName(aData[0]);
            president.setRemarks(aData[1]);
            president.setPhoto(aData[2]);
            president.setDeskripsi(aData[3]);
            president.setPenemu(aData[4]);
            president.setTahun(aData[5]);
            list.add(president);
        }

        return list;
    }
}
