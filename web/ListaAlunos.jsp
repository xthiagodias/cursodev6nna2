<%-- 
    Document   : ListaAlunos
    Created on : 06/11/2018, 18:44:45
    Author     : 26148269
--%>

<%@page import="java.util.List"%>
<%@page import="br.unama.Modelo.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% List<Aluno> listaAlunos = (List<Aluno>) request.getAttribute("LISTA-ALUNOS");%>


        <div class="ui container">
            <table border="1" class ="ui celled table">
                <thread>

                    <tr>
                        <th>Primeiro Nome</th>
                        <th>Ultimo Nome</th>
                        <th>E-mail</th>
                    </tr> 
                </thread>
            
            <tbody>
                
                <%for (Aluno aluno : listaAlunos) { %>
                
                
                <tr>
                    <td data-label="PrimeiroNome"><%= aluno.getPrimeiroNome() %></td>
                    <td data-label="UltimoNome"><%= aluno.getUltimoNome() %></td>
                    <td data-label="Email"><%= aluno.getEmail() %></td>
                   </tr> 
                   
                   <% } %> 

            </tbody>
            
            </table>
        </div>
    </body>
    
</html>
