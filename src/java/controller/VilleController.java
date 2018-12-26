/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Ville;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.VilleService;

/**
 *
 * @author imadeddine
 */
@WebServlet(name = "VilleController", urlPatterns = {"/VilleController"})
public class VilleController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/Json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String fonc = request.getParameter("fonc");
            
            VilleService vs = new VilleService();
            if (fonc.equals("Ajouter")) {
                String nom = request.getParameter("nom");
                vs.create(new Ville(nom));
            } else if (fonc.equals("deletee")) {
                int id = Integer.parseInt(request.getParameter("id"));
                vs.delete(vs.findById(id));
                
            } else if (fonc.equals("Modifier")) {
                String nom = request.getParameter("nom");
                int id = Integer.parseInt(request.getParameter("id"));
                Ville v = new Ville();
                v.setNom(nom);
                v.setId(id);
                vs.update(v);
            }
            
            Gson json = new Gson();
            out.write(json.toJson(vs.findAll()));
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
