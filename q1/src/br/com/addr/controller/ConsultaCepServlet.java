package br.com.addr.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import br.com.addr.model.Endereco;
import br.com.addr.model.ConsultaCep;

@WebServlet("/ConsultaCep")
public class ConsultaCepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConsultaCepServlet() {
    }
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
    	JSONObject json = new JSONObject();
    	try {
			JSONParser parser = new JSONParser();
			json = (JSONObject) parser.parse(request.getReader());

			if(json.containsKey("cep")) {
				ConsultaCep consulta = new ConsultaCep((String) json.get("cep"));
				if(consulta.isValid()) {
					Endereco addr = consulta.getAddress();
					out.println(addr.toJson());
				} else {
					out.println("{\"error\":\"Formato de cep inválido\"}");
				}
			} else {
	    		response.setStatus(400);
				out.println("{\"error\":\"Necessário informar cep para consulta.\"}");				
			}

    	} catch(Exception e) {
    		response.setStatus(400);
    		response.getWriter().println("{\"error\": \"Json para consulta inválido\"}");
    	} 	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
