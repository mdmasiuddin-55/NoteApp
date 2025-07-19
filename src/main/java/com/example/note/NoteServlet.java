package com.example.note;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

public class NoteServlet extends HttpServlet {
    private ArrayList<Note> notes = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String noteText = request.getParameter("note");
        if (noteText != null && !noteText.trim().isEmpty()) {
            notes.add(new Note(noteText));
        }
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("notes", notes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
