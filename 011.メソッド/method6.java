/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class method6 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     String[] id1(String pid) {
    
    String[] data1 = {"1<br>", "1969/10/27<br>", "熊本県人吉市北泉田町4-13-18<br>"};
    data1[2] = null + "<br>";
  
    return data1;
    }
     
      String[] id2(String pid) {
    
    String[] data2 = {"2<br>", "1994/04/24<br>", "三重県名張市すずらん台東５番町1-1-2<br>"};
    
    return data2;
    }
      
       String[] id3(String pid) {
  
    String[] data3 = {"3<br>", "1960/02/01<br>", "岡山県津山市林田3-17<br>"};
    
    return data3;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         String[] prof1 = id1("1");
         String[] prof2 = id2("2");
         String[] prof3 = id3("3");
        for(int i = 0; i < prof1.length; i++){
           if(i == 2){
               continue;
           }
            out.print(prof1[i]);
        }
         for(String value : prof2){
            out.print(value);
         }
          for(String value : prof3){
            out.print(value);
          }
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
