package com.example.nuevosClientes;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        String nombre = request.getParameter("nombre");


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Hola " + nombre);
        out.println("</html></body>");
    }

    public void destroy() {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");


        String nombre = request.getParameter("nombre");
        String cargo = request.getParameter("cargo");
        String empresa = request.getParameter("empresa");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");



        Cliente cliente = new Cliente (nombre, cargo, empresa, telefono, email);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        out.println("Los datos ingresados son: " + "</br>");
        out.println("<br></br");
        cliente.toString();


        out.println("</html></body>");
    }


}