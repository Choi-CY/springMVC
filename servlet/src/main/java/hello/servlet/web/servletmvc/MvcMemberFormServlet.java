package hello.servlet.web.servletmvc;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="MvcMemberFormServlet" , urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String viewPath = "WEB-INF/views/new-form.jsp";
        System.out.printf("check");
        //getRequestDispatcher = controller => view 로 이동할때 사용하는 메소드
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
        dispatcher.forward(req,res); // 실제로 view 를 호출하는 역할
    }
}
