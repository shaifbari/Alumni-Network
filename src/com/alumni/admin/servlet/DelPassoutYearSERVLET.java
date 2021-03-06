package com.alumni.admin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alumni.admin.beans.AdminLoginBEAN;
import com.alumni.admin.bo.PassoutYearBO;
import com.alumni.admin.dao.PassoutYearDAO;

/**
 * Servlet implementation class DelPassoutYearSERVLET
 */
@WebServlet("/DelPassoutYearSERVLET")
public class DelPassoutYearSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelPassoutYearSERVLET() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		RequestDispatcher rd;
		HttpSession session = request.getSession();
		AdminLoginBEAN bean = (AdminLoginBEAN) session.getAttribute("adminloginBEAN");
		
		if(bean == null){
			rd = request.getRequestDispatcher("admin/index.jsp?validation=1");
			rd.forward(request, response);
		}else{
		PassoutYearBO bo = new PassoutYearBO();
		String flg=request.getParameter("flag");
		int flg1=Integer.parseInt(flg);
		if(flg==null){
			
		}
		else{
			try {
				bo.deleteYear(flg1);
				response.sendRedirect("admin/passoutYear.jsp?fl=-1");
				
			} catch (SQLException e) {
				e.printStackTrace();
				response.sendRedirect("admin/passoutYear.jsp?fl=-2");
				
			}
		}
		}
		
	}

}
