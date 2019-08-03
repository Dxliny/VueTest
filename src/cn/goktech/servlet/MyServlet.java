package cn.goktech.servlet;

import cn.goktech.pojo.StatEnum;
import cn.goktech.pojo.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/plain;charset=utf-8");
        ObjectMapper objectMapper = new ObjectMapper();
        String id = req.getParameter("id");
        System.out.println(id);
        PrintWriter out = resp.getWriter();
        List<User> users = new ArrayList<>();
        for(int i=0;i<10;i++){
            User user = new User(i,"Tony","root","root");
            users.add(user);
        }
        String userJson = objectMapper.writeValueAsString(users);
        out.print(userJson);
    }
}
