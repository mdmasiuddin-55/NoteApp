<%@ page import="java.util.List" %>
<%@ page import="com.example.note.Note" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>My Notes</title>
</head>
<body>
    <h1>Important Notes</h1>
    <form action="notes" method="post">
        <input type="text" name="note" placeholder="Write something..." required>
        <button type="submit">Add Note</button>
    </form>
    <ul>
        <%
            List<Note> notes = (List<Note>) request.getAttribute("notes");
            if (notes != null) {
                for (Note n : notes) {
        %>
        <li><%= n.getText() %></li>
        <% }} %>
    </ul>
</body>
</html>
