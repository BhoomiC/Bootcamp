package com.servletassignment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "CricketMatchServlet")
public class CricketMatchServlet extends HttpServlet {
//    Map<String,String> cricketMatch = new HashMap<>();
    List<CricketMatchInfo> cricketMatchInfoList = new ArrayList<>();

    public void init(){
//        cricketMatch.put("Test","INDIA");
//        cricketMatch.put("ODI","England");
        cricketMatchInfoList.add(new CricketMatchInfo("India", "England",199,"World Cup","London"));
        cricketMatchInfoList.add(new CricketMatchInfo("India", "Pakistan",399,"ODI", "Pakistan"));
        cricketMatchInfoList.add(new CricketMatchInfo("Bangladesh","Pakistan", 124,"Test","Dubai"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String matchType = request.getParameter("matchType");
        PrintWriter pw = response.getWriter();
        Iterator<CricketMatchInfo> itr = cricketMatchInfoList.iterator();
        while(itr.hasNext()){
            CricketMatchInfo temp = itr.next();
            if(temp.getMatchType().equalsIgnoreCase(matchType)){
                pw.write("In " + matchType + temp.getWinningCountry() + " won against " + temp.getLosingCountry()+ " and scored" +temp.getScore() + " at " + temp.getMatchLocation());
            }
        }



    }
}
