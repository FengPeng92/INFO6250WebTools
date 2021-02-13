package Part4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/part4")
public class tuitionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String academicTerm = request.getParameter("academicTerm");
        String academicYear = request.getParameter("academicYear");
        String status = request.getParameter("status");
        String studentName = request.getParameter("studentName");
        String relationship = request.getParameter("relationship");
        String studentNUID = request.getParameter("studentNUID");
        String employeeName = request.getParameter("employeeName");
        String employeeNUID = request.getParameter("employeeNUID");
        String department = request.getParameter("department");
        String location = request.getParameter("location");
        String phone = request.getParameter("phone");
        String supervisorName = request.getParameter("supervisorName");
        String program = request.getParameter("program");

        String c1No = request.getParameter("c1No");
        String c1Name = request.getParameter("c1Name");
        String c1Signature = request.getParameter("c1Signature");
        String c1Credit = request.getParameter("c1Credit");
        String c1Day = request.getParameter("c1Day");
        String c1Time = request.getParameter("c1Time");

        String c2No = request.getParameter("c2No");
        String c2Name = request.getParameter("c2Name");
        String c2Signature = request.getParameter("c2Signature");
        String c2Credit = request.getParameter("c2Credit");
        String c2Day = request.getParameter("c2Day");
        String c2Time = request.getParameter("c2Time");

        String c3No = request.getParameter("c2No");
        String c3Name = request.getParameter("c2Name");
        String c3Signature = request.getParameter("c2Signature");
        String c3Credit = request.getParameter("c2Credit");
        String c3Day = request.getParameter("c2Day");
        String c3Time = request.getParameter("c2Time");

        String employeeSignature = request.getParameter("employeeSignature");
        String dateIn4 = request.getParameter("dateIn4");

        String HRMApproval = request.getParameter("HRMApproval");
        String dateIn5 = request.getParameter("dateIn5");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Personal Information</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<p>Section 1</p>");
        out.println("<p>Academic Term: " + academicTerm + "</p>");
        out.println("<p>Academic Year: " + academicYear + "</p>");
        out.println("<p>Employee Status: " + status + "</p>");
        out.println();

        out.println("<p>Section 2</p>");
        out.println("<p>Student Name: " + studentName + "</p>");
        out.println("<p>Relationship to Employee: " + relationship + "</p>");
        out.println("<p>Student's NUID: " + studentNUID + "</p>");
        out.println("<p>Employee's Name: " + employeeName + "</p>");
        out.println("<p>Employee's NUID: " + employeeNUID + "</p>");
        out.println("<p>Department: " + department + "</p>");
        out.println("<p>Campus Location: " + location + "</p>");
        out.println("<p>Phone Number: " + phone + "</p>");
        out.println("<p>Supervisor's Name: " + supervisorName + "</p>");
        out.println();

        out.println("<p>Section 3</p>");
        if (c1No != "") {
            out.println("<p>Course No.: " + c1No + "</p>");
            out.println("<p>Course Name: " + c1Name + "</p>");
            out.println("<p>Supervisor Signature: " + c1Signature + "</p>");
            out.println("<p>Credit Hrs.: " + c1Credit + "</p>");
            out.println("<p>:Day(s): " + c1Day + "</p>");
            out.println("<p>Time: " + c1Time + "</p>");
            out.println();
        }

        if (c2No != "") {
            out.println("<p>Course No.: " + c2No + "</p>");
            out.println("<p>Course Name: " + c2Name + "</p>");
            out.println("<p>Supervisor Signature: " + c2Signature + "</p>");
            out.println("<p>Credit Hrs.: " + c2Credit + "</p>");
            out.println("<p>:Day(s): " + c2Day + "</p>");
            out.println("<p>Time: " + c2Time + "</p>");
            out.println();
        }

        if (c3No != "") {
            out.println("<p>Course No.: " + c3No + "</p>");
            out.println("<p>Course Name: " + c3Name + "</p>");
            out.println("<p>Supervisor Signature: " + c3Signature + "</p>");
            out.println("<p>Credit Hrs.: " + c3Credit + "</p>");
            out.println("<p>:Day(s): " + c3Day + "</p>");
            out.println("<p>Time: " + c3Time + "</p>");
            out.println();
        }

        out.println("<p>Section 4</p>");
        out.println("<p>Employee's Signature: " + employeeSignature + "</p>");
        out.println("<p>Date: " + dateIn4 + "</p>");
        out.println();

        out.println("<p>Section 5</p>");
        out.println("<p>HRM Approval " + HRMApproval + "</p>");
        out.println("<p>Date: " + dateIn5 + "</p>");


        out.println("</body>");
        out.println("</html>");



    }

}
