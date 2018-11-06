/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unama.Controle;

import br.unama.DAO.AlunoDAO;
import br.unama.Modelo.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author 26148269
 */
@WebServlet(name = "AlunoControlo", urlPatterns = {"/AlunoControle"})
public class AlunoControle extends HttpServlet {

    @Resource(name = "jdbc/aluno")
    private DataSource datasource;
    private AlunoDAO alunoDao;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        alunoDao = new AlunoDAO(datasource);
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Aluno> alunos = alunoDao.consultaAlunos();
        request.setAttribute("LISTA-ALUNOS", alunos);
        request.getRequestDispatcher("/ListaAlunos.jsp").forward(request, response);


    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body style='background-image: gradient-linear(red,blue,white);'>");
        out.println("<center><u><b style='color: blue; font-family: Arial; font-size: 20pt;'>Ola Mundo!</b></u></center>");
        out.println("</body>");
        out.println("</html>");
    }

}
