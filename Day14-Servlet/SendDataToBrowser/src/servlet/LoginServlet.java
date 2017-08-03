package com.cdk.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    Map<String, String> loginDetails = new HashMap<>();
    boolean loginFlag = false;

    public boolean isLoginFlag() {
        return loginFlag;
    }

    public void init(){
        loginDetails.put("don","LADEN");
        loginDetails.put("kalia","KHATARNAK");
        loginDetails.put("rose","GULABI");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        Set<String> keys = loginDetails.keySet();
        Iterator<String> itr = keys.iterator();
        while(itr.hasNext()){
            String key = itr.next();
            if(key.equals(username)){
                if(loginDetails.get(key).equals("password")){
                    pw.write("You are succesfully logged in");
                    loginFlag = true;
                    HttpSession session = request.getSession();
                    session.setAttribute("loginFlag",true);
                }
            }

        }
        if(itr == null && loginFlag){
           pw.write("Invalid Username Password. Please try again");
        }



    }
}
