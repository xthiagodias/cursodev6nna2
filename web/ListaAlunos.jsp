<%-- 
    Document   : ListaAlunos
    Created on : 06/11/2018, 18:44:45
    Author     : 26148269
--%>

<%@page import="java.util.List"%>
<%@page import="br.unama.Modelo.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.text.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>



    <body>
        <% List<Aluno> listaAlunos = (List<Aluno>) request.getAttribute("LISTA-ALUNOS");%>


        <div class="ui container">
            <center> <table border="1" style="border: solid 1px black;" class ="ui celled table"> </center>
            <thread>

                <tr>
                    <th>PrimeiroNome</th>
                    <th>UltimoNome</th>
                    <th>E-mail</th>
                </tr> 


            </thread>

            <tbody>

                <%
                    int qtd = 0;

                %>

                <%for (Aluno aluno : listaAlunos) { %>


                <%

                    qtd = qtd + 1;
                %>

                <tr>
                    <td data-label="PrimeiroNome"><%= aluno.getPrimeiroNome()%></td>
                    <td data-label="UltimoNome"><%= aluno.getUltimoNome()%></td>
                    <td data-label="Email"><%= aluno.getEmail()%></td>
                </tr> 

                <% out.println("<br>Quantidade:" + qtd);
                    }%> 

            </tbody>


        </table>
    </div>
</body>

</html>
