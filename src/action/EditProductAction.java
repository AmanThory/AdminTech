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
import dao.DAOFactory;

@WebServlet("/EditProductAction")
public class EditProductAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String UPLOAD_DIRECTORY = "upload";
	private static final int THRESHOLD_SIZE = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024*1024*50;

       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_name,category,price,stock,qty,epimage,offer;

		/*product_name = request.getParameter("epname");
		category     = request.getParameter("epcat");
		price    	 = request.getParameter("epprice");
		qty  		 = request.getParameter("equantity");
		stock 		 = request.getParameter("epstock");
		offer		 = request.getParameter("epoffer");
		image        = request.getParameter("epimage");
		
		System.out.println(product_name+" "+category+" "+price+" "+qty+" "+stock+" "+offer+" "+image);
		*/	
	
		DAOFactory dao  = DAOFactory.getDao();
		Product product = new Product();
		
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
				
				if(item.getFieldName().equals("epname"))
				{					
					product.setProduct_name(item.getString());
				}
				else if(item.getFieldName().equals("epcat")) {
					
					product.setCategory(item.getString());
				}
				else if(item.getFieldName().equals("epprice")) {
					
					product.setPrice(item.getString());
				}
				else if(item.getFieldName().equals("epstock")) {
					
					product.setStock(item.getString());
				}
				else if(item.getFieldName().equals("equantity")) {
					
					product.setQty(item.getString());
				}
				else if(item.getFieldName().equals("epoffer")) {
					
					product.setOffer(item.getString());
				}else if(item.getFieldName().equals("etimage")) {
					
					product.setImage(item.getString());
					System.out.println("this is image name "+product.getImage());
				}
				else if (!item.isFormField()/* || item.getFieldName().equals("epimage")*/) 
				{
					System.out.println("This is not formfield type");
					
					String fileName = new File(item.getName()).getName();
					if(fileName.trim().length() != 0) {
					product.setImage(fileName);
					String filePath = uploadPath + File.separator + fileName;
					File storeFile = new File(filePath);
					item.write(storeFile);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		int id = Integer.parseInt(request.getParameter("id"));
		product.setId(id);
		System.out.println(product.getId()); 
		boolean status = dao.updateProduct(product);
		RequestDispatcher rd;
		if(status) {
			request.setAttribute("msg", "Edit Product Successfully");
			rd = request.getRequestDispatcher("index.jsp");
		}
		else {
			request.setAttribute("msg", "Try After sometime");
			rd = request.getRequestDispatcher("addProduct.jsp");
		}
		rd.forward(request, response);
	}
	
}

