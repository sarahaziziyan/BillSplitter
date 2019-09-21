/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.Expense;
import beans.Person;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sarah Aziziyan <aziziyan.sarah@gmail.com>
 */
@WebServlet(name = "BillSplitterServlet", urlPatterns = {"/BillSplitterServlet"})
public class BillSplitterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BillSplitterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BillSplitterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
        // read form fields  
        String peopleString = "";
        String peopleParam= request.getParameter("people");
        String peopleNames[] = peopleParam.split(";");
        Person people[] = new Person[peopleNames.length];
        for (int i = 0; i < peopleNames.length; i++) {
            people[i] = new Person(peopleNames[i],0,0);
            peopleString += "<h2>Your names are: " + peopleNames[i] + "<br/>";
        }
        
//        String expensesParam= request.getParameter("expenses");
//        String expensesSplited[] = expensesParam.split(";");
//        Expense expenses[] = new Expense[expensesSplited.length];
//        for (int i = 0; i < expensesSplited.length; i++) {
//            expenses[i] = new Person(expensesSplited[i], i, i)
//        }
//         
//        System.out.println("username: " + username);
//        System.out.println("password: " + password);
// 
//        // do some processing here...
//         
        // get response writer
        PrintWriter writer = response.getWriter();
//         
        // build HTML code
        String htmlRespone = "<html>"+peopleString+"</html>";
         
        // return response
        writer.println(htmlRespone);
        //processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
