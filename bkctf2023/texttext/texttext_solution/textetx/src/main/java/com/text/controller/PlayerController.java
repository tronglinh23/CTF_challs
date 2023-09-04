////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package com.text.controller;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.ObjectInputStream;
//import java.io.PrintWriter;
//import java.io.Serializable;
//import java.util.Base64;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(
//        urlPatterns = {"/get-name"}
//)
//public class PlayerController implements Serializable {
////    public PlayerController() {
////    }
////
////    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        resp.setContentType("text/html");
////        PrintWriter out = resp.getWriter();
////        String player = req.getParameter("player");
////
////        try {
////            byte[] data = Base64.getDecoder().decode(player);
////            InputStream is = new ByteArrayInputStream(data);
////            ObjectInputStream ois = new ObjectInputStream(is);
////            Object obj = ois.readObject();
////            ois.close();
////            Player user = (Player)obj;
////            out.println("<h1> Hello: " + user.getName() + " !</h1>");
////        } catch (Exception var10) {
////            out.println("<h1> ????????? </h1>");
////        }
////
////    }
//
//    public static void main(String[] args) {
//        String player = "rO0ABXNyAC5qYXZheC5tYW5hZ2VtZW50LkJhZEF0dHJpYnV0ZVZhbHVlRXhwRXhjZXB0aW9u1Ofaq2MtRkACAAFMAAN2YWx0ABJMamF2YS9sYW5nL09iamVjdDt4cgATamF2YS5sYW5nLkV4Y2VwdGlvbtD9Hz4aOxzEAgAAeHIAE2phdmEubGFuZy5UaHJvd2FibGXVxjUnOXe4ywMABEwABWNhdXNldAAVTGphdmEvbGFuZy9UaHJvd2FibGU7TAANZGV0YWlsTWVzc2FnZXQAEkxqYXZhL2xhbmcvU3RyaW5nO1sACnN0YWNrVHJhY2V0AB5bTGphdmEvbGFuZy9TdGFja1RyYWNlRWxlbWVudDtMABRzdXBwcmVzc2VkRXhjZXB0aW9uc3QAEExqYXZhL3V0aWwvTGlzdDt4cHEAfgAIcHVyAB5bTGphdmEubGFuZy5TdGFja1RyYWNlRWxlbWVudDsCRio8PP0iOQIAAHhwAAAAAXNyABtqYXZhLmxhbmcuU3RhY2tUcmFjZUVsZW1lbnRhCcWaJjbdhQIACEIABmZvcm1hdEkACmxpbmVOdW1iZXJMAA9jbGFzc0xvYWRlck5hbWVxAH4ABUwADmRlY2xhcmluZ0NsYXNzcQB";
//        try {
//            byte[] data = Base64.getDecoder().decode(player);
//            InputStream is = new ByteArrayInputStream(data);
//            ObjectInputStream ois = new ObjectInputStream(is);
//            Object obj = ois.readObject();
//            ois.close();
//            Player user = (Player)obj;
//            System.out.println("<h1> Hello: " + user.getName() + " !</h1>");
//        } catch (Exception var10) {
//            System.out.println("<h1> ????????? </h1>");
//        }
//    }
//
//}
