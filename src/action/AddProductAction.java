package action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.Product;
import bean.User;
import dao.DAOFactory;

@WebServlet("/AddProductAction")
public class AddProductAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String UPLOAD_DIRECTORY = "upload";
	private static final int THRESHOLD_SIZE = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024*1024*50;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_name,category,price,stock,qty,offer;
		
		System.out.println("inside");
		/*product_name = request.getParameter("pname");
		category 	 = request.getParameter("pcategory");
		price 		 = request.getParameter("pprice");
		stock 		 = request.getParameter("pstock");
		qty 		 = request.getParameter("pquantity");
		offer        = request.getParameter("poffer");
	*/	
		DAOFactory dao  = DAOFactory.getDao();
		Product product = new Product();
		
	/*	product_name = request.getParameter("pname");*/
		
		if (!ServletFileUpload.isMultipartContent(request)) 
		{
			PrintWriter writer = response.getWriter();
			writer.println("Request does not contain upload data");
			writer.flush();
			return;
		}
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(THRESHOLD_SIZE);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setFileSizeMax(MAX_FILE_SIZE);
		upload.setSizeMax(MAX_REQUEST_SIZE);

		String uploadPath = getServletContext().getRealPath("")
				+ File.separator + UPLOAD_DIRECTORY;
		
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) 
		{
			uploadDir.mkdir();
		}

		try {
			List formItems = upload.parseRequest(request);
			Iterator iter = formItems.iterator();
			
			while (iter.hasNext()) 
			{
				
				FileItem item = (FileItem) iter.next();
				
				if(item.getFieldName().equals("pname"))
				{
					
					product.setProduct_name(item.getString());
				}
				else if(item.getFieldName().equals("pcategory")) {
					
					product.setCategory(item.getString());
				}
				else if(item.getFieldName().equals("pprice")) {
					
					product.setPrice(item.getString());
				}
				else if(item.getFieldName().equals("pstock")) {
					
					product.setStock(item.getString());
				}
				else if(item.getFieldName().equals("pquantity")) {
					
					product.setQty(item.getString());
				}
				else if(item.getFieldName().equals("poffer")) {
					
					product.setOffer(item.getString());
				}
				else if (!item.isFormField() || item.getFieldName().equals("uploadimg")) 
				{
					System.out.println("Hello");
					
					String fileName = new File(item.getName()).getName();
					product.setImage(fileName);
					String filePath = uploadPath + File.separator + fileName;
					File storeFile = new File(filePath);
					item.write(storeFile);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		boolean status = dao.addProduct(product);
		RequestDispatcher rd;
		if(status) {
			request.setAttribute("msg", "Add Product Successfully");
			rd = request.getRequestDispatcher("index.jsp");
		}
		else {
			request.setAttribute("msg", "Try After sometime");
			rd = request.getRequestDispatcher("addProduct.jsp");
		}
		rd.forward(request, response);
	}
}