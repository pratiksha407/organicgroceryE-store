package com.oge.Organic.Grocery.Estore.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.oge.Organic.Grocery.Estore.filework.FileStorageService;
import com.oge.Organic.Grocery.Estore.model.Products;
import com.oge.Organic.Grocery.Estore.model.ImageModel;
import com.oge.Organic.Grocery.Estore.repository.ProductsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/project/")
public class ProductsController {
	@Autowired
	@Qualifier("proRepo")
	ProductsController proRepo;

	 @Autowired
	    private FileStorageService fileStorageService;

	 
	@RequestMapping("/products")
	public ArrayList<Products> getAll()
	{
		ArrayList<Products> ls=(ArrayList<Products>)proRepo.findAll();
		return ls;
		
	}
	@PostMapping(value= {"/product"},consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	public Products insertrecord(@RequestPart("products") Products e,@RequestPart("imageFile") MultipartFile[] files)
	{
		try {
			Set<ImageModel> images=uploadImages(files);
			e.setProductsImages(images);
			return proRepo.save(e);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return null;
		
	}
	public Set<ImageModel> uploadImages(MultipartFile[] files) throws Exception
	{
		Set<ImageModel> images=new HashSet<>();
		for(MultipartFile file:files)
		{
			ImageModel m=new ImageModel(file.getOriginalFilename(),file.getBytes());
			images.add(m);
			String fileName = fileStorageService.storeFile(file);
		}
		return images;
	}
	@DeleteMapping("/product/{id}")
	public void deletecourse(@PathVariable("id") long id)
	{
		proRepo.deleteById(id);
		
		
	}
	 @GetMapping("/downloadFile/{fileName:.+}")
	    public ResponseEntity < Resource > downloadFile(@PathVariable String fileName, HttpServletRequest request) throws FileNotFoundException {
	        // Load file as Resource
	        Resource resource = fileStorageService.loadFileAsResource(fileName);

	        // Try to determine file's content type
	        String contentType = null;
	        try {
	            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
	        } catch (IOException ex) {
	           
	        }

	        // Fallback to the default content type if type could not be determined
	        if (contentType == null) {
	            contentType = "application/octet-stream";
	        }

	        return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType(contentType))
	            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	            .body(resource);
	    }
}

