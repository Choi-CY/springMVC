package hello.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 파라메타 전송 기능
 * http://localhost:8080/request-param?username=ccy&age=20
 */
@WebServlet(name="requestParamServlet" , urlPatterns="/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Request Param Servlet.Service");
        // 전체 파라메타 조회
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + "=" + request.getParameter(paramName)));

        //단일 파라메타 조회
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        System.out.println("username : " + username);
        System.out.println("age : " + age);

        // 이름이 같은 복수 파라메타
/*        String [] usernames = request.getParameterValues("username");
        for(String name : usernames){
            System.out.println("usernames : " + name);
        }*/
    }
}
